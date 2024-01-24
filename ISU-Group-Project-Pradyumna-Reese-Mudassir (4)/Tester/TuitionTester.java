/*
2024-01-17
Tester class for TuitionRevenue
*/
 
import Revenues.TuitionRevenue;


public class TuitionTester {
  public static void main(String[] args) {

    //Creating a TuitionRevenue Object with initial Value 
    TuitionRevenue tuitionRevenue = new TuitionRevenue (900000, 150000);

    //Printing initial state unsing toString  
    System.out.println("Initial Tuition Revenue State:");
    System.out.println(tuitionRevenue);

    //Setting new values using setter methods 
    tuitionRevenue.setTuitionRevenue(175000);
    
    // Printing the updated using toString
    System.out.println("\nUpdated Tuition Revenue State:");
    System.out.println(tuitionRevenue);
    
  }
}