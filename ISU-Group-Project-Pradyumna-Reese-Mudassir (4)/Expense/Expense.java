/*
2024/01/17
Expense.java
Parent class that represents an abstract class for managing expenses
*/


package Expense;
public class Expense {

    // Instance variables
    protected double totalExpenses;
    
    // Constructor
    public Expense(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }
    
    // Getter and Setter methods
    public double getTotalExpenses() {
        return totalExpenses;
    }
    
    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }
    
    public String toString() {
        return "Total Expenses: $" + totalExpenses;
    }

    public static int myRandom(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom

    // Update method to recalculate totalExpenses based on child class expenses
    public void calculateTotalExpenses() {
        // This method can be overridden by each child class
    }

    // Add this method to the Expense class
    public double generateRandomExpensePerUnit() {
        return myRandom(10000, 50000); // You can adjust the range as needed
    }
    
  
}//end class

