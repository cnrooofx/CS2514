/**
 * A Garment that represents a piece of clothing
 * 
 * @author Conor Fox (ID 119322236)
 */

public abstract class Garment {
    private final String name;
    private final String purpose;
    private final Fabric madeFrom;
    private final double numOfUnits;

    public Garment( final String name,
                    final String purpose,
                    final Fabric madeFrom,
                    final double numOfUnits ) {
        this.name = name;
        this.purpose = purpose;
        this.madeFrom = madeFrom;
        this.numOfUnits = numOfUnits;
    }

    /**
     * Get the name of this Garment instance.
     * @return The name of this Garment instance.
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
        String unitString = Double.toString(numOfUnits);
        String fabricName = madeFrom.getName();
        String summary = "Made of " + unitString
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

        double totalTax = environmentTax * numOfUnits;
        String totalTaxString = Double.toString(totalTax);
        String environmentTaxString = Double.toString(environmentTax);
        System.out.println(" environment tax: " + environmentTaxString
                           + " * " + unitString + " = " + totalTaxString);

        double unitCost = madeFrom.getUnitCost();
        double basePrice = unitCost * numOfUnits;
        String unitCostString = Double.toString(unitCost);
        String basePriceString = Double.toString(basePrice);
        System.out.println("      base price: " + unitCostString + " * "
                            + unitString + " = " + basePriceString);
        
        double totalPrice = environmentTax + unitCost;
        double grandTotal = totalPrice * numOfUnits;
        String totalPriceString = Double.toString(totalPrice);
        String grandTotalString = Double.toString(grandTotal);
        System.out.println("     grand total: " + totalPriceString + " * "
                           + unitString + " = " + grandTotalString);
        
    }
}
