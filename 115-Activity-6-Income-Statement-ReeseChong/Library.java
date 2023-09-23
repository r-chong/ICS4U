import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

class Library {

    public static Scanner input = new Scanner(System.in);

    public static DecimalFormat dollarFormat = new DecimalFormat("$###,###.##");

    // ***** Text Colors for the Console *****************//
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE_BOLD = "\033[1;97m"; // BLACK
    public static final String TEXT_BACKGROUND_GREEN = "\u001B[48;2;56;188;68m";

    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String WHITE_UNDERLINED = "\033[4;37m";

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

    // this is my rounding method
    public static double myRound(double numToRound, int numDecimalPlaces) {
            // ex. myRound(146.5558, 2) returns 146.55
            String numAsString = Double.toString(numToRound);
            // split into two parts by the decimal
            String[] parts = numAsString.split("\\.");

            // if there is a decimal (2 parts) then make an array from the right hand side
            // also make an empty array to use to create copies of
            if (parts.length == 2) {
                String integerPart = parts[0];
                String decimalPart = parts[1];
                String[] decimalPartArr = parts[1].split("");
                String[] arr = {};

                // remove all after the desired decimal rounding, through a loop
                for (int i = 0; i <= numDecimalPlaces-1; i++) {
                    arr = Arrays.copyOf(arr, arr.length + 1);
                    arr[arr.length - 1] = decimalPartArr[i];
                }
            
                // join back together and turn into double          
                String resultString = integerPart + "." + String.join("",arr);
                return Double.parseDouble(resultString);
            } else {
                // if it isn't a decimal
                return numToRound;
            }
        }// myRound

}// class