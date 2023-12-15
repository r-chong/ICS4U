// -------------------------------------------------------------
// Child class: Rock Type type
// Written by Reese Chong
// 2023-12-24
// -------------------------------------------------------------

class RockType extends Pokemon {
    private String rockMaterial;
    private double sharpness; // The standard used to determine the sharpness of knives is called the BESS
                              // (Brubacher Edge Sharpness )

    // constructor
    public RockType(String name, double weight, int hp, String type, String rockMaterial, double sharpness) {
        super(name, weight, hp, type);
        this.rockMaterial = rockMaterial;
        this.sharpness = sharpness;
    }

    public String toString() {
        return super.toString() + "\n- Rock Material: " + rockMaterial + "\n- Sharpness: " + Double.toString(sharpness);
    }

    // ###############
    // GETTERS
    // ###############

    public String getRockMaterial() {
        return rockMaterial;
    }

    public double getSharpness() {
        return sharpness;
    }

    // ###############
    // SETTERS
    // ###############

    // rock material is stable for rock pokemon, thus that variable will not change
    // things can get duller, thus a sharpnesssetter has been created

    public void setSharpness(double newSharpness) {
        sharpness = newSharpness;
    }
}