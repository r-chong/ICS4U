import java.util.Arrays;
import java.util.ArrayList;

public class Ex15_Ship {
    // Instance class, like a blueprint
    // Instance Variables
    private String name;
    private boolean inSpace;
    private String owner;
    private String captain;
    private int age;
    // New instance variables
    private ArrayList<String> crew;
    private int numLifeboats;
    private boolean canFly;

    // Constructor method

    public Ex15_Ship(String name, boolean inSpace, String owner, int age, ArrayList<String> crew, int numLifeboats, boolean canFly) {
        this.name = name;
        this.inSpace = inSpace;
        this.owner = owner;
        this.captain = owner;
        this.age = age;
        // new additions
        this.crew = crew;
        this.numLifeboats = numLifeboats;
        this.canFly = canFly;
    }

    // Instance Methods
    // Setter Method
    public void setCaptain(String name) {
        captain = name;
    }

    public void addYears(int years) {
        age += years;
    }

    public void addCrewmate(String crewmate) {
        crew.add(crewmate);
    }

    public void addLifeBoat(int lifeBoatsAdded) {
        numLifeboats += lifeBoatsAdded;
    }

    // The toString() method creates and returns a String for easier printing.
    // All Objects have a built in toString method that will naturally return the
    // hexadecimal memory address of the instance.
    public String toString() {
        if (inSpace) {
            return name + " (spaceship) Owned by: " + owner + " Captain: " + captain + "\n" + "crew:" + crew + "\nCan fly: " + canFly;
        } else {
            return name + " Owned by: " + owner + " Captain: " + captain + "\n" + "crew:" + crew + "\n";
        }
    }

    public String inspectLifeboats() {
        if (canFly == false) { 
            return "# Lifeboats:" + Integer.toString(numLifeboats); }
        else {
            return "# Lifeboats is irrelevant because this is a flying ship";
        }
    }

}// end ship class