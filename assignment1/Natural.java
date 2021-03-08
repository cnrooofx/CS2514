public abstract class Natural extends Fabric {
    private final String source;

    public Natural( final double costPerUnit, final String source ) {
        super(costPerUnit);
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
