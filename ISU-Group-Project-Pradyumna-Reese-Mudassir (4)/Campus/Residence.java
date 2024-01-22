/*
2024-01-17
Building.java
Child class for residence building
*/

package Campus;

import java.util.ArrayList;
import java.util.Arrays;

// basic rate + apartment fee is total for someone living in apartment
// basic rate + 3050 is total for someone living in dorm

public class Residence extends Building{
    protected final static double BASIC_FEE = 10000.00;
    protected final static double APARTMENT_FEE = 8000.00;
    protected final static double DORMITORY_FEE = 3050.00;

    protected int numApartments;
    protected int numDormitories;
    
    public Residence(String name, int capacity, int levels, ArrayList<String>amenities, double sqrFootage, boolean hasWifi, int numApartments, int numDormitories) {
        super(name,capacity,levels,amenities,sqrFootage, hasWifi);
        this.numApartments = numApartments;
        this.numDormitories = numDormitories;
    }

    public String toString() {
        return super.toString() + " Number of Dormitories: " + numDormitories + " Number of Apartments: " + numApartments;
    }

    // calculate how much rental revenue we get:

    public double calcResidenceReceivable() {
        double total = 0.0;
        
        // since we already have a capacity variable, the best way to calculate extra fees is to add on top of it
        total += capacity * BASIC_FEE;
        total += numApartments * APARTMENT_FEE;
        total += numDormitories * DORMITORY_FEE;

        return total;
    }
    
    // SETTERS

    public void buildNewApartments(int newApartments) {
        this.numApartments += newApartments;
    }

    public void buildNewDormitories(int dormsToBuild) {
        numDormitories += dormsToBuild;
    }
    
    // GETTERS

    public int getNumApartments() {
        return numApartments;
    }

    public int getNumDormitories() {
        return numDormitories;
    }
}