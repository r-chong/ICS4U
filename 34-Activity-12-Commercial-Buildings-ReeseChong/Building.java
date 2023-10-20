// private String tenant - to hold the name of the renter. We will assume that the whole building is rented by one tenant.
// private int squareFeet
// private String location - will be set at the beginning to be one of “downtown”, “industrial”, or “rural”
// private double thisYearsTotalRent - starting at zero, this number will be updated monthly using the chargeRent method which is described below

import java.util.ArrayList;
import java.util.Arrays;

public class Building {
    // initialize instance variables
    private String tenant;
    private int squareFeet;
    private String location;
    private double thisYearsTotalRent;

    // store rates as they are constant
    private final ArrayList<Double> allRates = new ArrayList(
        Arrays.asList(0.10,0.15,0.25)
    );

    // instance constructor
    public Building(String tenant, int sqrFeet, String loc) {
        this.tenant = tenant;
        squareFeet = sqrFeet;
        location = loc;
        thisYearsTotalRent = 0.0;
    }

    // convert to string
    public String toString() {
        return "Tenant: " + tenant + "\n" + "Square footage: " + Library.df.format(squareFeet) + "\n" + "Location: " + location + "\n" + "Rent paid since Jan 1: $" + Library.df.format(thisYearsTotalRent) + "\n-----------------";
    }

    // set tenant
    public void setTenant(String newT) {
        this.tenant = newT;
    }

    // charge the rent
    public void chargeRent() {
        double rentMonth;
        double rate;

        // conditional statement based on land type
        if (location.equals("rural")) {
            rate = allRates.get(0);
        } else if (location.equals("industrial")) {
            rate = allRates.get(1);
        } else{
            rate = allRates.get(2);
        }

        // calculate this month's rent, add to total rent
        rentMonth = rate * squareFeet;
        thisYearsTotalRent += rentMonth;
        System.out.println(tenant + " owes " + "$" + Library.df.format(rentMonth) + " this month");
    }

    public double returnYearRent() {
        return thisYearsTotalRent;
    } 
}