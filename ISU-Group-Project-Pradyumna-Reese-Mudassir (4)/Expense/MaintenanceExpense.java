/*
2024/01/17
MaintenanceExpense.java
Child class that represents expenses for maintenance and repair costs
*/



package Expense;
public class MaintenanceExpense extends Expense {
  
    // Instance variables
    protected double repairCost;
    
    // Constructor
    public MaintenanceExpense(double repairCost) {
        super(0); // Initial value, will be updated by calculateTotalExpenses
        this.repairCost = repairCost;
        calculateTotalExpenses();
    }
    
    // Getter and Setter methods
    public double getRepairCost() {
        return repairCost;
    }
    
    public void setRepairCost(double repairCost) {
        this.repairCost = repairCost;
    }

    public String toString() {
        return super.toString() + " | Repair Cost: $" + repairCost;
    }

    // Method to recalculate totalExpenses
    public void calculateTotalExpenses() {
        setTotalExpenses(repairCost * generateRandomExpensePerUnit());
    }

    public static int myRandom(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom

}//end class