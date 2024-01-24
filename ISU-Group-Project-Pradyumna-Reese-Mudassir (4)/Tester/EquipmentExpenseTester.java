/*
2024-01-17
Tester class for equipmentExpense
*/

import Expense.*;

public class EquipmentExpenseTester {
    public static void main(String[] args) {
      
        // EquiptmentExpence Instance
        EquipmentExpense equipmentExpense = new EquipmentExpense(5000, 2000);

        // Display initial state
        System.out.println("Initial Equipment Expense: \n");
        System.out.println(equipmentExpense);

        // Update values
        equipmentExpense.setLabEquipment(3000);
        equipmentExpense.setClassSupplies(1500);
        equipmentExpense.calculateTotalExpenses();

        // Display updated state
        System.out.println("\nUpdated Equipment Expense:");
        System.out.println(equipmentExpense);
    }
}//end class