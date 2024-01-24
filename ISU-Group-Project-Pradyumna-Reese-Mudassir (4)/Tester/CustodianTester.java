/*
2024-01-17
Tester class for Custodian 
*/

import People.*;

public class CustodianTester {
    public static void main(String[] args) {
        // Test case 1: Create a Custodian instance
        Custodian custodian1 = new Custodian(1, "Mike Johnson", true, true, 2, true);
        System.out.println(custodian1.toString());

        // Test case 2: Change custodian's cleaning certification and work years
        custodian1.setCleaningCertification(false);
        custodian1.setWorkYears(5);
        System.out.println(custodian1.toString());

        // Test case 3: Simulate custodian actions
        custodian1.cleanBuilding();
        custodian1.reportIssues();
        custodian1.performSpecializedCleaning();

        // Test case 4: Create another Custodian instance
        Custodian custodian2 = new Custodian(1, "Sara White", false, false, 1, false);
        System.out.println(custodian2.toString());

        // Test case 5: Simulate custodian actions for the second instance
        custodian2.cleanBuilding();
        custodian2.reportIssues();
        custodian2.performSpecializedCleaning();

        // Test case 6: Test setter methods for the second custodian
        custodian2.setCleaningCertification(true);
        custodian2.setWorkYears(3);
        custodian2.setSpecializedTraining(true);
        System.out.println(custodian2.toString());

        // Test case 7: Create more custodians and simulate actions
        Custodian custodian3 = new Custodian(1, "Anna Black", true, true, 4, true);
        System.out.println(custodian3.toString());
        custodian3.cleanBuilding();
        custodian3.reportIssues();
        custodian3.performSpecializedCleaning();
    }
}//end class
