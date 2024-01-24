/*
2024/01/17
StoreRevenue.java
Child class representing revenue generated from items sold in university stores
*/


package Revenues;
public class StoreRevenue extends Revenue{

//Earning revenue from itmes sold in our stores 
  
//Instance Variables
private double storeRevenue;
    protected int numStore;
    protected double cashPerStore;
    protected String bookStore;

//Constructor 
public StoreRevenue( double totalRevenue, int numStore, double cashPerStore, String bookStore){
  super(totalRevenue);
  this.numStore = numStore;
  this.cashPerStore = cashPerStore;
  this.bookStore = bookStore;
}

  public double getStoreRevenue() {
      return storeRevenue;
  }
  
  public void setStoreRevenue(double storeRevenue) {
      this.storeRevenue = storeRevenue;
  }

  
  public void setNumStore(int numStore) {
    this.numStore = numStore;
  }

  // getter for this
  public double getNumStore() {
    return numStore;
  }
  
  public double getCashPerStore() {
    return cashPerStore;
  }


  public String getBookStore() {
      return bookStore;
  }

 public void setBookStore(String bookStore) {
   this.bookStore = bookStore;
 }

  public String toString() {
      return "Store Revenue: $" + storeRevenue;
  }


  public double calculateStoreRevenue() {
      return numStore * cashPerStore;
  }

    public static int myRandom(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom

   // Calculate and return total store revenue
    public double calculateTotalStoreRevenue() {
        double totalStoreRevenue = numStore * cashPerStore * generateRandomRevenuePerUnit();
        setTotalRevenue(totalStoreRevenue);
        return totalStoreRevenue;
    }

}// end class  