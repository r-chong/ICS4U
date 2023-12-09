public class Pantry2 {
    // Instance Variables
    private Jam jar1;
    private Jam jar2;
    private Jam jar3;
    private Jam selected;

    // Constructors
    // null null null
    Pantry2() {
        this.jar1 = null;
        this.jar2 = null;
        this.jar3 = null;
        selected = null;
    }

    // jar1 null null
    Pantry2(Jam jar1) {
        this.jar1 = jar1;
        this.jar2 = null;
        this.jar3 = null;
        selected = null;
    }

    // jar1 jar2 null
    Pantry2(Jam jar1, Jam jar2) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = null;
        selected = jar1;
    }

    // jar1 jar2 jar3
    Pantry2(Jam jar1, Jam jar2, Jam jar3) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        selected = jar1;
    }

    // Methods
    // to STring method taking nulls into cacount
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

    // select method taking nulls into account
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

    // spread the selected jam
    public void spread(int ml) {
        selected.spread(ml);
    }
}