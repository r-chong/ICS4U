// entirely different program - tester
import Campus.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CampusTester {
    public static void main(String[] args) {

        //ArrayList to store instances of building types  
        ArrayList<FoodHall> foodHalls = new ArrayList<FoodHall>();
        ArrayList<LectureHall> lectureHalls = new ArrayList<LectureHall>();
        ArrayList<ResearchBuilding> researchBuildings = new ArrayList<ResearchBuilding>();
        ArrayList<Residence> residences = new ArrayList<Residence>();
        ArrayList<StudyHall> studyHalls = new ArrayList<StudyHall>();

        //Creating Instance for different Building types
        FoodHall foodHall1 = new FoodHall("Buckland Hall", 1700, 3, new ArrayList<String>(Arrays.asList("Subway, Tim Hortons, Harvey's, Owl of Minerva")),7000.0,true,25,100);
        LectureHall lectureHall1 = new LectureHall("Mah Building", 200, 2, new ArrayList<String>(Arrays.asList("Ergonomic Seating","Chalkboard")),4000.0,true,200);
        System.out.println(lectureHall1);
        // ResearchBuilding researchBuilding1 = new ResearchBuilding("Vasani Research Laboratory", 450, 3, new ArrayList<String>(Arrays.asList("Bunsen Burner","Microscopes")),3500.0,true,2);
        System.out.println(lectureHall1);
    }
}//end class