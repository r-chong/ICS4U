// entirely different program - tester
import Revenues.*;

public class RevenueTester {
    public static void main(String[] args) {

      //Test Revenue
      Revenue revenue = new Revenue(1700.0);
      System.out.println(revenue);


      //Test TuitionRevenue
      TuitionRevenue tuitionRevenue = new TuitionRevenue(2000.0, 500.0);
      System.out.println("Tution Revenue: $" + tuitionRevenue.getTuitionRevenue());

      // Test FundingRevenue
      FundingRevenue fundingRevenue = new FundingRevenue(2500.0, 800.0, 300.0);
      System.out.println("Government Grants: $" + fundingRevenue.getGovernmentGrants());
       System.out.println("Alumni Donations: $" + fundingRevenue.getAlumniDonations());

      //Test StoreRevenue
      StoreRevenue storeRevenue = new StoreRevenue(3000.0, 5, 150.0, "BookStore");
      System.out.println("Store Revenue: $" + storeRevenue.getStoreRevenue());
      storeRevenue.setNumStore(10);
      System.out.println("Number of Stores: "+ storeRevenue.getNumStore());
      System.out.println("Cash Per Store: $" + storeRevenue.getCashPerStore());
      System.out.println("Book Store: " + storeRevenue.getBookStore());
    }
}//end class