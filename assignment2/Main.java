/**
 * Test for all the methods for the classes.
 * 
 * @author Conor Fox (ID 119322236)
 */
public class Main {
    public static void main(String[] args) {
        final Title t1 = new Title("The Hobbit", "An Unexpected Journey");  // create title #1: main title and subtitle
        final Title t2 = new Title("Catcher in the Rye");                   // create title #2: main title only
        final Author a1 = Author.JJR_Tolkien;                               // ‘‘create’’ author #1
        final Author a2 = Author.JD_Sallinger;                              // ‘‘create’’ author #2
        final Book b1 = new AudioBook(a1, t1, 1800.5);                      // create and publish book #1
        final Book b2 = new Paperback(a2, t2, 100);                         // create and publish book #2
        final Reader r1 = new Reader("Joe", "Soap");                        // create reader #1

        a1.receive(100);  // author #1 receives some money to spend
        a1.buy(b2);       // author #1 buys book worth 10 Euro
        r1.buy(b1);       // reader #1 tries to buy book worth 15 Euro: fails
        r1.receive(100);  // reader #1 receives some money to spend
        r1.buy(b1);       // reader #1 buys book worth 15 Euro: now works
        r1.buy(b2);       // reader #1 buys book worth 10 Euro
        a1.printBooksOwned();
        a1.printBooksPublished();
        r1.printBooksOwned();
        // a1 owns 100 - 10 + 0.10 * 15 = 91.5 Euro
        System.out.println(a1 + " owns " + a1.getEarnings() + " Euro");

        System.out.println("\n-----\n");

        final Reader r2 = new Reader("Jill", "Soap");
        final Author a3 = Author.George_Orwell;
        a3.printBooksPublished(); // hasn't published any
        r2.printBooksOwned();     // doesn't own any

        final Title t3 = new Title("Nineteen Eighty-Four");
        final Book b3 = new Hardback(a3, t3, 350);
        final Title t4 = new Title("Animal Farm", "A Fairy Story");
        final Book b4 = new Paperback(a3, t4, 150);

        a3.printBooksPublished();
        r2.receive(20);
        r2.buy(b4);
        r2.buy(b3);     // doesn't have enough money to buy
        r2.receive(20);
        r2.buy(b3);
        r2.buy(b1);
        System.out.println(a1 + " owns " + a3.getEarnings() + " Euro");
        r2.printBooksOwned();

    }
}
