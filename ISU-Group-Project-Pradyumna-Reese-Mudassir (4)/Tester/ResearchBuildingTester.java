/*
2024-01-17
Tester class for Building
*/

import Campus.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ResearchBuildingTester {
    public static void main(String[] args) {
      
      //Creating ReaserchBuilding Object
        ResearchBuilding researchBuilding1 = new ResearchBuilding("Quantum Physics Center", 500, 5, new ArrayList<String>(Arrays.asList("Laboratory","Conference Room","Cafeteria")), 15000.0, true, 10);
        System.out.println(researchBuilding1);
    }
}//end class