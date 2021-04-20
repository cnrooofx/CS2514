/**
 * A person who buys and reads books.
 * 
 * @author Conor Fox (ID 119322236)
 */
public class Reader implements Person {
    private final Person person;

    public Reader(final String firstName, final String lastName) {
        final String name = firstName + " " + lastName;
        this.person = new ConcretePerson(name);
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
}
