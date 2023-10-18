public class Act11_Coins {
    private double radius;
    private String coinName;
    private double centsValue;
    private double coinWeight;

    // A constructor that takes in the name and radius as parameters

    // constructor
    public Act11_Coins(String name, double radius, double cents, double weight) {
        this.coinName = name;
        this.radius = radius;
        centsValue = cents;
        coinWeight = weight;
    } // constructor

    // getter method
    public String getName() {
        return coinName;
    }

    public double getRadius() {
        return radius;
    }

    public void printCircumference() {
        double circumference = 2 * Math.PI * radius;
        
        System.out.println("A " + coinName + "’s circumference is " + Library.df.format(circumference) + " millimetres");
    }

    public void printArea() {
        double surfaceArea = Math.PI * radius * radius;
        
        System.out.println("The surface area of one side of a " + coinName + " is " + Library.df.format(surfaceArea) + " millimetres squared");
    }

    public void printValue() {
        System.out.println(coinName + " has a value of " + Library.df.format(centsValue) + " cents");
    }

    public void deflate(double percentage) {
        double deflation = centsValue - (percentage/100) * centsValue;
        
        if (deflation < coinWeight) {
            centsValue = coinWeight;
            System.out.println("Minimum value attained");
        } else {
            centsValue = deflation;
            System.out.println("Darn this government! Deflating by " + percentage + "% and reprinting once again.");
        }
    }
}// end class