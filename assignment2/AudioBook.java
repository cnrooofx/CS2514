public class AudioBook implements Book {
    private static final double AUDIOBOOK_COST = 15.0;
    private final Book book;
    private final double duration;

    public AudioBook(final Author author,
                     final Title title,
                     final double duration) {
        this.book = new ConcreteBook(author, title, AUDIOBOOK_COST);
        this.duration = duration;
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

    public double getDuration() {
        return this.duration;
    }

    @Override
    public String toString() {
        String bookString = "AudioBook[ ";
        bookString += "author = " + this.getAuthor();
        bookString += ", title = " + this.getTitle();
        bookString += ", price = " + this.getPrice();
        bookString += ", duration = " + this.duration + " ]";
        return bookString;
    }
}
