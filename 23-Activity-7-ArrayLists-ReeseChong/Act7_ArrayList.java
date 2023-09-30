// import necessary libraries
import java.util.ArrayList;
import java.util.Arrays;

public class Act7_ArrayList {

    public static void run() {
        // declare and initialize variables and arraylists
        // used Arrays.asList method for the arrays
        ArrayList<String> names = new ArrayList(
            Arrays.asList("Bob", "Jill", "Matt", "Gill", "Jeff", "Nate", "Sal", "John", "Bill", "Corn")
        );
        ArrayList<String> musicStyle = new ArrayList(Arrays.asList("Concert","Concert","Concert","Jazz","Jazz","Concert","Folk","Classical Piano", "Classical Piano","Jazz")
        );
        ArrayList<Integer> score = new ArrayList(
            Arrays.asList(88, 85, 76, 96, 82, 79, 99, 98, 80, 95)
        );
        ArrayList<Integer> categoryOnlyIndices = new ArrayList();
        ArrayList<Integer> over80Indices = new ArrayList();
        double totalScore = 0.0;
        double averageScore;
        int indexLen;
        char yesNo = ' ';
        Boolean restart = true;
        // this is hardcoded but has the potential to be inputetd
        final String SEARCH_CATEGORY = "Concert";

        for (int i = 0; i < names.size(); i++) {
        //*****System.out.println(musicStyle.get(9));*****
        System.out.println(names.get(i) + " is competing in " + musicStyle.get(i) + " and has received a score of " + score.get(i) + "%");
        }//end print all data

        // main while loop 
        do {
            // search for all in category
            for (int i = 0; i < names.size(); i++) {
                if (musicStyle.get(i).equalsIgnoreCase(SEARCH_CATEGORY)) {
                    categoryOnlyIndices.add(i);
                }
            }
            indexLen = categoryOnlyIndices.size();

            // access parallel array elements through the new array of indexes created
            // print out competitors
            System.out.println("Competitors for " + SEARCH_CATEGORY + ":");
            for (int i = 0; i < indexLen; i++) {
                System.out.println(names.get(categoryOnlyIndices.get(i)));
            }
            for (int i = 0; i < score.size(); i++) {
                totalScore += score.get(i);
            }
            // calculate the average
            averageScore = totalScore/score.size();
            System.out.println("The average of all competitors is " + averageScore + "%");

            // find all competitors with score above 80
            System.out.println("\n");
            System.out.println("Competitors with score above 80: ");

            // add to new array storing indexes of these
            for (int i = 0; i < names.size(); i++) {
                if (score.get(i) >= 80) {
                    over80Indices.add(i);
                }
            }

            // print those competitors names' out
            indexLen = over80Indices.size();
            for (int i = 0; i < indexLen; i++) {
                System.out.println(names.get(over80Indices.get(i)));
            }

            // find the maximum score and print it (void method)
            findMax(score,names);
    
            /// update user
            String nameToSearch = "";
            int indexOfSearched = -1;
            int newScore = 0;

            // get a name to search from the user
            System.out.println("Enter a name to update:");
            nameToSearch = Library.input.nextLine();

            // take in the new desired score
            indexOfSearched = Library.linearStringSearch(names, nameToSearch);
            System.out.println("What score should this competitor receive?");
            newScore = Library.input.nextInt();
            score.set(indexOfSearched, newScore);
            System.out.println("******************** Updating Stats *********************");

            // reset variables that are used
            totalScore = 0.0;
            categoryOnlyIndices.clear();
            over80Indices.clear();

            // allow running program again
            System.out.println("Would you like to view the stats again? (y/n)");
            System.out.println("");

            // see if user would like to restart the while loop
            yesNo = Library.input.next().charAt(0);
            Library.input.nextLine();
            if (yesNo == ('n')) {
                restart = false;
                break;
            } 
            if (yesNo == ('y')) {
                restart = true;
            }
        }while(restart); // while loop
}//end main

        // find maximum given score array and names array
        public static void findMax(ArrayList<Integer> score, ArrayList<String> names) {
            // if the new index is greater than max, then it's the new max
            int max = 0;
            int maxIndex = 0;

            for (int i = 0; i < score.size(); i++) {
                if (score.get(i) > max) {
                    max = score.get(i);
                    maxIndex = i;
                }// end if new max
            } // end find max

            // print the most score
            System.out.println(names.get(maxIndex) + " scored the most with " + score.get(maxIndex) + "%!");
        }
}//end class