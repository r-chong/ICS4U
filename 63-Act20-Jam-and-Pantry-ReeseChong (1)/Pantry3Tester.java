public class Pantry3Tester {
    public static void run() {
        ExpirationDate date1 = new ExpirationDate(05, 12, 2023, 100);
        Jam strawberry = new Jam("Strawberry", date1, 120);
        Jam raspberry = new Jam("Raspberry", "09122023", 80);
        Jam cherry = new Jam("Cherry", "10112023", 160);

        Pantry3 Hubbard1 = new Pantry3(strawberry);
        System.out.println(Hubbard1);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "ONE CONSTRUCTOR VARIABLE" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        // check if exists
        if (Hubbard1.select(1)) {
            selectSpread(Hubbard1, 1);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }
        Jam jamJamFruitJam = new Jam("JamJamFruit Jam", "01012022", 120);
        Hubbard1.replace(jamJamFruitJam, 1);
        System.out.println(Hubbard1);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test replacement for jar2" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry);
        if (Hubbard1.select(2)) {
            Hubbard1.spread(50);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }
        Jam goblinBerryJam = new Jam("GoblinBerry Jam", "12022019", 70);
        Hubbard1.replace(goblinBerryJam, 2);
        System.out.println(Hubbard1);

        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Replace raspberry" + Library.TEXT_RESET);

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry);
        Hubbard1.replace(raspberry, 2);
        System.out.println(Hubbard1);

        if (Hubbard1.select(2)) {
            Hubbard1.spread(10);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test replacement for jar3" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry);
        // check if exists
        if (Hubbard1.select(1)) {
            selectSpread(Hubbard1, 1);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }
        Jam porgieBerry = new Jam("porgieBerry Jam", "09092018", 120);
        Hubbard1.replace(jamJamFruitJam, 1);
        System.out.println(Hubbard1);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test replacement for jar2" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry);
        if (Hubbard1.select(2)) {
            Hubbard1.spread(50);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }
        Jam sportsBerry = new Jam("sportsBerry Jam", "12012019", 18);
        Hubbard1.replace(goblinBerryJam, 2);
        System.out.println(Hubbard1);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "TWO CONSTRUCTOR VARIABLES" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry, raspberry);
        Hubbard1.replace(raspberry, 2);
        System.out.println(Hubbard1);

        if (Hubbard1.select(2)) {
            Hubbard1.spread(50);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test spreading" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry, raspberry);
        // check if exists
        if (Hubbard1.select(1)) {
            selectSpread(Hubbard1, 1);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }
        Jam blobfishBerry = new Jam("Blobfish Berry Jam", "01012024", 180);
        Hubbard1.replace(jamJamFruitJam, 1);
        System.out.println(Hubbard1);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test replacement for jar2" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry, raspberry);
        if (Hubbard1.select(3)) {
            Hubbard1.spread(50);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }
        Jam testerBerry = new Jam("TesterBerry Jam", "15072023", 170);
        Hubbard1.replace(goblinBerryJam, 2);
        System.out.println(Hubbard1);

        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Replace raspberry" + Library.TEXT_RESET);

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry, raspberry);
        Hubbard1.replace(raspberry, 2);
        System.out.println(Hubbard1);

        if (Hubbard1.select(2)) {
            Hubbard1.spread(50);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test replacement for jar3" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry, raspberry);
        // check if exists
        if (Hubbard1.select(1)) {
            selectSpread(Hubbard1, 1);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }
        Jam sleepyBerry = new Jam("sleepyBerry Jam", "02012023", 120);
        Hubbard1.replace(jamJamFruitJam, 1);
        System.out.println(Hubbard1);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test replacement for jar2" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry, raspberry);
        if (Hubbard1.select(2)) {
            Hubbard1.spread(50);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }
        Jam lastBerry = new Jam("LastBerry Jam", "18052024", 70);
        Hubbard1.replace(goblinBerryJam, 2);
        System.out.println(Hubbard1);

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry, raspberry);
        Hubbard1.replace(raspberry, 2);
        System.out.println(Hubbard1);

        if (Hubbard1.select(2)) {
            Hubbard1.spread(50);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test spreading" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry, raspberry);
        // check if exists
        if (Hubbard1.select(1)) {
            selectSpread(Hubbard1, 1);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }
        Jam darkknightBerry = new Jam("Dark Knight Berry Jam", "01012024", 180);
        Hubbard1.replace(jamJamFruitJam, 1);
        System.out.println(Hubbard1);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test replacement for jar2" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry, raspberry);
        if (Hubbard1.select(3)) {
            Hubbard1.spread(50);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }
        Jam smallishBerry = new Jam("smallishBerry Jam", "15072023", 170);
        Hubbard1.replace(goblinBerryJam, 2);
        System.out.println(Hubbard1);

        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Replace raspberry" + Library.TEXT_RESET);

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry, raspberry);
        Hubbard1.replace(raspberry, 2);
        System.out.println(Hubbard1);

        if (Hubbard1.select(2)) {
            Hubbard1.spread(50);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "THREE CONSTRUCTOR VARIABLES" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry, raspberry, cherry);
        // check if exists
        if (Hubbard1.select(1)) {
            selectSpread(Hubbard1, 1);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }
        Jam notTheLastBerry = new Jam("notTheLastBerry Jam", "04042025", 185);
        Hubbard1.replace(jamJamFruitJam, 3);
        System.out.println(Hubbard1);

        System.out.println("-----------------------------------------");
        // test if replacement works
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test replacement for jar2" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 160);
        Hubbard1 = new Pantry3(strawberry, raspberry, cherry);
        if (Hubbard1.select(2)) {
            Hubbard1.spread(50);
        } else {
            System.out.println("Selection not available");
            System.out.println(Hubbard1);
        }
        Jam jimmyBerry = new Jam("jimmyBerry Jam", "11072023", 914);
        Hubbard1.replace(goblinBerryJam, 2);
        System.out.println(Hubbard1);

        // Verify that all previous tests are in order
        checkAllNumberOfInputs();
    }

    public static void selectSpread(Pantry3 hubbard, int amtToSpread) {
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

    public static void checkAllNumberOfInputs() {
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
        Pantry3 singleHubbard = new Pantry3(strawberry);
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

        Pantry3 doubleHubbard = new Pantry3(strawberry, raspberry);
        System.out.println(doubleHubbard);

        // test for when spread is equal the capacity
        // see selectSpread method at the bottom of the file
        selectSpread(doubleHubbard, 80);

        System.out.println("-----------------------------------------");
        // test with 3 constructed variables
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test with 3 constructed variables" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");
        strawberry = new Jam("Strawberry", date1, 120);
        raspberry = new Jam("Raspberry", "09122023", 80);
        cherry = new Jam("Cherry", "10112023", 20);

        randomNum = (int) (Math.random() * 200 + 1);
        Pantry3 tripleHubbard = new Pantry3(strawberry, raspberry, cherry);
        System.out.println(tripleHubbard);

        // see selectSpread method at the bottom of the file
        selectSpread(tripleHubbard, 30);

        System.out.println("-----------------------------------------");
        // test with 3 constructed variables
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test spreading 0" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        // test for zero
        selectSpread(tripleHubbard, 0);

        System.out.println("-----------------------------------------");
        // test with 3 constructed variables
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Test spreading negative" + Library.TEXT_RESET);
        System.out.println("-----------------------------------------");

        // test for negative
        selectSpread(tripleHubbard, -10);
    }

}