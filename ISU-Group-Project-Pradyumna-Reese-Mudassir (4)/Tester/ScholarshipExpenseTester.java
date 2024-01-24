/*
2024-01-17
Tester class for ScholorshipExpense
*/

import Expense.*;

public class ScholarshipExpenseTester {
    public static void main(String[] args) {
        ScholarshipExpense scholarshipExpense = new ScholarshipExpense(1000, 5);

        // Display initial state
        System.out.println("Initial Scholarship Expense:");
        System.out.println(scholarshipExpense);

        // Update values
        scholarshipExpense.setFlatFee(1200);
        scholarshipExpense.setStudentsAwarded(8);
        scholarshipExpense.calculateTotalExpenses();

        // Display updated state
        System.out.println("\nUpdated Scholarship Expense:");
        System.out.println(scholarshipExpense);
    }
}//end class