/*
2024/01/17
MortgageExpense.java
Child class that represents expenses related to mortgage revenue
*/


package Expense;
public class MortgageExpense extends Expense {

    // Instance variables
    protected double mortgageRevenue;
    
    // Constructor
    public MortgageExpense(double mortgageRevenue) {
        super(0); // Initial value, will be updated by calculateTotalExpenses
        this.mortgageRevenue = mortgageRevenue;
        calculateTotalExpenses();
    }
    
    // Getter and Setter methods
    public double getMortgageRevenue() {
        return mortgageRevenue;
    }
    
    public void setMortgageRevenue(double mortgageRevenue) {
        this.mortgageRevenue = mortgageRevenue;
    }

    public String toString() {
        return super.toString() + " | Mortgage Revenue: $" + mortgageRevenue;
    }

    public static int myRandom(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom

    // Method to recalculate totalExpenses
    public void calculateTotalExpenses() {
        setTotalExpenses(mortgageRevenue * generateRandomExpensePerUnit());
    }

}//end class