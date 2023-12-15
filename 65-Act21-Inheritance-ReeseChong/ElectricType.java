// -------------------------------------------------------------
// Child class: Electric type
// Written by Reese Chong
// 2023-12-24
// -------------------------------------------------------------

class ElectricType extends Pokemon {
    private double wattage;
    private double amperage;

    // constructor
    public ElectricType(String name, double weight, int hp, String type, double wattage, double amperage) {
        super(name, weight, hp, type);
        this.wattage = wattage;
        this.amperage = amperage;
    }

    // toString
    public String toString() {
        return super.toString() + "\n- Wattage: " + Double.toString(wattage) + "\n- Amperage: "
                + Double.toString(amperage);
    }

    // ###############
    // GETTERS
    // ###############

    public double getWattage() {
        return wattage;
    }

    public double getAmperage() {
        return amperage;
    }

    // ###############
    // SETTERS
    // ###############

    // as these attributes refer to the average wattage and average amperage for the
    // species,
    // they are not changing by the minute and thus are not settable

}