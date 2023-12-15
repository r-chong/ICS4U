// -------------------------------------------------------------
// Electric Tester: The class that contains only type ElectricType. The file tests this
// Written by Reese Chong
// 2023-12-24
// -------------------------------------------------------------
public class ElectricTypeTester {
    public static void run() {
        ElectricType pikachu = new ElectricType("Pikachu", 13.2, 35, "Electric", 1000.0, 5.0);
        ElectricType raichu = new ElectricType("Raichu", 30.0, 60, "Electric", 1200.0, 6.0);
        ElectricType jolteon = new ElectricType("Jolteon",
                24.5, 65, "Electric", 1100.0, 4.5);
        ElectricType electabuzz = new ElectricType("Electabuzz", 66.1, 75, "Electric", 1300.0, 5.5);

        // getter test 1
        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Electric Type Pokemon (Child): Getter test 1" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(pikachu);
        printYellow("Name: " + pikachu.getName());
        printYellow("Weight: " + pikachu.getWeight());
        printYellow("HP: " + pikachu.getHp());
        printYellow("Type: " + pikachu.getType());
        printYellow("Wattage: " + pikachu.getWattage());
        printYellow("Amperage: " + pikachu.getAmperage());

        // getter test 2
        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Electric Type Pokemon (Child): Getter test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(raichu);
        printYellow("Name: " + raichu.getName());
        printYellow("Weight: " + raichu.getWeight());
        printYellow("HP: " + raichu.getHp());
        printYellow("Type: " + raichu.getType());
        printYellow("Wattage: " + raichu.getWattage());
        printYellow("Amperage: " + raichu.getAmperage());

        // getter test 3
        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Electric Type Pokemon (Child): Getter test 3" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(jolteon);
        printYellow("Name: " + jolteon.getName());
        printYellow("Weight: " + jolteon.getWeight());
        printYellow("HP: " + jolteon.getHp());
        printYellow("Type: " + jolteon.getType());
        printYellow("Wattage: " + jolteon.getWattage());
        printYellow("Amperage: " + jolteon.getAmperage());

        // getter test 4
        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Electric Type Pokemon (Child): Getter test 4" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(electabuzz);
        printYellow("Name: " + electabuzz.getName());
        printYellow("Weight: " + electabuzz.getWeight());
        printYellow("HP: " + electabuzz.getHp());
        printYellow("Type: " + electabuzz.getType());
        printYellow("Wattage: " + electabuzz.getWattage());
        printYellow("Amperage: " + electabuzz.getAmperage());

        System.out.println("\n///////////////////////////////////////////////");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "SETTER TESTS" + Library.TEXT_RESET);
        System.out.println("///////////////////////////////////////////////\n");

        // setter tes 1
        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Electric Type Pokemon (Child): Setter test 1" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(pikachu);
        pikachu.setHp(70);
        printYellow("expected hp value: 70");
        System.out.println(pikachu);

        // setter test 2
        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Electric Type Pokemon (Child): Setter test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(raichu);
        raichu.setHp(50);
        printYellow("expected hp value 50");
        System.out.println(raichu);

        // setter test 3
        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Electric Type Pokemon (Child): Setter test 3" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(jolteon);
        jolteon.setHp(-100);
        printYellow("expected hp value: 0");
        System.out.println(jolteon);

        // setter test 3
        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Electric Type Pokemon (Child): Setter test 4" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(electabuzz);
        electabuzz.setHp(200);
        printYellow("expected hp value: 200");
        System.out.println(electabuzz);

        System.out.println("\n///////////////////////////////////////////////");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "SPECIAL METHOD TEST: ATTACK" + Library.TEXT_RESET);
        System.out.println("///////////////////////////////////////////////\n");

        // attack 1
        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Electric Type Pokemon (Child): Attack test 1" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("original hp " + pikachu.getHp());
        pikachu.attack(20);
        printYellow("expected hp value: 50");
        System.out.println("new hp " + pikachu.getHp());

        // attack 2
        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Electric Type Pokemon (Child): Attack test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("original hp " + raichu.getHp());
        raichu.attack(60);
        printYellow("expected hp value: 0");
        System.out.println("new hp " + raichu.getHp());

        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Electric Type Pokemon (Child): Attack test 3" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("original hp " + jolteon.getHp());
        jolteon.attack(0);
        printYellow("expected hp value: 0");
        System.out.println("new hp " + jolteon.getHp());

        System.out.println("-----------------------");
        System.out.println(
                Library.GREEN_BOLD_BRIGHT + "Electric Type Pokemon (Child): Attack test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("original hp " + electabuzz.getHp());
        electabuzz.attack(150);
        printYellow("expected hp value: 50");
        System.out.println("new hp " + electabuzz.getHp());
    }

    public static void printYellow(String str) {
        System.out.println(Library.TEXT_YELLOW_BOLD + str + Library.TEXT_RESET);
    }
}