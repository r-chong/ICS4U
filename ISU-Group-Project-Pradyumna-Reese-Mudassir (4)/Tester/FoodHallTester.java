/*
2024-01-17
Tester class for Food Hall Building
Reese
*/

import Campus.*;

import java.util.ArrayList;
import java.util.Arrays;

public class FoodHallTester {
  
    public static void main(String[] args) {
      
        //Instance of football class 
        FoodHall foodHall1 = new FoodHall("Buckland Hall", 1700, 3, new ArrayList<String>(Arrays.asList("Subway, Tim Hortons, Harvey's, Owl of Minerva")),7000.0,true,25,100);

    // Test case 1: the toString method
    System.out.println("Test case 1: toString");
    System.out.println("Expected output: Building Name: Buckland Hall Capacity: 700 Levels: 3 Amenities: [Subway, Tim Hortons, Harvey's, Owl of Minerva] Square Footage: 7000.0 Has Wifi: true Number of Tables: 25 Number of Chairs: 100");
    System.out.println("");
    System.out.println("Actual output: " + foodHall1);
    System.out.println("");

    // Test case 2: get tables
    System.out.println("Test case 2: getNumTables");
    System.out.println("Expected output: Number of Tables: 25");
    System.out.println("Actual output: " + foodHall1.getNumTables());
    System.out.println("");

    // Test case 3: get chairs
    System.out.println("Test case 3: getNumChairs");
    System.out.println("Expected output: Number of chairs: 100");
    System.out.println("Actual output: " + foodHall1.getNumChairs());
    System.out.println("");

    // test case 4: setNumTables
    System.out.println("Test case 4: setNumTables");
    foodHall1.setNumTables(30);
    System.out.println("Expected output: 30");
    System.out.println("Actual output:" + foodHall1.getNumTables());
    System.out.println("");

    // test case 5: setChairs
    System.out.println("Test case 5: setNumChairs");
    foodHall1.setNumChairs(85);
    System.out.println("Expected output: 85");
    System.out.println("Actual output: " + foodHall1.getNumChairs());
    System.out.println("");
        
}
}//end class