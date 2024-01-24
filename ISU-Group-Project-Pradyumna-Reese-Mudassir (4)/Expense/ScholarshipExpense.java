/*
2024/01/17
ScholarshipExpense.java
Child class that represents expenses for scholarships awarded by the University
*/

package Expense;
public class ScholarshipExpense extends Expense {

    // Instance variables
    protected double flatFee;
    protected int studentsAwarded;

    // Constructor
    public ScholarshipExpense(double flatFee, int studentsAwarded) {
        super(0); // Initial value, will be updated by calculateTotalExpenses
        this.flatFee = flatFee;
        this.studentsAwarded = studentsAwarded;
        calculateTotalExpenses();
    }

    // Getter and Setter methods
    public double getFlatFee() {
        return flatFee;
    }

    public void setFlatFee(double flatFee) {
        this.flatFee = flatFee;
    }

    public int getStudentsAwarded() {
        return studentsAwarded;
    }

    public void setStudentsAwarded(int studentsAwarded) {
        this.studentsAwarded = studentsAwarded;
    }

    public String toString() {
        return super.toString() + " | Flat Fee: $" + flatFee + " | Students Awarded: " + studentsAwarded;
    }

    public static int myRandom(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom

    

    // Method to recalculate totalExpenses
    public void calculateTotalExpenses() {
        setTotalExpenses(flatFee * studentsAwarded * generateRandomExpensePerUnit());
    }

}//end class