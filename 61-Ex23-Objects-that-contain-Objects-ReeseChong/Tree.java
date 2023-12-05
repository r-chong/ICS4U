public class Tree {
    private double x, y, z; // locatoin of tree
    private Cone branches;
    private Cylinder trunk;

    // constructor
    public Tree(double trRad, double trHeight, double brRad, double brHeight, double x, double y, double z) {
        trunk = new Cylinder(trRad, trHeight);
        branches = new Cone(brRad, brHeight);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        double totalHeight = branches.getHeight() + trunk.getHeight();
        double totalWidth = branches.getRadius() * 2.0;

        return "Height: " + totalHeight + " Width: " + totalWidth + " Area:" + area() + "Volume: " + volume();
    }

    public double area() {
        double total = trunk.area() + branches.area();
        double rad = trunk.getRadius();
        double circle = Math.PI * rad * rad;

        return total - 2 * circle; // remove overpap
    }

    public double volume() {
        return trunk.volume() + branches.volume();
    }

    public void grow(double rate) {
        // increase all dimensions
        branches.setHeight(branches.getHeight() * (1.0 + rate));
        branches.setRadius(branches.getRadius() * (1.0 + rate));
        trunk.setHeight(trunk.getHeight() * (1.0 + rate));
        trunk.setRadius(trunk.getRadius() * (1.0 + rate));

    }

    public Cone getBranches() {
        return branches;
    }

    public Cylinder getTrunk() {
        return trunk;
    }
}