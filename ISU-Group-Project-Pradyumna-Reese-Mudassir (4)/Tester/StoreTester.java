/*
2024-01-17
Tester class for StoreTester
*/

import Revenues.*;

public class StoreTester {
    public static void main(String[] args) {

        // Creating StoreRevenue object with initial value
        StoreRevenue storeRevenue = new StoreRevenue(700000.0, 5, 30.0, "Campus BookStore");

        // Printing the initial state using toString
        System.out.println("Initial Store Revenue State:");
        System.out.println(storeRevenue);

        // Setting new values using setter methods
        storeRevenue.setNumStore(6);
        storeRevenue.setStoreRevenue(55000);
        storeRevenue.setBookStore("University Bookstore");

        // Printing the updated state using toString
        System.out.println("\nUpdated Store Revenue State:");
        System.out.println(storeRevenue);

        // Calling the additional method to calculate store revenue
        double calculatedStoreRevenue = storeRevenue.calculateStoreRevenue();
        System.out.println("\nCalculated Store Revenue: $" + calculatedStoreRevenue);

        // Calling the additional methods to calculate average revenue per store
        double averageRevenuePerStore = storeRevenue.calculateStoreRevenue();
        System.out.println("\nAverage Revenue Per Store: $" + averageRevenuePerStore);

    }
}