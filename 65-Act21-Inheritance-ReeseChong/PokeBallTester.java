// -------------------------------------------------------------
// : The class that contains all of the 3 related objects from part 1 and 2
// Written by Reese Chong
// 2023-12-24
// -------------------------------------------------------------
public class PokeBallTester {
    public static void run() {
        Pokemon charizard = new Pokemon("Charizard", 400.0, 100, "Fire");
        Pokemon porygon = new Pokemon("Porygon", 60.0, 100, "Normal");
        Pokemon tauros = new Pokemon("Tauros", 490.0, 100, "Normal");
        Pokemon articuno = new Pokemon("Articuno", 580.0, 100, "Ice");
        Pokemon moltres = new Pokemon("Moltres", 580.0, 100, "Fire");
        Pokemon mew = new Pokemon("Mew", 600.0, 100, "Psychic");
        Pokemon meganium = new Pokemon("Meganium", 525.0, 100, "Grass");
        Pokemon typhlosion = new Pokemon("Typhlosion", 534.0, 100, "Fire");
        ElectricType pikachu = new ElectricType("Pikachu", 45.00, 100, "Electric", 100.0, 50.0);
        ElectricType zapdos = new ElectricType("Zapdos", 580.0, 100, "Electric", 100.0, 40.0);
        ElectricType ampharos = new ElectricType("Ampharos", 135.6, 90, "Electric", 1500.0, 7.0);
        ElectricType manectric = new ElectricType("Manectric", 88.6, 70, "Electric", 1400.0, 6.5);
        ElectricType luxray = new ElectricType("Luxray", 92.6, 80, "Electric", 1450.0, 6.8);
        ElectricType electivire = new ElectricType("Electivire", 305.6, 85, "Electric", 1600.0, 8.0);
        ElectricType zekrom = new ElectricType("Zekrom", 760.6, 100, "Electric", 2500.0, 12.0);
        RockType onix = new RockType("Onix", 1200.00, 100, "Rock", "granite", 1700.0);
        RockType aerodactyl = new RockType("Aerodactyl", 515.0, 100, "Rock", "adamantium", 500.0);
        RockType gigalith = new RockType("Gigalith", 521.0, 90, "Rock", "diamond", 700.0);
        RockType lycanroc = new RockType("Lycanroc", 487.0, 112, "Rock", "granite", 600.0);
        RockType rampardos = new RockType("Rampardos", 495.0, 58, "Rock", "obsidian", 750.0);
        RockType corsola = new RockType("Corsola", 410.0, 55, "Rock", "coral", 400.0);

        // the object that contains objects
        PokeBall masterBall = new PokeBall("Reese", "Master");

        // add pokemon individually to the ball
        masterBall.pokemons.add(charizard);
        masterBall.pokemons.add(porygon);
        masterBall.pokemons.add(tauros);
        masterBall.pokemons.add(articuno);
        masterBall.pokemons.add(moltres);
        masterBall.pokemons.add(mew);
        masterBall.pokemons.add(meganium);
        masterBall.pokemons.add(typhlosion);
        masterBall.electricTypes.add(pikachu);
        masterBall.electricTypes.add(zapdos);
        masterBall.electricTypes.add(ampharos);
        masterBall.electricTypes.add(manectric);
        masterBall.electricTypes.add(luxray);
        masterBall.electricTypes.add(electivire);
        masterBall.electricTypes.add(zekrom);
        masterBall.rockTypes.add(onix);
        masterBall.rockTypes.add(aerodactyl);
        masterBall.rockTypes.add(gigalith);
        masterBall.rockTypes.add(lycanroc);
        masterBall.rockTypes.add(rampardos);
        masterBall.rockTypes.add(corsola);

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "OBJ of OBJ: Test Contents" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        // test outputs
        System.out.println("Pokeball contents: " + masterBall);

        System.out.println("\n///////////////////////////////////////////////");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "GETTER TESTS" + Library.TEXT_RESET);
        System.out.println("///////////////////////////////////////////////\n");

        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT
                        + "Child arraylist: Test accessing get methods of child (within the arraylists)"
                        + Library.TEXT_RESET);
        System.out.println("-----------------------");
        // test accessing attributes of contained pokemon
        for (int i = 0; i < masterBall.rockTypes.size(); i++) {
            System.out.println(masterBall.rockTypes.get(i).getName() + " sharpness: "
                    + masterBall.rockTypes.get(0).getSharpness());
            System.out.println(masterBall.rockTypes.get(i).getName() + " rock material: "
                    + masterBall.rockTypes.get(0).getRockMaterial());
        }

        for (int i = 0; i < masterBall.electricTypes.size(); i++) {
            System.out.println(masterBall.electricTypes.get(i).getName() + " wattage: "
                    + masterBall.electricTypes.get(0).getWattage());
            System.out.println(masterBall.electricTypes.get(i).getName() + " amperage:"
                    + masterBall.electricTypes.get(0).getAmperage());
        }

        System.out.println("///////////////////////////////////////////////\n");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "SETTER TESTS" + Library.TEXT_RESET);
        System.out.println("///////////////////////////////////////////////\n");

        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Child arraylist: Test accessing set methods of child 1"
                        + Library.TEXT_RESET);
        System.out.println("-----------------------");
        // test that attack works here
        System.out.println("Charizard before attack: " + charizard);
        masterBall.pokemons.get(0).attack(30);
        printYellow("Expected hp: 70");
        System.out.println("Charizard after attack: " + masterBall.pokemons.get(0));

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Child arraylist: Test accessing set methods of child 2"
                + Library.TEXT_RESET);
        System.out.println("-----------------------");
        // test that hp works here
        System.out.println("Porygon before set hp: " + porygon);
        masterBall.pokemons.get(1).setHp(80);
        printYellow("Expected hp: 80");
        System.out.println("Porygon after set hp: " + masterBall.pokemons.get(1));

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Child arraylist: Test accessing set methods of child 3"
                + Library.TEXT_RESET);
        System.out.println("-----------------------");
        // test that hp works here
        System.out.println("Zapdos before set hp: " + zapdos);
        masterBall.electricTypes.get(1).setHp(-10);
        printYellow("Expected hp: 0");
        System.out.println("Zapdos after set hp: " + masterBall.electricTypes.get(1));

        // value greater than current HP
        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Child arraylist: Test accessing set methods of child 4"
                + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("Onix before attack: " + onix);
        masterBall.rockTypes.get(0).attack(200);
        printYellow("Expected hp: 0");
        System.out.println("Onix after attack: " + masterBall.rockTypes.get(0));

        // hp recovery test (it's a pokemon move)
        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Child arraylist: Test accessing set methods of child 5"
                + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("Tauros before HP recovery: " + tauros);
        tauros.setHp(tauros.getHp() + 20); // Assuming HP recovery is allowed
        printYellow("Expected hp: 120");
        System.out.println("Tauros after HP recovery: " + tauros);

        // attack with zero damage
        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Child arraylist: Test accessing set methods of child 6"
                + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("Articuno before attack: " + articuno);
        articuno.attack(0);
        printYellow("Expected hp: 100 (no change)");
        System.out.println("Articuno after attack: " + articuno);

        // set to a very high value
        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Child arraylist: Test accessing set methods of child 7"
                + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("Moltres before set hp: " + moltres);
        moltres.setHp(100000);
        printYellow("Expected hp: 100000");
        System.out.println("Moltres after set hp: " + moltres);
    }

    public static void printYellow(String str) {
        System.out.println(Library.TEXT_YELLOW_BOLD + str + Library.TEXT_RESET);
    }
}