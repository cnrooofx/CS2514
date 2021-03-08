/**
 * A type of fabric that is made from Tweed.
 */

public class Tweed extends Natural {
    /** The name of tweed. */
    private static final String TWEED_NAME = "tweed";
    /** The cost per unit of tweed fabric. */
    private static final double TWEED_COST = 3.0;
    /** The origin source of wool. */
    private static final String TWEED_SOURCE = "wool";

    /**
     * Construct a new Tweed fabric instance.
     */
    public Tweed( ) {
        super( TWEED_NAME, TWEED_COST, TWEED_SOURCE );
    }
}
