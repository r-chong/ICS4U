public class TreeTester {
    public static void run() {
        System.out.println("---------------------------------");
        Tree myTree = new Tree(1.0, 5.0, 25.0, 50.0, 1.0, 2.0, 3.0);
        System.out.println("Tree:" + myTree);
        myTree.grow(0.1);
        System.out.println("Grown tree: " + myTree);
    }
}