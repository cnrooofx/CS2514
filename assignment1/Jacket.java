/**
 * A light coat worn to stay warm.
 * 
 * @author Conor Fox (ID 119322236)
 */

public final class Jacket extends Coat {
    private static final String JACKET_NAME = "jacket";
    private static final Fabric JACKET_FABRIC = new Tweed( );
    private static final double JACKET_UNITS = 3.0;

    /**
     * Construct a new Jacket instance.
     */
    public Jacket( ) {
        super( JACKET_NAME, JACKET_FABRIC, JACKET_UNITS );
    }
}
