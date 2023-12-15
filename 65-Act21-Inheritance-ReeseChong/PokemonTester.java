// -------------------------------------------------------------
// Pokemon Tester: The class that has default pokemon (the parent class)
// Written by Reese Chong
// 2023-12-24
// -------------------------------------------------------------
public class PokemonTester {
    public static void run() {
        // the inputs are in the form String name, double weight, int HP, String type

        // initialize
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 15.2, 45, "Grass");
        Pokemon jigglypuff = new Pokemon("Jigglypuff", 12.1, 20, "Fairy");
        Pokemon squirtle = new Pokemon("Squirtle", 19.8, 44, "Water");
        Pokemon eevee = new Pokemon("Eevee", 14.3, 55, "Normal");

        // getter 1
        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Getter test 1" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(bulbasaur);
        printYellow("Name: " + bulbasaur.getName());
        printYellow("Weight: " + bulbasaur.getWeight());
        printYellow("HP: " + bulbasaur.getHp());
        printYellow("Type: " + bulbasaur.getType());

        // getter 2
        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Getter test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(jigglypuff);
        printYellow("Name: " + jigglypuff.getName());
        printYellow("Weight: " + jigglypuff.getWeight());
        printYellow("HP: " + jigglypuff.getHp());
        printYellow("Type: " + jigglypuff.getType());

        // getter 3
        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Getter test 3" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(squirtle);
        printYellow("Name: " + squirtle.getName());
        printYellow("Weight: " + squirtle.getWeight());
        printYellow("HP: " + squirtle.getHp());
        printYellow("Type: " + squirtle.getType());

        // getter test 4
        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Getter test 4" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(eevee);
        printYellow("Name: " + eevee.getName());
        printYellow("Weight: " + eevee.getWeight());
        printYellow("HP: " + eevee.getHp());
        printYellow("Type: " + eevee.getType());

        // getter test 5
        System.out.println("\n///////////////////////////////////////////////");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "SETTER TESTS" + Library.TEXT_RESET);
        System.out.println("///////////////////////////////////////////////\n");

        // getter test 5
        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Setter test 1" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(bulbasaur);
        bulbasaur.setHp(54);
        printYellow("expected hp value: 54");
        System.out.println(bulbasaur);

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Setter test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(jigglypuff);
        jigglypuff.setHp(0);
        printYellow("expected hp value 0");
        System.out.println(jigglypuff);

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Setter test 3" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(squirtle);
        squirtle.setHp(-100);
        printYellow("expected hp value: 0");
        System.out.println(squirtle);

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Setter test 4" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(eevee);
        eevee.setHp(1000000);
        printYellow("expected hp value: 1000000");
        System.out.println(eevee);

        System.out.println("\n///////////////////////////////////////////////");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "SPECIAL METHOD TEST: ATTACK" + Library.TEXT_RESET);
        System.out.println("///////////////////////////////////////////////\n");

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Attack test 1" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("hp:" + bulbasaur.getHp());
        bulbasaur.attack(10);
        printYellow("expected hp value: 44");
        System.out.println("new hp:" + bulbasaur.getHp());

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Attack test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("hp:" + jigglypuff.getHp());
        jigglypuff.attack(1);
        printYellow("expected hp value: 0");
        System.out.println("new hp:" + jigglypuff.getHp());

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Attack test 3" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("hp:" + squirtle.getHp());
        squirtle.attack(1);
        printYellow("expected hp value: 0");
        System.out.println("new hp:" + squirtle.getHp());

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Attack test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("hp:" + eevee.getHp());
        eevee.attack(100);
        printYellow("expected hp value: 999900");
        System.out.println("new hp:" + eevee.getHp());
    }

    public static void printYellow(String str) {
        System.out.println(Library.TEXT_YELLOW_BOLD + str + Library.TEXT_RESET);
    }

}