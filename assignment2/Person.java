/**
 * A Person who can buy and own books.
 * 
 * @author Conor Fox (ID 119322236)
 */
public interface Person {
    public void receive(double x);
    public void charge(double x);
    public void buy(Book b);
    public void printBooksOwned();
    public double getEarnings();
}
