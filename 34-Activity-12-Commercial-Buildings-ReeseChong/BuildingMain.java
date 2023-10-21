import java.util.ArrayList;
import java.util.Arrays;

public class BuildingMain {
    public static void run() {
        // array list containing buildings
        ArrayList<Building> allBuildings = new ArrayList();

        // create 6 instance buildings 
        allBuildings.add(new Building("COBS Bread", 5000, "downtown"));
        allBuildings.add(new Building("Party City", 9000, "downtown"));
        allBuildings.add(new Building("Hakim Optical", 6000, "industrial"));
        allBuildings.add(new Building("Aspire Climbing Gym", 5000, "industrial"));
        allBuildings.add(new Building("RBC Headquarters", 12000, "downtown"));
        allBuildings.add(new Building("Applebee Orchard", 21000, "rural"));

        // c) Print "Rental Summary - January 1st"
        System.out.println("");
        printHeader("Rental Summary - January 1st");

        // for loop that calls toString
        for (int i = 0; i < allBuildings.size(); i++) {
            System.out.println(allBuildings.get(i).toString());
        }
        // for loop that charges rent
        printHeader("Charge Rent - Month ending January 31st");
        for (int i = 0; i < allBuildings.size(); i++) {
            allBuildings.get(i).chargeRent();
        }

        // Print "Rental Summary - February 1st"
        System.out.println("");
        printHeader("Rental Summary - February 1st");

        // print to string
        for (int i = 0; i < allBuildings.size(); i++) {
            System.out.println(allBuildings.get(i).toString());
        }

        // tenant has moved out
        allBuildings.get(1).setTenant("Coup industries 3000");
        printHeader("Charge Rent - Month ending February 28th");
        for (int i = 0; i < allBuildings.size(); i++) {
            allBuildings.get(i).chargeRent();
        }

        System.out.println("");
        printHeader("Rental Summary - March 1st");

        for (int i = 0; i < allBuildings.size(); i++) {
            System.out.println(allBuildings.get(i).toString());
        }

        calculateYearEnd(allBuildings);
    }

    public static void printHeader(String text) {
        System.out.println(Library.GREEN_BOLD_BRIGHT + text + Library.TEXT_RESET);
        System.out.println("-----------------");
    }

    public static void calculateYearEnd(ArrayList<Building>buildings) {
        double totalRent = 0.0;
        for (int i = 0; i < buildings.size(); i++) {
            totalRent += buildings.get(i).returnYearRent();
        }
        // print year total rent
        System.out.println("This year's total rent is " + Library.GREEN_BOLD_BRIGHT + "$" + Library.df.format(totalRent) + Library.TEXT_RESET);
    }
}