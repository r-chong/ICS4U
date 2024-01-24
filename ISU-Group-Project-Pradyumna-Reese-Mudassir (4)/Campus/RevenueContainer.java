package Revenues;

import java.util.ArrayList;
import java.util.List;

public class RevenueContainer {
    // List ot hold different types of revenues
    private ArrayList<Revenue> revenueSources;

    // Constructor
    public RevenueContainer() {
        revenueSources = new ArrayList<>();
    }

    // Method to calculate the total revenue from all sources
    public double calculateTotalRevenue() {
        double total = 0.0;
        for (Revenue revenue : revenueSources) {
            total += revenue.getTotalRevenue();
        }
        return total;
    }

    // Method to print details of all Revenue sources
    public void printRevenueDetails() {
        for (Revenue revenue : revenueSources) {
            System.out.println(revenue);
        }
    }

    // Example
    public static void main(String[] args) {
        RevenueContainer container = new RevenueContainer();

        // Constructors in subclasses
        // container.addRevenueSource(new FundingRevenue(100000.0, 10000.00, 1000.0));
        // container.addRevenueSource(new StoreRevenue(50000.0, 30, 300.0, "Test"));
        // container.addRevenueSource(new TuitionRevenue(75000.0, 850.0));

        System.out.println("Total Revenue: $" + container.calculateTotalRevenue());
        container.printRevenueDetails();
    }
}