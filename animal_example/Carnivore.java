
public class Carnivore extends Animal {
    private static final String DEFAULT_FOOD = "raw meat";
    private static int instanceCount = 0;

    public Carnivore( final String name ) {
        this( name, DEFAULT_FOOD );
    }

    public Carnivore( final String name, final String food ) {
        super( name, food );
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
