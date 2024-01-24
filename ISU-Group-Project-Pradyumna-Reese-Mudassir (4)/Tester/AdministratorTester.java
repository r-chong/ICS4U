/*
2024-01-17
Tester class for Administration
*/

import People.*;

public class AdministratorTester {
    public static void main(String[] args) {
        // Test case 1: Create an Administrator instance
        Administrator admin1 = new Administrator(1, "Paul Walkins", true, "HR Department", 5, true);
        System.out.println(admin1.toString());

        // Test case 2: Change administrator's department and experience years
        admin1.setDepartment("Finance Department");
        admin1.setExperienceYears(8);
        System.out.println(admin1.toString());

        // Test case 3: Simulate administrator actions
        admin1.manageUniversity();
        admin1.conductMeetings();
        admin1.evaluateStaffPerformance();

        // Test case 4: Create another Administrator instance
        Administrator admin2 = new Administrator(1, "Jane Smith", false, "IT Department", 3, false);
        System.out.println(admin2.toString());

        // Test case 5: Simulate administrator actions for the second instance
        admin2.manageUniversity();
        admin2.conductMeetings();
        admin2.evaluateStaffPerformance();

        // Test case 6: Test setter methods for the second administrator
        admin2.setDepartment("Security Department");
        admin2.setExperienceYears(6);
        admin2.setHasCertification(true);
        System.out.println(admin2.toString());

        // Test case 7: Create more administrators and simulate actions
        Administrator admin3 = new Administrator(1, "Chris Brown", true, "Marketing Department", 10, false);
        System.out.println(admin3.toString());
        admin3.manageUniversity();
        admin3.conductMeetings();
        admin3.evaluateStaffPerformance();
    }
}//end class
