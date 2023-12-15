// -------------------------------------------------------------
// Rock Type Tester: The class that contains only type Rock Type. The file tests this
// Written by Reese Chong
// 2023-12-24
// -------------------------------------------------------------
public class RockTypeTester {
    public static void run() {
        RockType geodude = new RockType("Geodude", 44.1, 40, "Rock", "Granite", 350.0);
        RockType onix = new RockType("Onix", 463.0, 70, "Rock", "Boulder", 500.0);
        RockType rhyhorn = new RockType("Rhyhorn", 253.5, 80, "Rock", "Basalt", 400.0);
        RockType graveler = new RockType("Graveler", 231.5, 55, "Rock", "Limestone", 450.0);

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Getter test 1" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(geodude);
        printYellow("Name: " + geodude.getName());
        printYellow("Weight: " + geodude.getWeight());
        printYellow("HP: " + geodude.getHp());
        printYellow("Type: " + geodude.getType());
        printYellow("Rock Material: " + geodude.getRockMaterial());
        printYellow("Sharpness (BESS Standard): " + geodude.getSharpness());

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Getter test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(onix);
        printYellow("Name: " + onix.getName());
        printYellow("Weight: " + onix.getWeight());
        printYellow("HP: " + onix.getHp());
        printYellow("Type: " + onix.getType());
        printYellow("Rock Material: " + onix.getRockMaterial());
        printYellow("Sharpness (BESS Standard): " + onix.getSharpness());

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Getter test 3" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(rhyhorn);
        printYellow("Name: " + rhyhorn.getName());
        printYellow("Weight: " + rhyhorn.getWeight());
        printYellow("HP: " + rhyhorn.getHp());
        printYellow("Type: " + rhyhorn.getType());
        printYellow("Rock Material: " + rhyhorn.getRockMaterial());
        printYellow("Sharpness (BESS Standard): " + rhyhorn.getSharpness());

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Getter test 4" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(graveler);
        printYellow("Name: " + graveler.getName());
        printYellow("Weight: " + graveler.getWeight());
        printYellow("HP: " + graveler.getHp());
        printYellow("Type: " + graveler.getType());
        printYellow("Rock Material: " + graveler.getRockMaterial());
        printYellow("Sharpness (BESS Standard): " + graveler.getSharpness());

        System.out.println("\n///////////////////////////////////////////////");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "SETTER TESTS" + Library.TEXT_RESET);
        System.out.println("///////////////////////////////////////////////\n");

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Setter test 1" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(geodude);
        geodude.setHp(30);
        printYellow("expected hp value: 30");
        System.out.println(geodude);

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Setter test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(onix);
        onix.setHp(100);
        printYellow("expected hp value 100");
        System.out.println(onix);

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Setter test 3" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(rhyhorn);
        rhyhorn.setHp(-30);
        printYellow("expected hp value: 0");
        System.out.println(rhyhorn);

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Setter test 4" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(graveler);
        graveler.setHp(75);
        printYellow("expected hp value: 75");
        System.out.println(graveler);

        System.out.println("\n///////////////////////////////////////////////");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "SPECIAL METHOD TEST: ATTACK" + Library.TEXT_RESET);
        System.out.println("///////////////////////////////////////////////\n");

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Attack test 1" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("original hp " + geodude.getHp());
        geodude.attack(10);
        printYellow("expected hp value: 20");
        System.out.println("new hp " + geodude.getHp());

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Attack test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("original hp " + onix.getHp());
        onix.attack(120);
        printYellow("expected hp value: 0");
        System.out.println("new hp " + onix.getHp());

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Attack test 3" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("original hp " + rhyhorn.getHp());
        rhyhorn.attack(0);
        printYellow("expected hp value: 0");
        System.out.println("new hp " + rhyhorn.getHp());

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Pokemon (Parent): Attack test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println("original hp " + graveler.getHp());
        graveler.attack(30);
        printYellow("expected hp value: 45");
        System.out.println("new hp " + graveler.getHp());

        System.out.println("\n///////////////////////////////////////////////");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "SET SHARPNESS TESTS" + Library.TEXT_RESET);
        System.out.println("///////////////////////////////////////////////\n");

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Rock Type: Set Sharpness test 1" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(geodude);
        geodude.setSharpness(400.0);
        printYellow("expected sharpness value: 400.0");
        System.out.println(geodude);

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Rock Type: Set Sharpness test 2" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(onix);
        onix.setSharpness(550.0);
        printYellow("expected sharpness value: 550.0");
        System.out.println(onix);

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Rock Type: Set Sharpness test 3" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(rhyhorn);
        rhyhorn.setSharpness(450.0);
        printYellow("expected sharpness value: 450.0");
        System.out.println(rhyhorn);

        System.out.println("-----------------------");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Rock Type: Set Sharpness test 4" + Library.TEXT_RESET);
        System.out.println("-----------------------");
        System.out.println(graveler);
        graveler.setSharpness(500.0);
        printYellow("expected sharpness value: 500.0");
        System.out.println(graveler);
    }

    public static void printYellow(String str) {
        System.out.println(Library.TEXT_YELLOW_BOLD + str + Library.TEXT_RESET);
    }
}