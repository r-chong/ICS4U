/*
2024/01/17
GradStudent.java
Child class representing graduate students at the university. It includes attributes such as the student's name, year, tuition, program, grades, number of classes, and degree type.
*/

package People;

import java.util.ArrayList;

// includes admission process but somehow different from the other one
public class GradStudent extends People{


   //Variables 
    protected String name;
    protected int year;
    protected double tuition;
    protected String program;
    protected ArrayList<Double> grades = new ArrayList<Double>();
    protected int numberOfClasses;
    protected String degreeType;

  //Constructor 
    public GradStudent(int count, String name, int year, double tuition, String program, ArrayList<Double> grades, int numberOfClasses, String degreeType) {
        super(count);

      this.name = name;
      this.year = year;
      this.tuition = tuition;
      this.program = program;
      this.grades = grades;
      this.numberOfClasses = numberOfClasses;
      this.degreeType = degreeType;

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

    public void setProgram(String program) {
        this.program = program;
    }

     public String getProgram() {
         return program;
     }

      public String getDegreeType() {
        return degreeType;
      }

      public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
      }


    

  
}//end class