/*
2024/01/17
Administrator.java
Child class that represents individuals responsible for managing specific departments within the university. Administrators may have certifications relevant to their field of study.
*/


package People;

public class Administrator extends People {

    // Instance variables
    protected String department;
    protected boolean isHired;
    protected int experienceYears;
    protected boolean hasCertification;

    // Constructor
    public Administrator(int count, String name, boolean isHired, String department, int experienceYears, boolean hasCertification) {
        super(count); // Assuming 1 as the default count for administrators
        this.name = name;
        this.isHired = isHired;
        this.department = department;
        this.experienceYears = experienceYears;
        this.hasCertification = hasCertification;
    }

    // These methods simulate actions or responsibilities of administrators within the university
    public void manageUniversity() {
        System.out.println("Administrator " + name + " is managing a faculty.");
    }

    public void conductMeetings() {
        System.out.println("Administrator " + name + " is conducting meetings.");
    }

    public void evaluateStaffPerformance() {
        System.out.println("Administrator " + name + " is evaluating staff performance.");
    }

    // Getter and setter methods
    public String getDepartment() {
        return department;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public boolean hasCertification() {
        return hasCertification;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void setHasCertification(boolean hasCertification) {
        this.hasCertification = hasCertification;
    }

    public String toString() {
        return super.toString() + " Department: " + department + " Experience Years: " + experienceYears +
                " Has Certification: " + hasCertification;
    }

}//end class



