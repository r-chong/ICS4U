class Bingo {

    public static void run() {

        char[] letters = { 'B', 'I', 'N', 'G', 'O' };
        int[][] bingoCard = new int[5][6]; // [rows][columns]

        // populate the bingo card
        bingoCard[0] = generateArray(5, 1, 15);
        bingoCard[1] = generateArray(5, 16, 30);
        bingoCard[2] = generateArray(5, 31, 45);
        bingoCard[3] = generateArray(5, 46, 60);
        bingoCard[4] = generateArray(5, 61, 75);

        // print out the first bingo card
        print2DintRotated(bingoCard, letters);
        System.out.println("");

        // main game while loop
        while (true) {
            // random number
            int randNum = (int) (Math.random() * 75 + 1);
            System.out.println("The number chosen is: " + randNum);

            // update the bingo card to the called number and print it
            int[][] updatedList = searchChangeToNegative(bingoCard, randNum);
            print2DintRotated(updatedList, letters);

            // run win conditions
            boolean isRowWin = checkRow(bingoCard);
            boolean isColWin = checkColumn(bingoCard);
            boolean isDiagonalWin1 = checkDiagonal1(bingoCard);
            boolean isDiagonalWin2 = checkDiagonal2(bingoCard);

            // check win conditions
            // if win then exit
            if (isRowWin || isColWin || isDiagonalWin1 || isDiagonalWin2) {
                System.out.println("You win!");
                return;
            }
            // next turn on enter
            
            Library.input.nextLine();
        }
    }// end run

    // this is checking every index in row
    // if there is a negative, set win temporarily to true
    // if there is a positive, set the win to false
    // if it's still negative after all that then it means a win
    public static boolean checkRow(int[][] list) {
        for (int r = 0; r < list.length; r++) {
            boolean rowAllNegatives = true;
            for (int c = 0; c < list[r].length; c++) {
                if (list[r][c] >= 0) {
                    rowAllNegatives = false;
                    break;
                }
            }
            // end that row
            if (rowAllNegatives == true) {
                return true;
            }
        }
        return false;
    }
    // check column win
    public static boolean checkColumn(int[][] list) {
        for (int r = 0; r < list.length; r++) {
            boolean colAllNegatives = true;
            for (int c = 0; c < list.length; c++) {
                if (list[c][r] >= 0) {
                    colAllNegatives = false;
                    break;
                }
            }
            // end that col
            if (colAllNegatives == true) {
                return true;
            }
        }
        return false;
    }

    // left to right
    // 0,0,1,1,2,2,3,3,4,4
    public static boolean checkDiagonal1(int[][] list) {
        boolean isDiagonalWin = true;
        for (int i = 0; i < list.length; i++) {
            // System.out.println(list[i][i]);
            if (list[i][i] >= 0) {
                isDiagonalWin = false;
            }
        }
        return isDiagonalWin;
    }

    // right to left
    public static boolean checkDiagonal2(int[][] list) {
        boolean isDiagonalWin = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i][4 - i] >= 0) {
                isDiagonalWin = false;
            }
        }
        return isDiagonalWin;
    }

    // generate array method
    public static int[] generateArray(int len, int min, int max) {
        int[] arrForRow = new int[len];
        
        for (int i = 0; i < arrForRow.length; i++) {
            int newNum = Library.myRandom(min, max + 1);
            
            while (checkIfNumExists(arrForRow, newNum)) {
                newNum = Library.myRandom(min, max + 1);
            }
            arrForRow[i] = newNum;
        }
        return arrForRow;
    };

    // also known as play the game
    public static int[][] searchChangeToNegative(int[][] list, int searchNum) {
        int numFound = 0;
        for (int r = 0; r < list.length; r++) {
            for (int c = 0; c < list[r].length; c++) {
                if (list[r][c] == searchNum) {
                    list[r][c] = -list[r][c];
                    numFound ++;
                }
            }
        }
        if (numFound == 0) {
            System.out.println("Not found");
        } else if (numFound > 1) {
            System.out.println("multiple of the same # found");
        }
        return list;
    }// linearStringSearch

    public static boolean checkIfNumExists(int[] list, int searchNum) {
        boolean found = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == searchNum) {
                return true;
            }
        }
        return found;
    }// linearStringSearch

    public static void print2Dint(int[][] arr, char[] letters) {
        for (int r = 0; r < arr.length; r++) {
            System.out.print(letters[r] + "   ");
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + "   ");
            }
            System.out.println("");
        }
    }

    // bonus method
    public static void print2DintRotated(int[][] arr, char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]+ "\t\t");
        }
        System.out.println("");
        
        for (int c = 0; c < arr.length; c++) {
            for (int r = 0; r < arr.length; r++) {
                System.out.print(arr[r][c] + "\t\t");
            }
            System.out.println("");
        }
    }
}// end class