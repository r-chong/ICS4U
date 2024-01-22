public class Pantry4 {
    // Instance Variables
    public Jam jar1;
    public Jam jar2;
    public Jam jar3;
    public Jam selected;

    // Constructors
    Pantry4(Jam jar1) {
        this.jar1 = jar1;
        this.jar2 = null;
        this.jar3 = null;
        selected = null;
    }

    Pantry4(Jam jar1, Jam jar2) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = null;
        selected = null;
    }

    Pantry4(Jam jar1, Jam jar2, Jam jar3) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        selected = null;
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

    // select method
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

    // replace method
    public void replace(Jam j, int slot) {
        if (slot == 1 && jar1 != null) {
            jar1 = j;
            System.out.println(Library.TEXT_GREEN + "Replace slot " + slot + " with " + j.contents + Library.TEXT_RESET);
        } else if (slot == 2 && jar1 != null) {
            jar2 = j;
            System.out.println(Library.TEXT_GREEN + "Replace slot " + slot + " with " + j.contents+ Library.TEXT_RESET);
        } else if (slot == 3 && jar1 != null) {
            jar3 = j;
            System.out.println(Library.TEXT_GREEN + "Replace slot " + slot + " with " + j.contents+ Library.TEXT_RESET);
        }
    }

    // spread the selected jam
    public void spread(int ml) {
        selected.spread(ml);
    }

    public void mixedFruit() {
        // if we assume that jar1 is the biggest from the start, and then change that if
        // we find one that is bigger
        // (similar to some of the sorting algorithms)
        int oldestYear = jar1.date.year;
        int oldestDay = jar1.date.day;
        int oldestMonth = jar1.date.month;

        int totalCapacity = 0;
        if (select(1)) {
            int cap1 = jar1.capacity;

            if (cap1 <= 20) {
                totalCapacity += cap1;
            }
        }
        if (select(2)) {
            int cap2 = jar2.capacity;
            if (cap2 <= 20) {
                totalCapacity += cap2;
            }
        }
        if (select(3)) {
            int cap3 = jar3.capacity;
            if (cap3 <= 20) {
                totalCapacity += cap3;
            }
        }

        // check that jar2 is any of the below cases:
        // jar2's year is older than the current oldest date
        // its year is equal but month is greater
        // its year and month are equal
        // it's entirely equal
        if (select(2)) {
            if (jar2.date.year < oldestYear || (jar2.date.year == oldestYear && jar2.date.month < oldestMonth)
                    || (jar2.date.year == oldestYear && jar2.date.month == oldestMonth && jar2.date.day < oldestDay)) {
                oldestYear = jar2.date.year;
                oldestMonth = jar2.date.month;
                oldestDay = jar2.date.day;
            }
        }

        // check that jar3 is any of the below cases:
        // jar3's year is older than the current oldest date
        // its year is equal but month is greater
        // its year and month are equal
        // it's entirely equal
        if (select(3)) {
            if (jar3.date.year < oldestYear
                    || (jar3.date.year == oldestYear && jar3.date.month < oldestMonth)
                    || (jar3.date.year == oldestYear && jar3.date.month == oldestMonth && jar3.date.day == oldestDay)) {
                if (jar1.date.month < jar2.date.month && jar1.date.month < jar3.date.month) {
                    if (jar1.date.day < jar2.date.day && jar1.date.day < jar3.date.day) {
                        oldestYear = jar3.date.year;
                        oldestMonth = jar3.date.month;
                        oldestDay = jar3.date.day;
                    }
                }
            }
        }

        // make sure that when evaluating ints, it doesn't remove leading zeroes
        String newDate = String.format("%02d%02d%d", oldestDay, oldestMonth, oldestYear);

        Jam mixedJam = new Jam("Mixed Jam", newDate, totalCapacity);
        replace(mixedJam, 1);
        this.jar2 = null;
        this.jar3 = null;
    }
}