import java.util.List;
import java.util.ArrayList;

/**
 * Authors who can write books.
 * 
 * @author Conor Fox (ID 119322236)
 */
public enum Author implements Writer {
    JJR_Tolkien("JJR Tolkien"),
    JD_Sallinger("JD Sallinger"),
    George_Orwell("George Orwell");

    final Person person;
    private final List<Book> publishedBooks = new ArrayList<Book>();

    private Author(final String name) {
        this.person = new ConcretePerson(name);
    }

    @Override
    public void receive(final double x) {
        person.receive(x);
    }

    @Override
    public void charge(final double x) {
        person.charge(x);
    }

    @Override
    public void buy(final Book b) {
        person.buy(b);
    }

    @Override
    public void printBooksOwned() {
        person.printBooksOwned();
    }

    @Override
    public double getEarnings() {
        return person.getEarnings();
    }

    @Override
    public String toString() {
        return person.toString();
    }

    @Override
    public void publishBook(final Book b) {
        this.publishedBooks.add(b);
    }

    @Override
    public void printBooksPublished() {
        if (! this.publishedBooks.isEmpty()) {
            System.out.println(this + " published:");
            for (Book book : this.publishedBooks) {
                System.out.println("   " + book.getTitle());
            }
        } else {
            System.out.println(this + " hasn't published any books");
        }
    }
}
