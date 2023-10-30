public class Act_13_Universities {
    // instance variables
    public String name;
    public String address;
    public double admissionAverage;
    public double ouacFee;
    public String townCategory;
    public int worldRank;
    public boolean isInGTA;
    ////////
    // public String ouacCode;
    // public boolean hasCoop;
    // public boolean caresAboutOUACRank;

    // constructor method
    public Act_13_Universities(String n, String a, double avg, double ouacFee, String t, int rank, boolean isInGTA) {
        name = n;
        address = a;
        admissionAverage = avg;
        this.ouacFee = ouacFee;
        townCategory = t;
        worldRank = rank;
        this.isInGTA = isInGTA;
        // // // // //
        // this.ouacCode = ouacCode;
        // this.hasCoop = hasCoop;
        // caresAboutOUACRank = ouacRank;
    }

    public void updateWorldRank(int change) {
        worldRank += change;
    }

    public void updateAdmissionAverage(double change) {
        admissionAverage += change;
    }

    public void liveOnResidence() {
        if (isInGTA) {
            System.out.println("Commuting is recommended");
        } else {
            System.out.println("Living on residence is recommended");
        }
    }

    // toString method
    // includes "ALL the data for EVERY instance in the category"
    public String toString() {
        return name + "'s CS Program is ranked " + worldRank + " in the world and has an admission average of " + Library.df.format(admissionAverage) + "%. It is based in " + townCategory + " at: " + address + "." + " The OUAC fee is $" + Library.df.format(ouacFee) + ". Is in the GTA: " + isInGTA;
    }
}