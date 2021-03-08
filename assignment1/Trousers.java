/**
 * A garment of clothing that is Trousers.
 * 
 * @author Conor Fox (ID 119322236)
 */

public abstract class Trousers extends Garment {
    /** The purpose of trousers. */
    private static final String TROUSERS_PURPOSE = "covers the legs";

    /**
     * Construct a new Trousers instance.
     * 
     * @param name The name of the Trousers
     * @param madeFrom The Fabric that the trousers are made of
     * @param numUnits The number of units of Fabric to make trousers
     */
    public Trousers( final String name,
                     final Fabric madeFrom,
                     final double numUnits ) {
        super( name, TROUSERS_PURPOSE, madeFrom, numUnits );
    }
}
