public abstract class Trousers extends Garment {
    private static final String TROUSERS_PURPOSE = "cover the legs";

    public Trousers( final String name,
                     final Fabric madeFrom,
                     final double numOfUnits ) {
        super( name, TROUSERS_PURPOSE, madeFrom, numOfUnits );
    }
}
