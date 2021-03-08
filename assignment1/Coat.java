public abstract class Coat extends Garment {
    public static final String COAT_PURPOSE
                    = "provides extra protection against the elements";

    public Coat( final String name,
                 final Fabric madeFrom,
                 final double numOfUnits) {
        super(name, COAT_PURPOSE, madeFrom, numOfUnits);
    }
}
