// -------------------------------------------------------------
// Parent class: pokemon (this is the parent that has the instance variables that are super'd to the children)
// Written by Reese Chong
// 2023-12-24
// -------------------------------------------------------------

public class Pokemon {
    private String name; // name of the pokemon
    private double weight; // weight of the pokemon
    private String type; // type of the pokemon
    private int hp; // health points

    // constructor 1
    public Pokemon(String name) {
        this.name = name;
    }

    // constructor 2
    public Pokemon(String name, double weight, int hp, String type) {
        this.name = name;
        this.weight = weight;
        this.hp = hp;
        this.type = type;
    }

    // toString
    public String toString() {
        return name + " is a " + type + " type pokemon. \n- Health Points: " + hp + "\n- Weight: " + weight + "lbs";
    }

    // ###############
    // GETTERS
    // ###############

    public String getName() {
        // method to access the pokemon's name
        return name;
    }

    public double getWeight() {
        // method to access the pokemon's Weight
        return weight;
    }

    public String getType() {
        // method to access the pokemon's Type
        return type;
    }

    public int getHp() {
        // method to access the pokemon's HP
        return hp;
    }

    // ###############
    // SETTERS
    // ###############

    // set HP to new value
    // if HP goes below 0, it simply is set to 0
    public void setHp(int newHp) {
        if (newHp > 0) {
            hp = newHp;
        } else if (newHp <= 0) {
            hp = 0;
        }
    }

    // OTHER METHOD
    public void attack(int hit) {
        hit = Math.abs(hit);
        // enter an amount to attack the pokemon
        // attacks are always positive
        if (hit < hp) {
            hp -= hit;
        } else if (hit >= hp) {
            hp = 0;
            System.out.println(
                    Library.TEXT_RED_BOLD + name + " fainted! Take " + name + " to a pokemon center."
                            + Library.TEXT_RESET);
        }
    }
}