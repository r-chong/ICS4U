/*
2024-01-17
Building.java
Child class for food hall
*/

package Campus;

import java.util.ArrayList;
import java.util.Arrays;

public class FoodHall extends Building{
    protected int numTables;
    protected int numChairs;
    
    public FoodHall(String name, int capacity, int levels, ArrayList<String>amenities, double sqrFootage, boolean hasWifi, int numTables, int numChairs) {
        super(name,capacity,levels,amenities,sqrFootage, hasWifi);
        this.numTables = numTables;
        this.numChairs = numChairs;
    };

    public String toString() {
        return super.toString() + " Number of Tables: " + numTables + " Number of Chairs: " + numChairs;
    };

    // GETTERS 

    public int getNumTables() {
        return numTables;
    }

    public int getNumChairs() {
        return numChairs;
    }

    // SETTERS

    public void setNumTables(int numTables) {
        this.numTables = numTables;
    }

    public void setNumChairs(int numChairs) {
        this.numChairs = numChairs;
    }
}