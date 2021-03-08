/**
 * A Garment that represents an item of clothing.
 * 
 * @author Conor Fox (ID 119322236)
 */

public abstract class Garment {
    private final String name;
    private final String purpose;
    private final Fabric madeFrom;
    private final double numUnits;

    /**
     * 
     * 
     * @param name The name of the Garment
     * @param purpose The purpose of the Garment
     * @param madeFrom The Fabric that the Garment is made of
     * @param numUnits The number of Fabric units to make the Garment
     */
    public Garment( final String name,
                    final String purpose,
                    final Fabric madeFrom,
                    final double numUnits ) {
        this.name = name;
        this.purpose = purpose;
        this.madeFrom = madeFrom;
        this.numUnits = numUnits;
    }

    /**
     * Get the name of this Garment piece.
     * 
     * @return The name of this Garment instance
     */
    public String getName() {
        return name;
    }

    /**
     * Print a description of this Garment piece.
     */
    public void printPurpose() {
        System.out.println( name + " " + purpose);
    }

    /**
     * Print a bill summing up the total cost of this Garment.
     */
    public void printItemisedBill() {
        System.out.println("Itemised bill for " + name);

        Double environmentTax;
        String fabricName = madeFrom.getName();
        String summary = "Made of " + numUnits
                             + " units of " + fabricName;

        if (madeFrom instanceof Natural) {
            final Natural madeFromNatural = (Natural)this.madeFrom;
            String source = madeFromNatural.getSource();
            summary += " made from " + source;

            environmentTax = 0.0;
        } else {
            final Synthetic madeFromSynthetic = (Synthetic)this.madeFrom;
            environmentTax = madeFromSynthetic.getEnvironmentTax();
        }
        System.out.println(summary);

        // Environment Tax
        double totalTax = environmentTax * numUnits;
        System.out.println(" environment tax: " + environmentTax
                           + " * " + numUnits + " = " + totalTax);

        // Base Price
        double unitCost = madeFrom.getUnitCost();
        double basePrice = unitCost * numUnits;
        System.out.println("      base price: " + unitCost + " * "
                              + numUnits + " = " + basePrice);
        
        // Grand Total
        double totalPrice = environmentTax + unitCost;
        double grandTotal = totalPrice * numUnits;
        System.out.println("     grand total: " + totalPrice + " * "
                           + numUnits + " = " + grandTotal);
    }

    /**
     * Returns a description of the Garment.
     * 
     * @return A string describing the Garment
     */
    @Override
    public String toString() {
        return "Garment: " + name;
    }
}
