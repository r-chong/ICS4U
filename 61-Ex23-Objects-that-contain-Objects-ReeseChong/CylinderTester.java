public class CylinderTester {

    public static void run() {
        System.out.println("-------------------Cylinder Tester-------------------");

        Cylinder cylinder = new Cylinder(1.2, 4.56);
        System.out.println("Cylinder area: " + cylinder.area());
        System.out.println("Cylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder volume: " + cylinder.volume());

        cylinder.setHeight(4.2);
        System.out.println("Your new height is: " + cylinder.getHeight());

        cylinder.setRadius(22.2);
        System.out.println("Your new radius is: " + cylinder.getRadius());

        System.out.println("Cylinder volume after setters: " + cylinder.volume());

    }
}