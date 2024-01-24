/*
2024-01-17
Tester class for TaxExpense
*/

import Expense.*;
import Revenues.Revenue;

public class TaxExpenseTester {
    public static void main(String[] args) {
        TaxExpense taxExpense = new TaxExpense(15);

        // Display initial state
        System.out.println("Initial Tax Expense:");
        System.out.println(taxExpense);

        // Create a Revenue instance with an initial value
        Revenue initialRevenue = new Revenue(10000); // Replace with the actual initial revenue

        // Update value with revenue
        taxExpense.calculateTotalExpenses(initialRevenue);
        
        // Display updated state
        System.out.println("\nUpdated Tax Expense:");
        System.out.println(taxExpense);
    }
}//end class