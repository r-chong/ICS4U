/*
2024/01/17
People.java
Parent class for all people in the university system. It serves as an abstract class providing common attributes and methods for child classes.
*/

package People;

// Parent class for all people
abstract class People {

    protected static int totalCount;
    protected String name;
    protected int count;
    
    // I found this command so that I can reference the child's actual name inside of the program -R
    public String toString() {
        return "Number of " + getClass().getSimpleName() + "s: " + count;
    }

    // Constructor if they're not being hired (ie. student)
    public People(int count) {
        this.count = count;
    }
    
}//end class