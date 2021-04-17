import java.util.List;
import java.util.ArrayList;

public enum Author implements Person {
    JJR_Tolkien("JJR Tolkien"),
    JD_Sallinger("JD Sallinger");

    private final String name;
    private final List<Book> publishedBooks = new ArrayList<Book>();
    private final List<Book> ownedBooks = new ArrayList<Book>();
    private double earnings = 0.0;

    private Author(final String name) {
        this.name = name;
    }

    @Override
    public void charge(final double x) {
        this.earnings -= x;
    }

    @Override
    public void receive(final double x) {
        this.earnings += x;
    }

    @Override
    public void buy(final Book b) {
        final double price = b.getPrice();
        if (this.earnings >= price) {
            this.charge(price);
            this.ownedBooks.add(b);
            final Author author = b.getAuthor();
            author.receive(price * 0.10);
        } else {
            System.out.println("You don't have enough money to buy");
            System.out.println("    " + b);
        }
    }

    public void publish(Book book) {
        this.publishedBooks.add(book);
    }

    @Override
    public void printBooksOwned() {
        for (Book book : this.ownedBooks) {
            System.out.println(book);
        }
    }

    public void printBooksPublished() {
        for (Book book : this.ownedBooks) {
            System.out.println(book);
        }
    }

    public double getEarnings() {
        return this.earnings;
    }
}
