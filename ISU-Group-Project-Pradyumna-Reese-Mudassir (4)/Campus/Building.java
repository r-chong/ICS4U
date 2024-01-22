/*
2024-01-17
Building.java
Parent class holding various campus buildings
*/
package Campus;

// idea: method based on paying rent on number of items in arraylist of buildings

import java.util.ArrayList;
import java.util.Arrays;

// protected makes it accessible
public class Building {
    protected String name;
    protected int capacity;
    protected int levels;
    protected ArrayList<String>amenities;
    protected double sqrFootage;
    protected boolean hasWifi;
    
    public Building(String name, int capacity, int levels, ArrayList<String>amenities, double sqrFootage, boolean hasWifi) {
        this.name = name;
        this.capacity = capacity;
        this.levels = levels;
        this.amenities = amenities;
        this.sqrFootage = sqrFootage;
        this.hasWifi = hasWifi;
    }

    public String toString() {
        return "Building name: " + name + " Capacity: " + capacity + " Levels: " + levels + "\nAmenities: " + amenities + "\nSquare footage: " + sqrFootage + " Has Wifi: " + hasWifi;
    }

    // SETTERS

    public void updateSqrFootage(double sqrFootage) {
        this.sqrFootage = sqrFootage;
    }    

    public void updateWifiStatus(boolean updatedWifi) {
        hasWifi = updatedWifi;
    }

    public void addAmenities(String newAmenity) {
        amenities.add(newAmenity);
    }
    
    // GETTERS

    public boolean checkHasWifi() {
        return hasWifi;
    }

    public double getSqrFootage(){
        return sqrFootage;
    }
    
    public ArrayList<String> getAmenities() {
        return amenities;
    }
}