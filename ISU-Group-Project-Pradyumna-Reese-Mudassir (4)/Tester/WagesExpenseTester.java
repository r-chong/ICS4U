/*
2024-01-17
Tester class for WagesExpense
*/

import Expense.*;

public class WagesExpenseTester {
    public static void main(String[] args) {
        WagesExpense wagesExpense = new WagesExpense(3000);

        // Display initial state
        System.out.println("Initial Wages Expense:");
        System.out.println(wagesExpense);

        // Update value
        wagesExpense.setWagesOwed(3500);
        wagesExpense.calculateTotalExpenses();

        // Display updated state
        System.out.println("\nUpdated Wages Expense:");
        System.out.println(wagesExpense);
    }
}//end class