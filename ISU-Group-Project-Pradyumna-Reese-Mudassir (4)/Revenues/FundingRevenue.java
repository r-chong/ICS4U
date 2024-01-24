/*
2024/01/17
FundingRevenue.java
Child class representing revenue generated through government grants and alumni donations
*/


package Revenues;
public class FundingRevenue extends Revenue {

    // Instance variables
    protected double governmentGrants;
    protected double alumniDonations;

    // Constructor
    public FundingRevenue(double totalRevenue, double governmentGrants, double alumniDonations) {
        super(totalRevenue);
        this.governmentGrants = governmentGrants;
        this.alumniDonations = alumniDonations;
    }

    // Getters and setters
    public double getGovernmentGrants() {
        return governmentGrants;
    }

    public void setGovernmentGrants(double governmentGrants) {
        this.governmentGrants = governmentGrants;
    }

    public double getAlumniDonations() {
        return alumniDonations;
    }

    public void setAlumniDonations(double alumniDonations) {
        this.alumniDonations = alumniDonations;
    }

    public String toString() {
        return "Government Grants: $" + governmentGrants + ", Alumni Donations: $" + alumniDonations;
    }

    public static int myRandom(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom

    
    // Calculate and return total funding revenue
    public double calculateTotalFundingRevenue() {
        double totalFundingRevenue = 0;
        totalFundingRevenue += governmentGrants * generateRandomRevenuePerUnit();
        totalFundingRevenue += alumniDonations * generateRandomRevenuePerUnit();
        setTotalRevenue(totalFundingRevenue);
        return totalFundingRevenue;
    }

}// end class 