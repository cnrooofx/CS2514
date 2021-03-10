/**
 * A type of Fabric made of synthetic materials.
 * 
 * @author Conor Fox (ID 119322236)
 */

public abstract class Synthetic extends Fabric {
    /** The amount of environment tax on synthetic fabric. */
    public static final double ENVIRONMENT_TAX = 2.0;
    
    /**
     * Construct a new Synthetic fabric instance.
     * 
     * @param name The name of the Synthetic fabric
     * @param costPerUnit The cost of the Sythetic fabric per unit
     */
    public Synthetic( final String name, final double costPerUnit ) {
        super( name, costPerUnit );
    }

    /**
     * Get the amount of environment tax due on this Fabric.
     * 
     * @return The Environment Tax value
     */
    public double getEnvironmentTax( ) {
        return ENVIRONMENT_TAX;
    }
}
