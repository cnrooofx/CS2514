/**
 * A type of fabric that is made from polyester.
 * 
 * @author Conor Fox (ID 119322236)
 */

public final class Polyester extends Synthetic {
    private static final String POLYESTER_NAME = "polyester";
    private static final double POLYESTER_COST = 5.0;

    /**
     * Construct a new Polyester fabric instance.
     */
    public Polyester( ) {
        super( POLYESTER_NAME, POLYESTER_COST );
    }
}
