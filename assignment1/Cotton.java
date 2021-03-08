/**
 * A type of fabric that is made from Cotton.
 */

public class Cotton extends Natural {
    /** The name of cotton. */
    private static final String COTTON_NAME = "cotton";
    /** The cost per unit of cotton fabric. */
    private static final double COTTON_COST = 2.0;
    /** The origin source of cotton. */
    private static final String COTTON_SOURCE = "Gossypium";

    /**
     * Construct a new Cotton fabric instance.
     */
    public Cotton( ) {
        super( COTTON_NAME, COTTON_COST, COTTON_SOURCE );
    }
}
