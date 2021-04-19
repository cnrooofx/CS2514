import java.util.List;
import java.util.ArrayList;

public enum Author implements Writer {
    JJR_Tolkien("JJR Tolkien"),
    JD_Sallinger("JD Sallinger");

    final Person person;
    private final List<Book> publishedBooks = new ArrayList<Book>();

    private Author(final String name) {
        this.person = ConcretePerson.create(name);
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
    public void buy(Book b) {
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
        if (this.publishedBooks.isEmpty()) {
            System.out.println(this + " hasn't published any books");
        } else {
            for (Book book : this.publishedBooks) {
                System.out.println("    " + book);
            }
        }
    }
}
