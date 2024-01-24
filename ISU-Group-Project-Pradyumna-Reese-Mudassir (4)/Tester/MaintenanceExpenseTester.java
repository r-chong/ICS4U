/*
2024-01-17
Tester class for MaintaninceExpenss
*/ 

import Expense.*;

public class MaintenanceExpenseTester {
    public static void main(String[] args) {
      
        //MaintainceExpense Object
        MaintenanceExpense maintenanceExpense = new MaintenanceExpense(1000);

        // Display initial state
        System.out.println("Initial Maintenance Expense:");
        System.out.println(maintenanceExpense);

        // Update value
        maintenanceExpense.setRepairCost(500);
        maintenanceExpense.calculateTotalExpenses();

        // Display updated state
        System.out.println("\nUpdated Maintenance Expense:");
        System.out.println(maintenanceExpense);
    }
}//end class