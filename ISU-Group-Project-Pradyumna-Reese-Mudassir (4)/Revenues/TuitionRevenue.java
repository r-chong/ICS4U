/*
2024/01/17
TuitionRevenue.java
Child class representing revenue generated through tuition fees
*/


package Revenues;

public class TuitionRevenue extends Revenue {

    // Instance variables
    protected double tuitionRevenue;

    // Constructor
    public TuitionRevenue(double totalRevenue, double tuitionRevenue) {
        super(totalRevenue);
        this.tuitionRevenue = tuitionRevenue;
    }

    // Getters and setters
    public double getTuitionRevenue() {
        return tuitionRevenue;
    }

    public void setTuitionRevenue(double tuitionRevenue) {
        this.tuitionRevenue = tuitionRevenue;
    }

    public String toString() {
        return "Tuition Revenue: $" + tuitionRevenue;
    }

    public static int myRandom(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom

    // Calculate and return total tuition revenue
    public double calculateTotalTuitionRevenue() {
        double totalTuitionRevenue = tuitionRevenue * generateRandomRevenuePerUnit();
        setTotalRevenue(totalTuitionRevenue);
        return totalTuitionRevenue;
    }


}//end class 