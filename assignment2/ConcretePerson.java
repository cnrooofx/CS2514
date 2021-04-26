import java.util.List;
import java.util.ArrayList;

/**
 * Concrete implementation of the Person interface.
 * 
 * @author Conor Fox (ID 119322236)
 */
public final class ConcretePerson implements Person {
    private final String name;
    private double earnings = 0.0;
    private final List<Book> booksOwned = new ArrayList<Book>();

    public ConcretePerson(final String name) {
        this.name = name;
    }

    @Override
    public void receive(final double x) {
        this.earnings += x;
    }

    @Override
    public void charge(final double x) {
        this.earnings -= x;
    }

    @Override
    public void buy(final Book b) {
        final double price = b.getPrice();
        if (this.earnings >= price) {
            this.charge(price);
            this.booksOwned.add(b);
            final Author author = b.getAuthor();
            author.receive(price * 0.10);
        } else {
            System.out.println("You don't have enough money to buy");
            System.out.println("   " + b);
        }
    }

    @Override
    public void printBooksOwned() {
        if (! booksOwned.isEmpty()) {
            System.out.println(this + " owns:");
            for (Book book : this.booksOwned) {
                System.out.println("   " + book.getTitle());
            }
        } else {
            System.out.println(this + " doesn't own any books");
        }
    }

    @Override
    public double getEarnings() {
        return this.earnings;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
