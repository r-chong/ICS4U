/*
2024-01-17
Building.java
Child class for lecture hall
*/

package Campus;

import java.util.ArrayList;
import java.util.Arrays;

public class LectureHall extends Building{
    protected int numChairs;
    
    public LectureHall(String name, int capacity, int levels, ArrayList<String> amenities, double sqrFootage, boolean hasWifi, int numChairs) {
        super(name,capacity,levels,amenities, sqrFootage, hasWifi);
        this.numChairs = numChairs;
    }

    public String toString() {
        return super.toString() + " Number of Chairs: " + numChairs;
    }

    // GETTERS
        
    public int getNumChairs() {
        return numChairs;
    }

    // SETTERS

    public void setNumChairs(int numChairs) {
        this.numChairs = numChairs;
    }
}