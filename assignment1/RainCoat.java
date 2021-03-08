/**
 * A coat to wear when it is raining.
 */

public final class RainCoat extends Coat {
    private static final String RAINCOAT_NAME = "rain coat";
    private static final Fabric RAINCOAT_FABRIC = new Acrylic( );
    private static final double RAINCOAT_UNITS = 3.0;

    /**
     * Construct a new RainCoat instance.
     */
    public RainCoat() {
        super( RAINCOAT_NAME, RAINCOAT_FABRIC, RAINCOAT_UNITS );
    }
}
