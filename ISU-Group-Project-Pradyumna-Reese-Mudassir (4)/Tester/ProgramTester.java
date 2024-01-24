// entirely different program - tester
import Campus.*;

public class ProgramTester {
    public static void main(String[] args) {

        //Creating Program object
        Program program1 = new Program("Computer Science", 107, 2, 2000.00);

        // Test case 1: toString
        System.out.println("Test case 1: toString");
        System.out.println("Expected output: Program: Computer Science Students: 107 Professors: 2 Tuition: 2000.00");
        System.out.println("Actual output: " + program1.toString());
        System.out.println("");

        // test case 2: tuition cost
        System.out.println("Test case 2: tuition cost");
        
    }
}//end class