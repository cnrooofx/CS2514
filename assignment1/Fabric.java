/**
 * A piece of Fabric to make clothes from.
 * 
 * @author Conor Fox (ID 119322236)
 */

public abstract class Fabric {
    private final String name;
    private final double costPerUnit;

    /**
     * Construct a new Fabric instance.
     * 
     * @param name The name of the Fabric
     * @param costPerUnit The cost of each unit of Fabric
     */
    public Fabric( final String name, final double costPerUnit ) {
        this.name = name;
        this.costPerUnit = costPerUnit;
    }

    /**
     * Get the name of this piece of Fabric.
     * 
     * @return The name of the Fabric
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the cost per unit of this piece of Fabric.
     * 
     * @return Cost per unit of the Fabric
     */
    public double getUnitCost() {
        return this.costPerUnit;
    }

    /**
     * Returns a description of the Garment.
     * 
     * @return A string describing the Garment
     */
    @Override
    public String toString() {
        return "Fabric: " + name;
    }
}
