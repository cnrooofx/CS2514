import java.util.List;
import java.util.ArrayList;

public class Reader implements Person {
    private final String name;
    private double money = 0.0;
    private final List<Book> books = new ArrayList<Book>();

    public Reader(final String firstName, final String lastName) {
        this.name = firstName + " " + lastName;
    }

    @Override
    public void receive(final double x) {
        this.money += x;
    }

    @Override
    public void charge(final double x) {
        this.money -= x;
    }

    @Override
    public void buy(Book b) {
        final double price = b.getPrice();
        if (this.money >= price) {
            this.charge(price);
            this.books.add(b);
            final Author author = b.getAuthor();
            author.receive(price * 0.10);
        } else {
            System.out.println("You don't have enough money to buy");
            System.out.println("    " + b);
        }
    }

    @Override
    public void printBooksOwned() {
        if (books.isEmpty()) {
            System.out.println(this + " doesn't own any books");
        } else {
            System.out.println(this + " owns:");
            for (Book book : this.books) {
                System.out.println("    " + book);
            }
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
