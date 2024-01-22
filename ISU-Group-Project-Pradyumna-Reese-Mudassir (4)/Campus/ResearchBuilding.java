/*
2024-01-17
Building.java
Child class for research hall
*/

package Campus;

import java.util.ArrayList;
import java.util.Arrays;

public class ResearchBuilding extends Building{
    protected int numLabs;
    
    public ResearchBuilding(String name, int capacity, int levels, ArrayList<String>amenities, double sqrFootage, boolean hasWifi, int numLabs) {
        super(name,capacity,levels,amenities,sqrFootage,hasWifi);
        this.numLabs = numLabs;
    }

    public String toString() {
        return super.toString() + " Number of Labs: " + numLabs;
    }

    // GETTERS
    public int getNumLabs() {
        return numLabs;
    }

    // SETTERS
    public void addNewLab(int labsToAdd) {
        numLabs += labsToAdd;
    }
}