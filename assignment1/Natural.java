/**
 * A type of Fabric made of natural materials.
 */

public abstract class Natural extends Fabric {
    private final String source;

    /**
     * Construct a new Natural fabric instance.
     * 
     * @param name The name of the Natural fabric.
     * @param costPerUnit The cost of the Natural fabric per unit
     * @param source The origin of the material for the Natural fabric
     */
    public Natural( final String name,
                    final double costPerUnit,
                    final String source ) {
        super( name, costPerUnit );
        this.source = source;
    }

    /**
     * Get the origin of this piece of Fabric
     * 
     * @return The source of the Fabric
     */
    public String getSource() {
        return this.source;
    }
}
