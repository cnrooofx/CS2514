public final class Jeans extends Trousers {
    private static final String JEANS_NAME = "jeans";
    private static final Fabric JEANS_FABRIC = new Cotton( );
    private static final double JEANS_UNITS = 2.0;
    
    public Jeans( ) {
        super( JEANS_NAME, JEANS_FABRIC, JEANS_UNITS );
    }
}
