/*
2024-01-17
Tester class for GradStudent
*/

import People.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GradTester {

    public static void main(String[] args) {
      
      //Instance of gradStudent
      GradStudent gradStudent = new GradStudent(300, "Jack George", 1, 5000.0, "Computer Science", new ArrayList<Double>(Arrays.asList(74.0,81.0,63.0,72.0)),5,"Masters");

      //Printing students stats and info
      System.out.println("Name: " + gradStudent.getName());
      System.out.println("Year: " + gradStudent.getYear());
      System.out.println("Tuition: " + gradStudent.getTuition());
      System.out.println("Program: " + gradStudent.getProgram());
      System.out.println("Grades: " + gradStudent.getGrades());
      System.out.println("Number of Classes: " + gradStudent.getNumberOfClasses());
      System.out.println("Degree Type: " + gradStudent.getDegreeType());

      //Test setters 
      gradStudent.setName("Joe Bob");
      gradStudent.setYear(2);
      gradStudent.setTuition(5000.0);
      gradStudent.setProgram("Electrical Engineering");
      gradStudent.setGrades(new ArrayList<Double>(Arrays.asList(78.0,80.0,92.0)));
      gradStudent.setNumberOfClasses(6);
      gradStudent.setDegreeType("Ph.D.");

      //Printing students stats and info
      System.out.println("\nAfter Setter Updates");
      System.out.println("Name: " + gradStudent.getName());
      System.out.println("Year: " + gradStudent.getYear());
      System.out.println("Tuition: " + gradStudent.getTuition());
      System.out.println("Program: " + gradStudent.getProgram());
      System.out.println("Grades: " + gradStudent.getGrades());
      System.out.println("Number of Classes: " + gradStudent.getNumberOfClasses());
      System.out.println("Degree Type: " + gradStudent.getDegreeType());
    }


}//end class


