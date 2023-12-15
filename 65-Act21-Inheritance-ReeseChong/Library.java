import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;

class Library {

    public static Scanner input = new Scanner(System.in);

    public static DecimalFormat dollarFormat = new DecimalFormat("$###,###.##");

    // ***** Text Colors for the Console *****************//
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK_BOLD = "\u001B[1;30m";
    public static final String TEXT_BLACK_ON_WHITE = "\u001B[30;47m";
    public static final String TEXT_WHITE_BOLD = "\u001B[1;97m";
    public static final String TEXT_RED_BOLD = "\u001B[1;31m";
    public static final String TEXT_GREEN_BOLD = "\u001B[1;32m";
    public static final String TEXT_BROWN_BOLD = "\u001B[1;37;43m";
    public static final String TEXT_YELLOW_BOLD = "\u001B[1;93;103m";
    public static final String TEXT_BLUE_BOLD = "\u001B[1;34m";
    public static final String TEXT_PURPLE_BOLD = "\u001B[1;35m";
    public static final String TEXT_CYAN_BOLD = "\u001B[1;36m";
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String p = "\033[1;92m"; // GREEN

    public static int myRandom(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom

    public static int stringSearch(String[] arr, String searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (searchTerm.equalsIgnoreCase(arr[i])) {
                return i;
            }
        }
        return -1;
    }// stringSearch

    public static int linearStringSearch(ArrayList<String> list, String searchTerm) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(searchTerm)) {
                return i;
            }
        }
        return -1;
    }// linearStringSearch

}// class