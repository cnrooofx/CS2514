public class Reader {
    private final Person person;

    public Reader(final String firstName, final String lastName) {
        final String name = firstName + " " + lastName;
        this.person = ConcretePerson.create(name);
    }

    public void receive(final double x) {
        person.receive(x);
    }

    public void charge(final double x) {
        person.charge(x);
    }

    public void buy(Book b) {
        person.buy(b);
    }

    public void printBooksOwned() {
        person.printBooksOwned();
    }

    public double getEarnings() {
        return person.getEarnings();
    }

    public String toString() {
        return person.toString();
    }
}
