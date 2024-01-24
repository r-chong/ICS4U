/*
2024/01/17
MarketingExpense.java
Child class that represents expenses for marketing activities
*/



package Expense;
public class MarketingExpense extends Expense {

    // Instance variables
    protected double adPrice;
    protected int billBoards;
    
    // Constructor
    public MarketingExpense(double adPrice, int billBoards) {
        super(0); // Initial value, will be updated by calculateTotalExpenses
        this.adPrice = adPrice;
        this.billBoards = billBoards;
        calculateTotalExpenses();
    }
    
    // Getter and Setter methods
    public double getAdPrice() {
        return adPrice;
    }
    
    public void setAdPrice(double adPrice) {
        this.adPrice = adPrice;
    }
    
    public int getBillBoards() {
        return billBoards;
    }
    
    public void setBillBoards(int billBoards) {
        this.billBoards = billBoards;
    }

    public String toString() {
        return super.toString() + " | Ad Price: $" + adPrice + " | Billboards: " + billBoards;
    }

    public static int myRandom(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom

    // Method to recalculate totalExpenses
    public void calculateTotalExpenses() {
        setTotalExpenses((adPrice * billBoards) * generateRandomExpensePerUnit());
    }

}//end class

