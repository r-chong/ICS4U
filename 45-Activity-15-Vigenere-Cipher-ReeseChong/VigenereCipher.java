
public class VigenereCipher {
    public static void run() {
        char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        char[][] array = createTable(alphabet);
        printTable(array, alphabet);
        String keyword;

        // main menu
        System.out.println("Welcome to the Vigenere Cipher");
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Would you like to replace the default keyword? (y/n)"
                + Library.TEXT_RESET);
        String replaceKeyword = Library.input.nextLine();

        // ability to change keyword
        if (replaceKeyword.equalsIgnoreCase("y")) {
            keyword = Library.input.nextLine();
        } else {
            keyword = "SCONA";
        }

        // put program into a while loop for ease of testing / grading
        while (true) {
            System.out
                    .println(Library.GREEN_BOLD_BRIGHT + "Would you like to decrypt or encrypt?" + Library.TEXT_RESET);
            System.out.println("1... Decrypt\n2... Encrypt\n3... Get Character @ position\n4... Exit");
            int choice = Library.input.nextInt();
            Library.input.nextLine();

            // decryption
            if (choice == 1) {
                System.out.println(Library.GREEN_BOLD_BRIGHT
                        + "What message would you like to decrypt? Case insensitive" + Library.TEXT_RESET);
                String toDecrypt = Library.input.nextLine();

                String decryptedMsg = decryptMsg(array, toDecrypt, keyword, alphabet);
                System.out.println(Library.GREEN_BOLD_BRIGHT + "The decrypted message is: " + Library.RED_BOLD
                        + decryptedMsg + Library.TEXT_RESET);
                System.out.println("");

                // encryption
            } else if (choice == 2) {
                System.out.println(Library.GREEN_BOLD_BRIGHT
                        + "What message would you like to encrypt? Case insensitive" + Library.TEXT_RESET);
                String toEncrypt = Library.input.nextLine();

                String encryptedMsg = encryptMsg(array, toEncrypt, keyword, alphabet);
                System.out.println(Library.GREEN_BOLD_BRIGHT + "The encrypted message is: " + Library.RED_BOLD
                        + encryptedMsg + Library.TEXT_RESET);
                System.out.println("");
                // getChar for fun
            } else if (choice == 3) {
                System.out.println("What is the row number you want to find?");
                int rowNum = Library.input.nextInt();
                Library.input.nextLine();

                System.out.println("What is the column number you want to find?");
                int colNum = Library.input.nextInt();
                Library.input.nextLine();

                System.out.println("This letter at this position is: " + getChar(array, rowNum, colNum));
                System.out.println("");
                // exit
            } else if (choice == 4) {
                break;
                // input validation
            } else {
                System.out.println("Invalid input");
            }
        }
        System.out.println("Goodbye");
    }

    private static char[][] createTable(char[] alphabet) {
        char[][] table = new char[alphabet.length][alphabet.length];
        int a;
        for (int row = 0; row < alphabet.length; row++) {
            for (int col = 0; col < alphabet.length; col++) {
                a = row + col;
                if (a >= alphabet.length) {
                    a = a - alphabet.length;
                }
                table[row][col] = alphabet[a];
            }
        }
        return table;
        // from
        // https://www.daniweb.com/programming/software-development/threads/269840/2d-char-array-vigenere-cipher
    }// createTable

    // print table
    private static void printTable(char[][] table, char[] alpha) {
        System.out.print("  ");

        for (int a = 0; a < alpha.length; a++) {
            System.out.print(Library.YELLOW_BOLD + alpha[a] + Library.TEXT_RESET + " ");
        }
        System.out.println("");

        for (int r = 0; r < table.length; r++) {
            System.out.print(Library.YELLOW_BOLD + alpha[r] + Library.TEXT_RESET + " ");
            for (int c = 0; c < table.length; c++) {
                System.out.print(table[r][c] + " ");
            }
            System.out.println("");
        }
    }// end printTable

    // get character at coord
    public static char getChar(char[][] arr, int row, int col) {
        return arr[row][col];
    }

    // method for looping the keyword to match length of message
    // goes exactly to the number of chars
    public static String generateKeyLoop(String msg, String key) {
        String newKey = "";
        int a = 0;
        for (int i = 0; i < msg.length(); i++) {
            if (a >= key.length()) {
                a = 0;
            }
            newKey = newKey + key.charAt(a);
            a++;
        }
        return newKey;
    }

    // decryption system
    // take message
    // make keyword into length of message
    // for the length of the message, use coordinates: msg, key
    public static String decryptMsg(char[][] arr, String msg, String key, char[] alpha) {
        String newKey = "";
        String temp = "";

        newKey = generateKeyLoop(msg, key);

        for (int i = 0; i < msg.length(); i++) {
            char msgLetter = msg.charAt(i);
            char keyLetter = newKey.charAt(i);

            // System.out.println(msgLetter);
            // System.out.println(keyLetter);
            int keyPos = Library.charSearch(alpha, keyLetter); // new key (y)
            int msgPos = Library.charSearch(arr[keyPos], msgLetter); // msg (x)

            temp = temp + alpha[msgPos];
        }

        return temp;
    }

    public static String encryptMsg(char[][] arr, String msg, String key, char[] alpha) {
        String newKey = "";
        String temp = "";

        newKey = generateKeyLoop(msg, key);
        // System.out.println(newKey);

        for (int i = 0; i < msg.length(); i++) {
            char msgLetter = msg.charAt(i);
            char keyLetter = newKey.charAt(i);

            int msgPos = Library.charSearch(alpha, msgLetter); // msg (x)
            int keyPos = Library.charSearch(alpha, keyLetter); // new key (y)
            // System.out.println("(" + msgPos + "," + keyPos + ")");
            temp = temp + arr[msgPos][keyPos];
        }

        return temp;
    }

    public static int linearSearch(char[] arr, char searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchTerm) {
                return i;
            }
        }
        return -1;
    }

}// end class
