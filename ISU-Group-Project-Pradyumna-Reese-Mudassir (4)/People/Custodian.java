/*
2024/01/17
Custodian.java
Child class that represents individuals responsible for maintaining cleanliness and handling basic maintenance tasks within the university. Custodians may have special certifications or training for certain tasks.
*/

package People;

public class Custodian extends People {

    // Instance variables
    protected String name;
    protected boolean isHired;
    protected boolean cleaningCertification;
    protected int workYears;
    protected boolean specializedTraining;

    // Constructor
    public Custodian(int count, String name, boolean isHired, boolean cleaningCertification, int workYears, boolean specializedTraining) {
        super(count); // Assuming 1 as the default count for custodians
        this.name = name;
        this.isHired = isHired;
        this.cleaningCertification = cleaningCertification;
        this.workYears = workYears;
        this.specializedTraining = specializedTraining;
    }

    // These methods simulate actions or responsibilities of custodians within the university
    public void cleanBuilding() {
        System.out.println("Custodian " + name + " is cleaning the building.");
    }

    public void reportIssues() {
        System.out.println("Custodian " + name + " is reporting maintenance issues.");
    }

    public void performSpecializedCleaning() {
        if (specializedTraining) {
            System.out.println("Custodian " + name + " is performing specialized cleaning tasks.");
        } else {
            System.out.println("Custodian " + name + " does not have specialized training for additional tasks.");
        }
    }

    // Getter and setter methods
    public boolean hasCleaningCertification() {
        return cleaningCertification;
    }

    public int getWorkYears() {
        return workYears;
    }

    public boolean hasSpecializedTraining() {
        return specializedTraining;
    }

    public void setCleaningCertification(boolean cleaningCertification) {
        this.cleaningCertification = cleaningCertification;
    }

    public void setWorkYears(int workYears) {
        this.workYears = workYears;
    }

    public void setSpecializedTraining(boolean specializedTraining) {
        this.specializedTraining = specializedTraining;
    }

    public String toString() {
        return super.toString() + " Cleaning Certification: " + cleaningCertification +
                " Work Years: " + workYears + " Specialized Training: " + specializedTraining;
    }

}//end class
