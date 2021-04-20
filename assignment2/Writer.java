/**
 * A person who can write books.
 * 
 * @author Conor Fox (ID 119322236)
 */
public interface Writer extends Person {
    public void printBooksPublished();
    public void publishBook(Book b);
}
