//****incomplete*****
public class Pantry4Tester {
    public static void run() {
        ExpirationDate date1 = new ExpirationDate(05, 12, 1994, 100);
        Jam strawberry = new Jam("Strawberry", date1, 20);
        Jam raspberry = new Jam("Raspberry", "09122023", 10);
        Jam cherry = new Jam("Cherry", "10112023", 20);

        // Cases with 3

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Jar1 has the oldest date" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");
        // jar1 has oldest date
        Pantry4 Hubbard4 = new Pantry4(strawberry, raspberry, cherry);
        System.out.println(Hubbard4);
        Hubbard4.mixedFruit();
        System.out.println(Hubbard4);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Jar2 has the oldest date" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");
        // jar2 has oldest date
        strawberry = new Jam("Strawberry", "19051994", 20);
        raspberry = new Jam("Raspberry", "09121965", 10);
        cherry = new Jam("Cherry", "10112023", 20);
        Hubbard4 = new Pantry4(strawberry, raspberry, cherry);
        System.out.println(Hubbard4);
        Hubbard4.mixedFruit();
        System.out.println(Hubbard4);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Jar1 has the oldest date" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");
        // jar3 has oldest date
        strawberry = new Jam("Strawberry", "28021902", 20);
        raspberry = new Jam("Raspberry", "09122018", 10);
        cherry = new Jam("Cherry", "10111945", 20);
        Hubbard4 = new Pantry4(strawberry, raspberry, cherry);
        System.out.println(Hubbard4);
        Hubbard4.mixedFruit();
        System.out.println(Hubbard4);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Average mix" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");
        // mix all 3 when they are all <20mL of jam
        strawberry = new Jam("Strawberry", "01012010", 20);
        raspberry = new Jam("Raspberry", "09122006", 10);
        cherry = new Jam("Cherry", "10112023", 20);
        Hubbard4 = new Pantry4(strawberry, raspberry, cherry);
        System.out.println(Hubbard4);
        Hubbard4.mixedFruit();
        System.out.println(Hubbard4);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "TWO CONSTRUCTOR VARIABLES" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");
        // cases with 2 jams
        strawberry = new Jam("Strawberry", "06062023", 20);
        raspberry = new Jam("Raspberry", "09122023", 10);
        Hubbard4 = new Pantry4(strawberry, raspberry);
        System.out.println(Hubbard4);
        Hubbard4.mixedFruit();
        System.out.println(Hubbard4);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Jar1 has the oldest date" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");
        // jar1 has oldest date
        strawberry = new Jam("Strawberry", "09112019", 20);
        raspberry = new Jam("Raspberry", "09122019", 10);
        Hubbard4 = new Pantry4(strawberry, raspberry);
        System.out.println(Hubbard4);
        Hubbard4.mixedFruit();
        System.out.println(Hubbard4);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Jar2 has the oldest date" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");
        // jar2 has oldest date
        strawberry = new Jam("Strawberry", "10122017", 20);
        raspberry = new Jam("Raspberry", "09122017", 10);
        Hubbard4 = new Pantry4(strawberry, raspberry);
        System.out.println(Hubbard4);
        Hubbard4.mixedFruit();
        System.out.println(Hubbard4);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Jar3 has the oldest date" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");
        // jar2 has oldest date
        strawberry = new Jam("Strawberry", "09122046", 20);
        raspberry = new Jam("Raspberry", "09122038", 10);
        Hubbard4 = new Pantry4(strawberry, raspberry);
        System.out.println(Hubbard4);
        Hubbard4.mixedFruit();
        System.out.println(Hubbard4);

    }
}