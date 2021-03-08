public abstract class Shirt extends Garment {
    private static final String SHIRT_PURPOSE = "cover the body";

    public Shirt( final String name,
                  final Fabric madeFrom,
                  final double numOfUnits ) {
        super( name, SHIRT_PURPOSE, madeFrom, numOfUnits );
    }
}
