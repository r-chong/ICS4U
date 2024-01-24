/*
2024-01-17
Tester class for FundingRevenue
*/

import Revenues.*;

public class FundingTester {
  public static void main(String[] args) {
    
    //Creating a Funding Revenue object with initial value
    FundingRevenue fundingRevenue = new FundingRevenue (500000, 20000, 3000);

    // Printing the initial state using toString
    System.out.println("Initial Funding Revenue State:");
    System.out.println(fundingRevenue);

    //Setting new values using setter methods 
    fundingRevenue.setGovernmentGrants(25000);
    fundingRevenue.setAlumniDonations(4000);

    // Printing out the updated using toString
    System.out.println("\nUpdated Funding Revnue State:");
    System.out.println(fundingRevenue);

    //calling aditional method to calculate total funding revenue 
    double totalFundingRevenue = fundingRevenue.calculateTotalFundingRevenue();
    System.out.println("\nTotal Funding Revenue: $" + totalFundingRevenue);
  }
}//end class