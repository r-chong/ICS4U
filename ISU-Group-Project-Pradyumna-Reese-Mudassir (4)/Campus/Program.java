// closest to campus but technically not a building thus does not extend

package Campus;

public class Program {
    public final static double PROFESSOR_SALARY = 92700.00;
    
    protected String name;
    protected int numStudents;
    protected int numProfessors;
    protected double tuition;
    
    public Program(String name, int numStudents, int numProfessors, double tuition) {
        this.name = name;
        this.numStudents = numStudents;
        this.numProfessors = numProfessors;
        this.tuition = tuition;
    }

    public String toString() {
        return "Program: " + name + " Students: " + numStudents + " Professors: " + numProfessors + " Tuition: " + tuition;
    }

    public void calcProgramReceivable() {
        double total = 0.0;

        total += numStudents * tuition;
    }

    public void calcProgramExpenses() {
        double total = 0.0;

        total += numProfessors * PROFESSOR_SALARY;
    }

    // SETTERS

    public void setTuitionCost(double tuitionCost) {
        this.tuition = tuitionCost;
    }

    public void setNumProfessors(int numProfessors) {
        this.numProfessors = numProfessors;
    }

    // GETTERS
    
    public double getTuitionCost() {
        return tuition;
    }

    public int getNumProfessors() {
        return numProfessors;
    } 

}