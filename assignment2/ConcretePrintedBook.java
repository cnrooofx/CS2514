/**
 * Concrete implementation of the PrintedBook interface.
 * 
 * @author Conor Fox (ID 119322236)
 */
public final class ConcretePrintedBook implements PrintedBook {
    private final Book book;
    private final int pageCount;

    public ConcretePrintedBook(final Author author,
                                final Title title,
                                final double price,
                                final int pageCount) {
        this.book = new ConcreteBook(author, title, price);
        this.pageCount = pageCount;
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
        return this.pageCount;
    }

    @Override
    public String toString() {
        return book.toString();
    }
}
