public class Pantry2Tester {

    // this is the mass tester I created
    // it tests a value for all items in the pantry
    public static void selectSpread(Pantry2 hubbard, int amtToSpread) {
        // if jar1 is existent spread the amount to spread
        // update the status
        // else you can't spread nonexistent jam
        // update the status
        if (hubbard.select(1)) {
            hubbard.spread(amtToSpread);
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Updated values: " + Library.TEXT_RESET);
            System.out.println(hubbard);
        } else {
            System.out.println("Attempted to spread jar1");
            System.out.println(Library.TEXT_RED + "Selection not available" + Library.TEXT_RESET);
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Updated values: " + Library.TEXT_RESET);
            System.out.println(hubbard);
        }

        // if jar2 is existent spread the amount to spread
        // update the status
        // else you can't spread nonexistent jam
        // update the status
        if (hubbard.select(2)) {
            hubbard.spread(amtToSpread);
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Updated values: " + Library.TEXT_RESET);
            System.out.println(hubbard);
        } else {
            System.out.println("Attempted to spread jar2");
            System.out.println(Library.TEXT_RED + "Selection not available" + Library.TEXT_RESET);
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Updated values: " + Library.TEXT_RESET);

            System.out.println(hubbard);
        }

        // if jar3 is existent spread the amount to spread
        // update the status
        // else you can't spread nonexistent jam
        // update the status
        if (hubbard.select(3)) {
            hubbard.spread(amtToSpread);
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Updated values: " + Library.TEXT_RESET);
            System.out.println(hubbard);
        } else {
            System.out.println("Attempted to spread jar3");
            System.out.println(Library.TEXT_RED + "Selection not available" + Library.TEXT_RESET);
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Updated values: " + Library.TEXT_RESET);
            System.out.println(hubbard);
        }
    }

    public static void run() {
        // Jam objects are created and assigned the initial value amount
        ExpirationDate date1 = new ExpirationDate(05, 12, 2023, 100);
        Jam strawberry = new Jam("Strawberry", date1, 120);
        Jam raspberry = new Jam("Raspberry", "09122023", 80);
        Jam cherry = new Jam("Cherry", "10112023", 20);
        int randomNum;
        // Random number used for extensive testing.

        System.out.println("-----------------------------------------");
        // test with 1 constructed variable
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test with 1 constructed variable" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        randomNum = (int) (Math.random() * 200 + 1);
        Pantry2 singleHubbard = new Pantry2(strawberry);
        System.out.println(singleHubbard);

        // test for when spread is less than capacity
        // see selectSpread method at the bottom of the file
        selectSpread(singleHubbard, 10);

        System.out.println("-----------------------------------------");
        // test with 2 constructed variables
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test with 2 constructed variables" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");
        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 20);

        Pantry2 doubleHubbard = new Pantry2(strawberry, raspberry);
        System.out.println(doubleHubbard);

        // test for when spread is equal the capacity
        // see selectSpread method at the bottom of the file
        selectSpread(doubleHubbard, 80);

        System.out.println("-----------------------------------------");
        // test with 3 constructed variables
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test spreading negative" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        // test for negative
        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 20);

        randomNum = (int) (Math.random() * 200 + 1);
        Pantry2 tripleHubbard = new Pantry2(strawberry, raspberry, cherry);
        System.out.println(tripleHubbard);
        selectSpread(tripleHubbard, -1);

        System.out.println("-----------------------------------------");
        // test with 3 constructed variables
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test with 3 constructed variables" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");
        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 20);

        randomNum = (int) (Math.random() * 200 + 1);
        tripleHubbard = new Pantry2(strawberry, raspberry, cherry);
        System.out.println(tripleHubbard);

        // see selectSpread method at the bottom of the file
        selectSpread(tripleHubbard, 30);

        System.out.println("-----------------------------------------");
        // test with 3 constructed variables
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test spreading 0" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        // test for zero
        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 20);

        randomNum = (int) (Math.random() * 200 + 1);
        tripleHubbard = new Pantry2(strawberry, raspberry, cherry);
        System.out.println(tripleHubbard);
        selectSpread(tripleHubbard, 0);
    }
}
