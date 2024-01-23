/*
2024-01-17
Tester class for Building
Reese
*/

import Campus.*;

import java.util.ArrayList;
import java.util.Arrays;

public class BuildingTester {
    public static void main(String[] args) {
        ArrayList<String> amenities = new ArrayList<String>(Arrays.asList("Gym","Library","Ergonomic chairs","Chalkboard"));
        Building building1 = new Building("Llanford Building",300,3, amenities,4000.0,true);

        // test case 1: creating building instance
        System.out.println("Test Case 1: create a building instance.");
        System.out.println("Expected output: Building name: Llanford Building Capacity: 300 Levels: 3 Amenities: [Gym, Library, Ergonomic Chairs, Chalkboard], Square Footage: 12000.0 Has wifi: true");
        System.out.println("");
        System.out.println("Actual output: " + building1.toString());    
        System.out.println("");

        // Test case 2: Update square footage
        building1.updateSqrFootage(13000.0);
        System.out.println("Test Case 2: Update square footage");
        System.out.println("Expected output: 13000.0");
        System.out.println("Actual output: " + building1.getSqrFootage());
        System.out.println("");

        // Test case 3: update wifi status
        building1.updateWifiStatus(false);
        System.out.println("Test case 3: Update wifi status");
        System.out.println("Expected output: false");
        System.out.println("Actual output: " + building1.checkHasWifi());
        System.out.println("");

        // Test case 3: add amenities
        building1.addAmenities("Swimming pool");
        System.out.println("Test case 4: add amenity");
        System.out.println("Expected output: Amenities: [Gym, Library, Ergonomic Chairs, Chalkboard, Swimming pool");
        System.out.println("Actual Output: " + building1.getAmenities());
    }
}//end class