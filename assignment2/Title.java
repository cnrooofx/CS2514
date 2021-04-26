/**
 * The title of a book, optionally with a subtitle.
 * 
 * @author Conor Fox (ID 119322236)
 */
public final class Title {
    private final String bookTitle;
    
    public Title(final String title, final String subtitle) {
        this.bookTitle = title + " / " + subtitle;
    }

    public Title(final String title) {
        this.bookTitle = title;
    }

    @Override
    public final String toString() {
        return this.bookTitle;
    }
}
