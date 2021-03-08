/**
 * A Coat to be worn during the winter.
 */

public final class WinterCoat extends Coat {
    private static final String WINTERCOAT_NAME = "winter coat";
    private static final Fabric WINTERCOAT_FABRIC = new Polyester( );
    private static final double WINTERCOAT_UNITS = 3.0;

    /**
     * Construct a new WinterCoat instance.
     */
    public WinterCoat() {
        super( WINTERCOAT_NAME, WINTERCOAT_FABRIC, WINTERCOAT_UNITS );
    }
}
