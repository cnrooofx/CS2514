import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final List<Garment> items = new ArrayList<Garment>();
        items.add( new Jeans( ) );

        for (Garment item : items) {
            item.printPurpose();
        }

        System.out.println();

        for (Garment item : items) {
            item.printItemisedBill();
        }
    }
}
