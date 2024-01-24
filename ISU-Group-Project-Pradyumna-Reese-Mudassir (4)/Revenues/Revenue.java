/*
2024/01/17
Revenue.java
Parent class representing an abstract class for managing revenue
*/


package Revenues;
public class Revenue{
  

//Instance variables 
    protected double totalRevenue; 


  
//Constructor 
public Revenue(double totalRevenue) {
 this.totalRevenue = totalRevenue;
}

  
//Getters 
public double getTotalRevenue(){ 
  return totalRevenue;
  }

//Setters  
  public void setTotalRevenue(double totalRevenue){
    this.totalRevenue = totalRevenue;
    
  }

  public String toString() {
    return "Total Revenue: $" + totalRevenue;
  }

  public static int myRandom(int min, int max) {
      // up to 1 less than max
      int temp;
      temp = (int) (Math.random() * (max - min) + min);

      return temp;
  }// myRandom


  
  //calculate and return net revenue once expenses are deducted
  public double calculateNetRevenue(double expenses) {
    return totalRevenue - expenses;
  }

  public double generateRandomRevenuePerUnit() {
      return myRandom(10000, 50000); // You can adjust the range as needed
  }

}//end class 