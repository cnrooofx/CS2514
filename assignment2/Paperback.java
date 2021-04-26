/**
 * A standard paper covered book.
 * 
 * @author Conor Fox (ID 119322236)
 */
public class Paperback implements PrintedBook {
    private static final double PAPERBACK_COST = 10.0;
    private final PrintedBook book;

    public Paperback(final Author author,
                     final Title title,
                     final int pageCount) {
        this.book = new ConcretePrintedBook(author, title, PAPERBACK_COST,
                                            pageCount);
    }

    @Override
    public Title getTitle() {
        return book.getTitle();
    }

    @Override
    public Author getAuthor() {
        return book.getAuthor();
    }

    @Override
    public double getPrice() {
        return book.getPrice();
    }

    @Override
    public int getPageCount() {
        return book.getPageCount();
    }

    @Override
    public String toString() {
        String bookString = "Paperback[ ";
        bookString += "author = " + this.getAuthor();
        bookString += ", title = " + this.getTitle();
        bookString += ", price = " + this.getPrice();
        bookString += ", page count = " + this.getPageCount() + " ]";
        return bookString;
    }
}
