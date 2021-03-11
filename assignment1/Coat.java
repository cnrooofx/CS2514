/**
 * A garment of clothing that is a Coat.
 * 
 * @author Conor Fox (ID 119322236)
 */

public abstract class Coat extends Garment {
    private static final String COAT_PURPOSE
                    = "provides extra protection against the elements";

    /**
     * Construct a new Coat instance.
     * 
     * @param name The name of the Coat.
     * @param madeFrom The Fabric that the coat is made from
     * @param numUnits The number of units of Fabric to make the coat
     */
    public Coat( final String name,
                 final Fabric madeFrom,
                 final double numUnits ) {
        super( name, COAT_PURPOSE, madeFrom, numUnits );
    }
}
