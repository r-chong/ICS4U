public class LawnClient {

    // normally private but we are insecure
    public String name;
    public String address;
    public int lawnSize;
    public boolean hasDog;
    public double outstandingFees;

    // Constructor Method
    public LawnClient(String n, String a, int s, boolean d) {
        name = n;
        address = a;
        lawnSize = s;
        hasDog = d;
        outstandingFees= 0;
    }

    // This second constructor for new clients with outstanding fees
    // This is called method overloading
    public LawnClient(String n, String a, int s, boolean d, double f) {
        name = n;
        address = a;
        lawnSize = s;
        hasDog = d;
        outstandingFees = f;
    }

    // Instance Methods

    public String toString() {
        return name + "\nLawn: " + lawnSize + " sq metres.\nDog: " + hasDog + "\nCurrent owing: $" + outstandingFees;
    }// toString

    public void mowLawn() {
        double mowFee = 10.0;

        mowFee += lawnSize * 0.5;
        if (hasDog) {
            mowFee += 15;
        }

        outstandingFees += mowFee;
        System.out.println("Today's fee is: $" + mowFee);
        System.out.println(name + ", you now owe a total of $" + outstandingFees);
    }// mowLawn

    public void processPayment(double payment) {
        outstandingFees -= payment;
        System.out.println("Thank you for the payment, " + name);
    }// processPayment

    public void delinquentFees() {
        if (outstandingFees > 50) {
            outstandingFees *= 1.1; // 10% interest because of bad bad customers
            if (outstandingFees > 400 && hasDog) {
                hasDog = false; // dog is no longer
                System.out.println(hasDog ? "dog is longer" : "dog is no longer");
        }
        }
    }// deliquent

}// class