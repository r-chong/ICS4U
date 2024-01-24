/*
2024/01/17
TaxExpense.java
Child class that represents expenses related to taxes
*/

package Expense;
import Revenues.Revenue;
public class TaxExpense extends Expense {

    // Instance variables
    protected double taxPercent;
    
    // Constructor
    public TaxExpense(double taxPercent) {
        super(0); // Initial value, will be updated by calculateTotalExpenses
        this.taxPercent = taxPercent;
        calculateTotalExpenses(new Revenue(0)); // Assuming initial revenue is 0
    }
    
    // Getter and Setter methods
    public double getTaxPercent() {
        return taxPercent;
    }
    
    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    public String toString() {
        return super.toString() + " | Tax Percent: " + taxPercent + "%";
    }


    public static int myRandom(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom


    

    // Method to recalculate totalExpenses based on revenue
    public void calculateTotalExpenses(Revenue revenue) {
        setTotalExpenses((taxPercent / 100) * revenue.getTotalRevenue() * generateRandomExpensePerUnit());
    }

}//end class