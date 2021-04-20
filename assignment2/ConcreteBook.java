/**
 * Concrete implementation of the Book interface.
 * 
 * @author Conor Fox (ID 119322236x)
 */
public final class ConcreteBook implements Book {
    private final Author author;
    private final Title title;
    private final double price;

    public ConcreteBook(final Author author,
                        final Title title,
                        final double price) {
        this.author = author;
        this.title = title;
        this.price = price;

        author.publishBook(this);
    }

    @Override
    public Title getTitle() {
        return this.title;
    }

    @Override
    public Author getAuthor() {
        return this.author;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        String bookString = "Book[ ";
        bookString += "author = " + this.author;
        bookString += ", title = " + this.title;
        bookString += ", price = " + this.price + " ]";
        return bookString;
    }
}
