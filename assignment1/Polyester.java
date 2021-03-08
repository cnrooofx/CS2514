/**
 * A type of fabric that is made from Polyester.
 * 
 * @author Conor Fox (ID 119322236)
 */

public class Polyester extends Synthetic {
    /** The name of polyester. */
    public static final String POLYESTER_NAME = "polyester";
    /** The cost per unit of polyester fabric. */
    public static final double POLYESTER_COST = 5.0;

    /**
     * Construct a new Polyester fabric instance.
     */
    public Polyester( ) {
        super( POLYESTER_NAME, POLYESTER_COST );
    }
}
