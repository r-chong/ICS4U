/*
2024-01-17
Tester class for MortgageExpense
*/

import Expense.*;

public class MortgageExpenseTester {
    public static void main(String[] args) {
      
        //MortgaeExpence Instance 
        MortgageExpense mortgageExpense = new MortgageExpense(2000);

        // Display initial state
        System.out.println("Initial Mortgage Expense:");
        System.out.println(mortgageExpense);

        // Update value
        mortgageExpense.setMortgageRevenue(2500);
        mortgageExpense.calculateTotalExpenses();

        // Display updated state
        System.out.println("\nUpdated Mortgage Expense:");
        System.out.println(mortgageExpense);
    }
}//end class