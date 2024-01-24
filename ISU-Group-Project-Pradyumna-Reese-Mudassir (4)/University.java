/*
2024-01-23
University class
this is the parent who holds the university itself
if the program was to be expanded, users could create multiple universities
*/

import java.util.ArrayList;
import java.util.Arrays;
import Constants.*;
import Revenues.*;
import Expense.*;

public class University {

    protected String name = "";
    protected String location = "";
    protected double cash = 0.0;
    protected double revenue = 0.0;
    protected double expenses = 0.0;
    // protected double revenues = new Revenue();
    // protected double expenses = new Expense();
    protected double profit = 0.00;
    protected int year;
    protected int locationIndex;
    protected boolean boolChoice;
    protected int capacity;
    protected int currentRandom;

    public University(String name, int locationIndex, double cash) {
        this.name = name;
        this.locationIndex = locationIndex;
        this.cash = cash;
    }

    // Method to set expenses and subtract from amount of cash the player has at
    // that point

    // SetRevnue
    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    // SetExpenses
    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    // Update Cash
    public void updateCash() {
        cash = cash + revenue - expenses + 1000000;
    }

    // Set Current Random
    public void setCurrentRandom(int currentRandom) {
        this.currentRandom = currentRandom;
    }

    // Set BoolChoice
    public void setBoolChoice(boolean boolChoice) {
        this.boolChoice = boolChoice;
    }

    // Set Capacity
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // SetYear
    public void setYear(int year) {
        this.year = year;
    }

    // Method to calculate the total profit a player has by subtracting the expenses
    // from the revenue
    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        if (name.contains("university")) {
            return name + " Location: " + LocationData.LOCATION_NAMES.get(locationIndex) + " Cash: " + cash;
        } else {
            return name + "University" + " Location: " + LocationData.LOCATION_NAMES.get(locationIndex) + " Cash: "
                    + cash;
        }
    }

    // event Handler
    public void eventHandler(int currentRandom, boolean accept) {
        switch (currentRandom) {
            case 1:
                handleNewResearchOpportunity(accept);
            case 2:
                handleEquipmentFailure(accept);
            case 3:
                handleFacultyStrikeThreat(accept);
            case 4:
                handleStudentProtest(accept);
            case 5:
                handleDormMaintenance(accept);
            case 6:
                handleEnergyCosts(accept);
            case 7:
                handleFacultyAwards(accept);
            case 8:
                handleStudentRetention(accept);
            case 9:
                handleSecurityThreats(accept);
            case 10:
                handleAcademicRankingDecline(accept);
        }
    }

    // handle New Research Opportunity
    public void handleNewResearchOpportunity(boolean accept) {
        if (accept) {
            setRevenue(revenue + 50000.0);
            setExpenses(expenses + 300000.0);
        } else {
            setRevenue(revenue - 50000.0);
        }
    }

    // handle Equipment Failure
    public void handleEquipmentFailure(boolean accept) {
        if (accept) {
            setExpenses(expenses + 50000.0);
        } else {
            setExpenses(expenses + 100000.0);
        }
    }

    // Handle Faculty Strike Threat
    public void handleFacultyStrikeThreat(boolean accept) {
        if (accept) {
            setExpenses(expenses + 10000.0);
        } else {
            setRevenue(revenue - 15000.0);
        }
    }

    // Handle Student Protest
    public void handleStudentProtest(boolean accept) {
        if (accept) {
            setExpenses(expenses + 50000.0);
        } else {
            setRevenue(revenue - 30000.0);
        }
    }

    // Handle Dorm Maintenance
    public void handleDormMaintenance(boolean accept) {
        if (accept) {
            setExpenses(expenses + 30000.0);
        } else {
            setRevenue(revenue - 20000.0);
        }
    }

    // Handle Energy Costs
    public void handleEnergyCosts(boolean accept) {
        if (accept) {
            setExpenses(expenses + 50000.0);
        } else {
            setExpenses(expenses + 75000.0);
        }
    }

    // Handle Faculty Awards
    public void handleFacultyAwards(boolean accept) {
        if (accept) {
            setExpenses(expenses + 50000.0);
        } else {
            setRevenue(revenue - 30000.0);
        }
    }

    // Handle Student Retention
    public void handleStudentRetention(boolean accept) {
        if (accept) {
            setExpenses(expenses + 100000.0);
        } else {
            setRevenue(revenue - 200000.0);
        }
    }

    // Handle Security Threats
    public void handleSecurityThreats(boolean accept) {
        if (accept) {
            setExpenses(expenses + 50000.0);
        } else {
            setRevenue(revenue - 50000.0);
        }
    }

    // Handle Academic Ranking Decline
    public void handleAcademicRankingDecline(boolean accept) {
        // no financial impact on accept
        if (!accept) {
            setRevenue(revenue - 100000.0);
        }
    }

    // most complicated method in the entire program.....
    // Try to use a large console for optimal viewing of this program -R
    public void printStatistics() {
        // Define column widths
        int yearWidth = 10;
        int nameWidth = 20;
        int cashWidth = 15;
        int revenueWidth = 15;
        int expenseWidth = 15;

        // Unicode characters for table drawing
        String horizontalLine = "\u2500";
        String verticalLine = "\u2502";
        String topLeftCorner = "\u250C";
        String topRightCorner = "\u2510";
        String bottomLeftCorner = "\u2514";
        String bottomRightCorner = "\u2518";
        String intersection = "\u252C";

        // Construct the top border of the table
        String topBorder = topLeftCorner + horizontalLine.repeat(yearWidth + 2) + intersection
                + horizontalLine.repeat(nameWidth + 2) + intersection
                + horizontalLine.repeat(cashWidth + 2) + intersection
                + horizontalLine.repeat(revenueWidth + 2) + intersection
                + horizontalLine.repeat(expenseWidth + 2) + topRightCorner;

        // Print the top border
        System.out.println(topBorder);

        // Print headers with specified width
        String headerFormat = "%s %" + yearWidth + "s %s %" + nameWidth + "s %s %" + cashWidth + "s %s %" + revenueWidth
                + "s %s %" + expenseWidth + "s %s\n";
        System.out.format(headerFormat, verticalLine, "Year", verticalLine, "Name", verticalLine, "Cash", verticalLine,
                "Revenue", verticalLine, "Expenses", verticalLine);

        // Print values with specified width and colors
        String valueFormat = verticalLine + " " + Library.TEXT_BLUE + "%-" + yearWidth + "d" + Library.TEXT_RESET + " "
                + verticalLine +
                " %" + nameWidth + "s " + verticalLine +
                " " + Library.TEXT_GREEN + "%-" + cashWidth + "f" + Library.TEXT_RESET + " " + verticalLine +
                " " + Library.TEXT_YELLOW + "%-" + revenueWidth + "f" + Library.TEXT_RESET + " " + verticalLine +
                " " + Library.TEXT_RED + "%-" + expenseWidth + "f" + Library.TEXT_RESET + " " + verticalLine + "\n";
        System.out.format(valueFormat, year, name, cash, revenue, expenses);

    }

}// end class