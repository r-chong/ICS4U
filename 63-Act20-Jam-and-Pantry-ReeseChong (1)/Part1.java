
//****incomplete*****
import java.util.Scanner;

public class Part1 {
    public static void run() {

        Scanner UserInput = new Scanner(System.in);

        // Jam objects are created and assigned the initial value amount
        ExpirationDate date1 = new ExpirationDate(05, 12, 2023, 100);
        Jam strawberry = new Jam("Strawberry", date1, 120);
        Jam raspberry = new Jam("Raspberry", "09122023", 80);
        Jam cherry = new Jam("Cherry", "10112023", 160);

        Pantry pantry = new Pantry(strawberry, raspberry, cherry);

        System.out.println(Library.GREEN_BOLD_BRIGHT + "Welcome to Mother Hubbard's Pantry!" + Library.TEXT_RESET);

        while (true) {
            System.out.println("\nThe jams are:");

            pantry.select(1);
            System.out.println(pantry);

            System.out.println(
                    Library.GREEN_BOLD_BRIGHT + "Enter your selection (1, 2, or 3):" + Library.TEXT_RESET);
            int selection = Library.input.nextInt();

            if (selection == -1) {
                return;
            } else if (selection > 3 || selection < 1) {
                System.out.println("Selection out of bounds");
            } else {
                System.out.println(Library.GREEN_BOLD_BRIGHT + "Enter amount to spread:" + Library.TEXT_RESET);
                int amtToSpread = Library.input.nextInt();
                pantry.select(selection);
                pantry.spread(amtToSpread);
            }
            System.out.println("-----------------------");
        }
    }
}