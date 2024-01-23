/*
2024/01/17
UndergradStudent.java
Child class representing undergraduate students at the university. It includes attributes such as the student's name, year, tuition, program, grades, and the number of classes. Methods are included for calculating GPA, checking Dean's List status, and displaying student information.
*/

package People;
import java.util.ArrayList;
// includes admissions process
public class UndergradStudent extends People {

 //Variables 
    protected String name;
    protected int year;
    protected double tuition;
    protected String program;
    protected ArrayList<Double> grades = new ArrayList<Double>();
    protected int numberOfClasses;


//Constructor 
  public UndergradStudent(int count, String name, int year, double tuition, String program, ArrayList<Double> grades, int numberOfClasses) {
      super(count);

    this.name = name;
    this.year = year;
    this.tuition = tuition;
    this.program = program;
    this.grades = grades;
    this.numberOfClasses = numberOfClasses;
    
  }

  //Getters and setters
    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getYear(){
      return year;
    }

    public void setYear(int year) {
      this.year = year;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public double getTuition() {
      return tuition;
    }

    public String getProgram(){
      return program;
    }

  public void setProgram(String program){
    
   this.program = program;
  }
  
    public ArrayList<Double> getGrades() {
      return grades;
    }

    public void setGrades (ArrayList<Double> grades) {
      this.grades = grades;
    }

    public int getNumberOfClasses() {
      return numberOfClasses;
    } 

    public void setNumberOfClasses(int numberOfClasses) {
      this.numberOfClasses = numberOfClasses;
    }

    // Calculating GPA
    public double calculateGPA() {
      double sum = 0;
      for (double grade : grades) {
        sum += grade;
      }
      return sum / grades.size();
    }

  public boolean isOnDeansList() {
    return calculateGPA() >= 3.5;
  }

  public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Year: " + year);
    System.out.println("Program: " + program);
    System.out.println("Number of Classes: " + numberOfClasses);
    System.out.println("GPA: " + calculateGPA());
    System.out.println("Dean's List Status: " + (isOnDeansList() ? "Yes" : "No"));

  }

  public void addGrade (double grade) {
    grades.add(grade);
  }

  // public void enrollinClass() {
  //   numberofClasses++;
  // }

  public boolean EligibleForGraduation() {
    return numberOfClasses >= 120;
  }

  public void displaySummary() { 
  System.out.println("Name: " + name);
    System.out.println("Year: " + year);
    System.out.println("Program: " + program);
    System.out.println("Number of Classes: " + numberOfClasses);
    System.out.println("GPA: " + calculateGPA());
    System.out.println("Dean's List Status: " + (isOnDeansList() ? "Yes" : "No"));
    System.out.println("Eligible for Graduation: " + (EligibleForGraduation() ? "Yes" : "No"));

    } 
  
  }//end class