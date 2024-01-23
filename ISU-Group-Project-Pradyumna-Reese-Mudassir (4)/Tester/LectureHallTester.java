/*
2024-01-17
Tester class for Lecture Hall Building
Reese
*/

import Campus.*;

import java.util.ArrayList;
import java.util.Arrays;

public class LectureHallTester {
    public static void main(String[] args) {
        LectureHall lectureHall1 = new LectureHall("Mah Building", 200, 2, new ArrayList<String>(Arrays.asList("Ergonomic Seating","Chalkboard")),4000.0,true,200);

        // test case 1: toString
        System.out.println("Test case 1: toString method");
        System.out.println("Expected output: Building Name: Mah Building Capacity: 200 Levels: 2 Amenities: [Ergonomic Seating, Chalkboard] Square Footage: 4000.0 Has Wifi: true Number of Chairs: 200");
        System.out.println("");
        System.out.println("Actual output: " + lectureHall1);
        System.out.println("");

        // test case 2: get number of chairs
        System.out.println("Test case 2: get number of chairs");
        System.out.println("Expected output: 200");
        System.out.println("Actual output: " + lectureHall1.getNumChairs());
        System.out.println("");

        // Test case 3: update number of chairs
        System.out.println("Test case 3: set number of chairs");
        lectureHall1.setNumChairs(150);
        System.out.println("Expected output: 150");
        System.out.println("Actual Output:" + lectureHall1.getNumChairs());
};
}//end class