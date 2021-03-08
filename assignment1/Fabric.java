public abstract class Fabric {
    public final double costPerUnit;

    public Fabric( final double costPerUnit ) {
        this.costPerUnit = costPerUnit;
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
