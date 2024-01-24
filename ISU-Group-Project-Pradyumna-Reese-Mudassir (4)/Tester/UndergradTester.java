/*
2024-01-17
Tester class for UndergradStudent
*/

import People.*;
import java.util.ArrayList;
import java.util.Arrays;

public class UndergradTester {

    public static void main(String[] args) {
      
      //Instance of UndergradStudent
      UndergradStudent undergradStudent = new UndergradStudent(1, "John Wick", 1, 5000.0, "Computer Science", new ArrayList<Double>(Arrays.asList(90.5,85.0)), 5);

      System.out.println("Name: " + undergradStudent.getName());
      System.out.println("Year: " + undergradStudent.getYear());
      System.out.println("Tuition: " + undergradStudent.getTuition());
      System.out.println("Program: " + undergradStudent.getProgram());
      System.out.println("Grades: " + undergradStudent.getGrades());
      System.out.println("Number of Classes: " + undergradStudent.getNumberOfClasses());
      
      //Test setters 
      undergradStudent.setName("Joe Bob");
      undergradStudent.setYear(2);
      undergradStudent.setTuition(5000.0);
      undergradStudent.setProgram("Electrical Engineering");
      undergradStudent.setGrades(new ArrayList<>());
      undergradStudent.setNumberOfClasses(6);

      //Printing students stats and info
      System.out.println("\nAfter Setter Updates");
      System.out.println("Name: " + undergradStudent.getName());
      System.out.println("Year: " + undergradStudent.getYear());
      System.out.println("Tuition: " + undergradStudent.getTuition());
      System.out.println("Program: " + undergradStudent.getProgram());
      System.out.println("Grades: " + undergradStudent.getGrades());
      System.out.println("Number of Classes: " + undergradStudent.getNumberOfClasses());
      
    } 
}//end class


