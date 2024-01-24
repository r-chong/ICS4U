/*
2024/01/17
WagesExpense.java
Child class that represents expenses for wages owed
*/

package Expense;
public class WagesExpense extends Expense {

    // Instance variables
    protected double wagesOwed;

    // Constructor
    public WagesExpense(double wagesOwed) {
        super(0); // Initial value, will be updated by calculateTotalExpenses
        this.wagesOwed = wagesOwed;
        calculateTotalExpenses();
    }

    // Getter and Setter methods
    public double getWagesOwed() {
        return wagesOwed;
    }

    public void setWagesOwed(double wagesOwed) {
        this.wagesOwed = wagesOwed;
    }

    public String toString() {
        return super.toString() + " | Wages Owed: $" + wagesOwed;
    }

    public static int myRandom(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom


    // Method to recalculate totalExpenses
    public void calculateTotalExpenses() {
        setTotalExpenses(wagesOwed * generateRandomExpensePerUnit());
    }

}//end class