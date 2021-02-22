/**
 * Garment
 * @author Conor Fox (ID 119322236)
 */

public class Garment {
    private final String name;
    private final String purpose;

    public Garment( final String name ) {
        this.name = name;
    }

    /**
     * Get the name of this Garment instance.
     * 
     * @return The name of this Garment instance.
     */
    public String getName() {
        return name;
    }

    public void printPurpose() {
        System.out.println( name + " " + purpose);
    }
}
