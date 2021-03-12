/**
 * A type of fabric that is made from cotton.
 * 
 * @author Conor Fox (ID 119322236)
 */

public final class Cotton extends Natural {
    private static final String COTTON_NAME = "cotton";
    private static final double COTTON_COST = 2.0;
    private static final String COTTON_SOURCE = "Gossypium";

    /**
     * Construct a new Cotton fabric instance.
     */
    public Cotton( ) {
        super( COTTON_NAME, COTTON_COST, COTTON_SOURCE );
    }
}
