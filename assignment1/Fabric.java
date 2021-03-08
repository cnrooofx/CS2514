public abstract class Fabric {
    public final String name;
    public final double costPerUnit;

    public Fabric( final String name, final double costPerUnit ) {
        this.name = name;
        this.costPerUnit = costPerUnit;
    }

    /**
     * Get the name of this piece of Fabric
     * 
     * @return The name of the Fabric
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the cost per unit of this piece of Fabric
     * 
     * @return Cost per unit of the Fabric
     */
    public double getUnitCost() {
        return this.costPerUnit;
    }
}
