/*
2024-01-22
This is where it all happens
random events are created at the bottom. we run processes in the main section
Reese
*/

import java.util.ArrayList;
import java.util.Arrays;
import UserInteraction.*;

import Revenues.*;
import Expense.*;
import Campus.*;
import People.*;
import Constants.*;

public class UniversitySimulator {

    public static ArrayList<RandomEvent> randEvents = new ArrayList<RandomEvent>();

    public static void run() {
        // Declare, initialize variables & also populate all the events
        String name;
        int locationIndex;
        int year = 2010;
        int population;
        int currentRandom;
        boolean boolChoice;

        // run these methods on init
        populateEvents();

        // UNIVERSITY SETUP
        // it's like a character menu

        System.out.println("Welcome to the Business Department's University Simulator!");
        System.out.println("This is a turn-based game that will have you make financial decisions at every move.");
        System.out.println("*Note: for optimal viewing experience, please widen your console.");
        System.out.println(
                "When you are ready, " + Library.GREEN_BOLD_BRIGHT + "[Press Enter to Start]" + Library.TEXT_RESET);
        Library.input.nextLine();
        divider("Setup");
        System.out.println("Step 1. Come up with a name for your university:");
        name = Library.input.nextLine();

        if (!name.contains("university")) {
            name = name + " University";
        }

        System.out.println("");
        System.out.println("Step 2. Where will your university be based?");
        System.out.println(
                "1. Ontario (Population 14M)\n2. Quebec (Population 9M)\n3. British Columbia (Population 5M)\n4. Nunavut (Population 36K)\n5. The Moon (Population 0)\n");
        locationIndex = Library.input.nextInt();

        // CONSTRUCT THE UNI

        University university1 = new University(name, locationIndex, 1000000.0);
        gText(name + " has been created!");

        divider("The year is 2010");
        university1.setYear(year);

        System.out.println(
                "The year is 2010, and your journey as founder of " + name
                        + " has just begun. Armed with a vision, $1,000,000 in investment cash, and a group of talented friends from your graduate school days who have joined you as professors, you're ready to create your academic empire. But things do not always go as planned...\n");

        System.out.println(
                "As you encounter various obstacles in your journey as a new dean, you will have various performance indicators measuring your progress. Each year, you will have a table of statistics showing your Cash, Revenue, and Expenses. Your goal is to earn $10,000,000 (or your investors will kill you!) Good luck.");

        // i made constants so that we know how many people live in that city
        population = LocationData.LOCATION_DETAILS.get(locationIndex);

        // GAME START
        while (true) {
            // lose and win conditions
            if (university1.cash <= 0.00) {
                gText("Your university ran out of cash.\nGame over!");
                break;
            } else if (university1.cash >= 10000000.00) {
                gText("You win! " + name
                        + " reached a profit of $10,000,000 satisfying investors and giving you a raise and 4 weeks of vacation.");
            }

            // population edge case`
            if (population < 500000) {
                gText("Your university is based in a city way too small! Population: " + population + "\nGame over!");
                break;
            }

            university1.printStatistics();
            System.out.println("");
            currentRandom = Library.myRandom(0, 10);
            university1.setCurrentRandom(currentRandom);
            boolChoice = randEventMenu(randEvents.get(currentRandom), currentRandom);
            university1.eventHandler(currentRandom, boolChoice);
            university1.updateCash();

            year += 1;
            university1.setYear(year);

            Library.input.nextLine();
        }
    }

    //Random Event Menu
    public static boolean randEventMenu(RandomEvent event, int currentRandom) {
        int choice = -1;

        System.out.println(event.getTitle());
        System.out.println(event.getDescription());
        System.out.println("1... Yes");
        System.out.println("2... No");

        choice = Library.input.nextInt();

        if (choice == 1) {
            System.out.println(event.getAcceptResult());
            return true;
        } else if (choice == 2) {
            System.out.println(event.getIgnoreResult());
            return false;
        } else {
            System.out.println("Invalid choice");
            return false;
        }
    }

    // gText
    public static void gText(String msg) {
        System.out.println(Library.GREEN_BOLD_BRIGHT + msg + Library.TEXT_RESET);
    }

    //Divider 
    public static void divider(String msg) {
        System.out.println("\n---------<= " + msg + " >=---------\n");
    }

    // I created this to add all of the events without cluttering the top of the
    // file too much... didn't know how to use JSON
    public static void populateEvents() {
        randEvents.add(new RandomEvent(
                "New Research Opportunity",
                "Your university has been offered a lucrative research opportunity in partnership with a renowned company... Accept Partnership?",
                "Revenues: +$500,000 (from successful research), Expenses: -$300,000 (initial investment)",
                "Missed research opportunity, No change in revenues or expenses"));

        randEvents.add(new RandomEvent(
                "Equipment Failure in Research Labs",
                "Some critical equipment in the research labs has malfunctioned, requiring immediate repair... Repair?",
                "Expenses: -$50,000 (repair costs), Reputation with Research Building: -10% (temporary)",
                "Potential long-term damage to research equipment, Reputation with Research Building: -20% (permanent)"));

        randEvents.add(new RandomEvent(
                "Faculty Strike Threat",
                "The faculty is expressing dissatisfaction and is on the brink of going on strike... Meet their demands?",
                "Expenses: -$100,000 (meeting faculty demands), Faculty Morale: +20%",
                "Potential faculty strike, Faculty Morale: -10%"));

        randEvents.add(new RandomEvent(
                "Student-led Protest for Improved Campus Facilities",
                "Students are organizing a protest demanding better facilities... Meet their demands?",
                "Expenses: -$50,000 (improving facilities), Student Satisfaction: +15%",
                "Negative publicity affecting student enrollment, Student Satisfaction: -10%"));

        randEvents.add(new RandomEvent(
                "Increase in Dormitory Maintenance Costs",
                "The dormitories require immediate maintenance due to wear and tear... Pay maintenance fees?",
                "Expenses: -$30,000 (maintenance costs), Student Satisfaction: +10%",
                "Potential decline in dormitory conditions, Student Satisfaction: -5%"));

        randEvents.add(new RandomEvent(
                "Unexpected Increase in Energy Costs",
                "Energy costs have spiked unexpectedly, impacting the university's budget... Reduce use of AC/Heating?",
                "Expenses: -$50,000 (increased energy costs), Energy Efficiency: Required to minimize future impact",
                "Higher operational expenses"));

        randEvents.add(new RandomEvent(
                "Faculty Excellence Awards Ceremony",
                "Recognizing faculty excellence with awards can boost morale and reputation... Hold a faculty awards ceremony?",
                "Expenses: -$50,000 (awards ceremony), Faculty Morale: +15%, Reputation: +10%",
                "Potential decline in faculty morale"));

        randEvents.add(new RandomEvent(
                "Decline in Student Retention",
                "A significant number of students are considering transferring due to dissatisfaction... Start retention initiatives?",
                "Student Retention: +10%, Expenses: -$100,000 (retention initiatives)",
                "Potential decline in student enrollment, Student Retention: -15%"));

        randEvents.add(new RandomEvent(
                "Successful Recruitment of Renowned Professor",
                "A renowned professor has shown interest in joining your faculty, but their current salary is quite high... Hire them?",
                "Expenses: +$200,000 (renowned professor's salary), Academic Reputation: +20%",
                "Missed opportunity to strengthen faculty, No change in expenses or reputation"));

        randEvents.add(new RandomEvent(
                "Increase in Campus Security Threats",
                "There has been a rise in campus security threats, requiring additional measures... Take additional security members?",
                "Expenses: -$50,000 (security measures), Campus Safety: +15%",
                "Potential compromise in campus safety, Campus Safety: -10%"));

        randEvents.add(new RandomEvent(
                "Decline in Academic Rankings",
                "Your university's academic rankings have dropped, affecting its overall reputation... Donate to charity?",
                "Academic Reputation: +15%, Strategic Planning: Required to improve rankings",
                "Continued decline in academic standing"));
    }
}// end class