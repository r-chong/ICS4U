/*
2024-01-17
Tester class for MarketingExpense
*/

import Expense.*;

public class MarketingExpenseTester {
    public static void main(String[] args) {
      
       //MarketingExpence Instance
        MarketingExpense marketingExpense = new MarketingExpense(500, 3);

        // Display initial state
        System.out.println("Initial Marketing Expense:");
        System.out.println(marketingExpense);

        // Update values
        marketingExpense.setAdPrice(600);
        marketingExpense.setBillBoards(5);
        marketingExpense.calculateTotalExpenses();

        // Display updated state
        System.out.println("\nUpdated Marketing Expense:");
        System.out.println(marketingExpense);
    }
}//end class