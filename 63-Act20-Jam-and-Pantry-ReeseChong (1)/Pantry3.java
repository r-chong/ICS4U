public class Pantry3 {
    // Instance Variables
    private Jam jar1;
    private Jam jar2;
    private Jam jar3;
    private Jam selected;

    // Constructors
    Pantry3() {
        this.jar1 = null;
        this.jar2 = null;
        this.jar3 = null;
        selected = null;
    }

    Pantry3(Jam jar1) {
        this.jar1 = jar1;
        this.jar2 = null;
        this.jar3 = null;
        selected = null;
    }

    Pantry3(Jam jar1, Jam jar2) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = null;
        selected = jar1;
    }

    Pantry3(Jam jar1, Jam jar2, Jam jar3) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        selected = jar1;
    }

    // Methods
    public String toString() {
        String str = "";
        if (jar1 != null) {
            str += "\n1: " + jar1.toString() + "\n";
        }
        if (jar2 != null) {
            str += "\n2: " + jar2.toString() + "\n";
        }
        if (jar3 != null) {
            str += "\n3: " + jar3.toString() + "\n";
        }
        return str;
    }

    public boolean select(int jarNumber) {
        if (jarNumber == 1 && jar1 != null) {
            selected = jar1;
            return true;
        } else if (jarNumber == 2 && jar2 != null) {
            selected = jar2;
            return true;
        } else if (jarNumber == 3 && jar3 != null) {
            selected = jar3;
            return true;
        }
        return false;
    }

    public void replace(Jam j, int slot) {
        if (slot == 1 && jar1 != null) {
            jar1 = j;
            System.out.println("Replace " + slot + " with " + j.contents);
        } else if (slot == 2 && jar1 != null) {
            jar2 = j;
            System.out.println("Replace " + slot + " with " + j.contents);
        } else if (slot == 3 && jar1 != null) {
            jar3 = j;
            System.out.println("Replace " + slot + " with " + j.contents);
        }
    }

    // spread the selected jam
    public void spread(int ml) {
        selected.spread(ml);
    }
}