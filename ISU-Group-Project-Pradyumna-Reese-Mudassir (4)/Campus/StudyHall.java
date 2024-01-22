/*
2024-01-17
Building.java
Child class for study hall
*/

package Campus;

import java.util.ArrayList;
public class StudyHall extends Building{
    protected double sqrFootage;
    protected int numCoffeeMachines;
    
    public StudyHall(String name, int capacity, int levels, ArrayList<String> amenities, boolean hasWifi, double sqrFootage, int numCoffeeMachines) {
        super(name,capacity,levels,amenities,sqrFootage, hasWifi);
        this.numCoffeeMachines = numCoffeeMachines;
    }

    public String toString() {
        return super.toString() + " Number of Coffee Machines: " + numCoffeeMachines;
    }

    // GETTERS

    public int getNumCoffeeMachines() {
        return numCoffeeMachines;
    }
} 