/**
 * A printed book with a durable cover.
 * 
 * @author Conor Fox (ID 119322236)
 */
public class Hardback implements PrintedBook {
    private static final double HARDBACK_COST = 12.0;
    private final PrintedBook book;

    public Hardback(final Author author,
                    final Title title,
                    final int pageCount) {
        this.book = new ConcretePrintedBook(author, title, HARDBACK_COST,
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
        String bookString = "Hardback[ ";
        bookString += "author = " + this.getAuthor();
        bookString += ", title = " + this.getTitle();
        bookString += ", price = " + this.getPrice();
        bookString += ", page count = " + this.getPageCount() + " ]";
        return bookString;
    }
}
