// -------------------------------------------------------------
// Objects inside Objects: The class that contains all of the 3 related objects from part 1 and 2
// Written by Reese Chong
// 2023-12-24
// -------------------------------------------------------------

import java.util.ArrayList;
import java.util.Arrays;

public class PokeBall {
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    ArrayList<ElectricType> electricTypes = new ArrayList<ElectricType>();
    ArrayList<RockType> rockTypes = new ArrayList<RockType>();
    String trainer;
    String ballType;

    // Constructor
    public PokeBall(String trainer, String ballType) {
        this.trainer = trainer;
        this.ballType = ballType;
    }

    // methods

    // toString
    // loop through and write the ifferent types into variable
    public String toString() {

        String allPokemons = Library.TEXT_BLACK_ON_WHITE + "Pokemon:" + Library.TEXT_RESET + "\n";
        String allElectricTypes = Library.TEXT_YELLOW_BOLD + "Electric Types:" + Library.TEXT_RESET + "\n";
        String allRockTypes = Library.TEXT_BROWN_BOLD + "Rock Types:" + Library.TEXT_RESET + "\n";

        for (int i = 0; i < pokemons.size(); i++) {
            allPokemons += pokemons.get(i) + "\n\n";
        }

        for (int i = 0; i < electricTypes.size(); i++) {
            allElectricTypes += electricTypes.get(i) + "\n\n";
        }

        for (int i = 0; i < rockTypes.size(); i++) {
            allRockTypes += rockTypes.get(i) + "\n\n";
        }
        return "Trainer: " + trainer + " \t\tPoke Ball Type: " + ballType + " ball\n\n" + allPokemons + allElectricTypes
                + allRockTypes;
    }
}