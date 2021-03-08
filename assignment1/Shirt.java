/**
 * A garment of clothing that is a Shirt.
 * 
 * @author Conor Fox (ID 119322236)
 */

public abstract class Shirt extends Garment {
    /** The purpose of a shirt. */
    private static final String SHIRT_PURPOSE = "covers the body";

    /**
     * Construct a new Shirt instance.
     * 
     * @param name The name of the Shirt
     * @param madeFrom The Fabric that the Shirt is made of
     * @param numUnits The number of units of Fabric to make the Shirt
     */
    public Shirt( final String name,
                  final Fabric madeFrom,
                  final double numUnits ) {
        super( name, SHIRT_PURPOSE, madeFrom, numUnits );
    }
}
