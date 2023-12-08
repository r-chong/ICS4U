public class ExpirationDate {
    public int day;
    public int month;
    public int year;
    public int shelfLife;

    public ExpirationDate(int day, int month, int year, int shelfLife) {
        // could check if date is valid
        this.day = day;
        this.month = month;
        this.year = year;
        this.shelfLife = shelfLife;
    }

    public ExpirationDate(String ddmmyyyy, int shelfLife) {
        this.day = Integer.parseInt(ddmmyyyy.substring(0, 2));
        this.month = Integer.parseInt(ddmmyyyy.substring(2, 4));
        this.year = Integer.parseInt(ddmmyyyy.substring(4, 8));
        this.shelfLife = shelfLife;
    }

    public String toString() {
        return "Packaged on: " + day + "-" + month + "-" + year + "\nExpires: " + shelfLife
                + " days after being packaged";
    }
}// end class