// entirely different program - tester
import People.*;
import java.util.ArrayList;
import java.util.Arrays;

public class PeopleTester {
    public static void main(String[] args) {

        //ArrayList to store instances of different parent realted classes
        ArrayList<Administrator> administrators = new ArrayList<Administrator>();
        ArrayList<Custodian> custodians = new ArrayList<Custodian>();
        // ArrayList<Faculty> faculties = new ArrayList<Faculty>();
        ArrayList<GradStudent> gradStudents = new ArrayList<GradStudent>();
        ArrayList<Professor> professors = new ArrayList<Professor>();
        ArrayList<UndergradStudent> undergradStudents = new ArrayList<UndergradStudent>();

        //Creating Instance for of differnt people relatde classes
        Professor prof1 = new Professor(4, "Jeffery Brown", true, 80000.00, "Computer Science", new ArrayList<>(Arrays.asList("CS101", "CS202")), true);
        System.out.println(prof1);

        Administrator admin1 = new Administrator(1, "Paul Walkins", true, "Administration", 5, true);
        System.out.println(admin1);

        Custodian custodian1 = new Custodian(10, "Jane Smith", true, true, 3, false);
        System.out.println(custodian1);

    }
}//end class