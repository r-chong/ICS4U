import java.text.DecimalFormat;

public class Cone {
    DecimalFormat df = new DecimalFormat("0.##");

    // instance variables with encapsulation (Private)
    private double radius; // radius of the Base
    private double height; // height of the cone

    // constructor
    // recalling
    // this operator only needed if the variables are the same..
    // this.radius is the private one (the radius of the object)
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    } // end constructor

    public double area() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    // any time you do math with doubles, you need to put a .0
    // otherwise java does unnecessary integer conversions resulting in lost decimal
    // points
    public double volume() {
        return height / 3.0 * Math.PI * (radius * radius);
    }

    //////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////

    // naming convention for getter is having a get
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    ////////////////////////////////////////////////////////////////
    // setter Methods
    ////////////////////////////////////////////////////////////////

    // don't do error messages, objects are just clean and secure
    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        }
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }
}