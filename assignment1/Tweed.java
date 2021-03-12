/**
 * A type of fabric that is made from tweed.
 * 
 * @author Conor Fox (ID 119322236)
 */

public final class Tweed extends Natural {
    private static final String TWEED_NAME = "tweed";
    private static final double TWEED_COST = 3.0;
    private static final String TWEED_SOURCE = "wool";

    /**
     * Construct a new Tweed fabric instance.
     */
    public Tweed( ) {
        super( TWEED_NAME, TWEED_COST, TWEED_SOURCE );
    }
}
