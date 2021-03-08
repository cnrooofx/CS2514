public abstract class Synthetic extends Fabric {
    public static final double ENVIRONMENT_TAX = 2.0;
    
    public Synthetic( final String name, final double costPerUnit ) {
        super( name, costPerUnit );
    }

    /**
     * Get the amount of environment tax due on this Fabric
     * 
     * @return Environment Tax value
     */
    public double getEnvironmentTax() {
        return ENVIRONMENT_TAX;
    }
}
