public final class TShirt extends Shirt {
    private static final String TSHIRT_NAME = "t-shirt";
    private static final Fabric TSHIRT_FABRIC = new Cotton( );
    private static final double TSHIRT_UNITS = 1.5;

    public TShirt() {
        super( TSHIRT_NAME, TSHIRT_FABRIC, TSHIRT_UNITS );
    }
}
