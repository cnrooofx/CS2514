/**
 * A garment of clothing that is a T-Shirt. 
 */

public final class TShirt extends Shirt {
    private static final String TSHIRT_NAME = "t-shirt";
    private static final Fabric TSHIRT_FABRIC = new Cotton( );
    private static final double TSHIRT_UNITS = 1.5;

    /**
     * Construct a new TShirt instance.
     */
    public TShirt() {
        super( TSHIRT_NAME, TSHIRT_FABRIC, TSHIRT_UNITS );
    }
}
