/**
 * A type of fabric that is made from Acrylic.
 * 
 * @author Conor Fox (ID 119322236)
 */

public class Acrylic extends Synthetic {
    /** The name of acrylic. */
    public static final String ACRYLIC_NAME = "acrylic";
    /** The cost per unit of acrylic fabric. */
    public static final double ACRYLIC_COST = 6.0;

    /**
     * Construct a new Acrylic fabric instance.
     */
    public Acrylic( ) {
        super( ACRYLIC_NAME, ACRYLIC_COST );
    }
}
