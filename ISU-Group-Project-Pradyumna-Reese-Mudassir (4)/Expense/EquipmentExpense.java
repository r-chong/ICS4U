/*
 2024/01/17
 EquipmentExpense.java
 Child class that represents expenses for equipment needed for the University
*/

package Expense;

public class EquipmentExpense extends Expense {

    // Instance variables
    protected int labEquipment;
    protected int classSupplies;

    // Constructor
    public EquipmentExpense(int labEquipment, int classSupplies) {
        super(0); // Initial value, will be updated by calculateTotalExpenses
        this.labEquipment = labEquipment;
        this.classSupplies = classSupplies;
        calculateTotalExpenses();
    }

    // Getter and Setter methods
    public int getLabEquipment() {
        return labEquipment;
    }

    public void setLabEquipment(int labEquipment) {
        this.labEquipment = labEquipment;
    }

    public int getClassSupplies() {
        return classSupplies;
    }

    public void setClassSupplies(int classSupplies) {
        this.classSupplies = classSupplies;
    }

    public String toString() {
        return super.toString() + " | Lab Equipment: " + labEquipment + " | Class Supplies: " + classSupplies;
    }

    public void calculateTotalExpenses() {
        double totalExpense = 0;
        totalExpense += labEquipment * generateRandomExpensePerUnit();
        totalExpense += classSupplies * generateRandomExpensePerUnit();
        setTotalExpenses(totalExpense);
    }

    public static int myRandom(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom

    


    
}// end class
