public class Jam {
    // Instance Variables
    public String contents; // type of fruit in the jar
    public ExpirationDate date; // date packaged and shelf Life
    public int capacity; // amount of jam in the jar

    // Constructors
    public Jam(String contents, ExpirationDate date, int size) {
        this.contents = contents;
        this.date = date;
        capacity = size;
    }

    public Jam(String contents, String date, int size) {
        this.contents = contents;
        this.date = new ExpirationDate(date, 200);
        capacity = size;
    }

    // Methods
    public boolean empty() {
        return (capacity == 0);
    }

    public String toString() {
        return contents + "\n" + date + "\nCapacity: " + capacity + " ml.";
    }

    public void spread(int ml) {
        if (!empty()) {
            // if what they want to spread is less than capacity, it spreads it
            if (ml <= capacity && ml >= 0) {
                System.out.println(Library.TEXT_GREEN + "Spreading " + ml + " ml " + contents + Library.TEXT_RESET);
                capacity = capacity - ml;
            }
            // if it is more then nothing happens
            else {
                System.out
                        .println(Library.TEXT_GREEN + "Spreading " + capacity + " ml " + contents + Library.TEXT_RESET);
                capacity = 0;
            }
        }
        // if empty then give error
        else
            System.out.println("No jam in the Jar!");
    }

    public int getCapacity() {
        return capacity;
    }

}