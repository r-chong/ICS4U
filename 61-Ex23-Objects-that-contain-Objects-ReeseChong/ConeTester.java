public class ConeTester {

    public static void run() {
        // this is how we know we make an object
        Cone cone = new Cone(1.2, 4.56);
        System.out.println("Cone area: " + cone.area());
        System.out.println("Cone radius: " + cone.getRadius());
        System.out.println("Cone height: " + cone.getHeight());
        System.out.println("Cone volume: " + cone.volume());

        cone.setHeight(4.2);
        System.out.println("Your new height is: " + cone.getHeight());

        cone.setRadius(22.2);
        System.out.println("Your new radius is: " + cone.getRadius());

        System.out.println("Cone volume after setters: " + cone.volume());

    }
}