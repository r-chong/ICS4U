import java.util.ArrayList;
import java.util.Arrays;

class Ex11_Fruit {
    public static void run() {

        // creating an ArrayList of 10 random Integers between 0 and 10.
        ArrayList<Integer> randomNums = new ArrayList();
        for (int i = 0; i < 10; i++) {
            randomNums.add(Library.myRandom(0, 11));
        } // end for loop -- 10 random numbers

        // Using a FOR Loop print get(i) < get(i+1).
        // This should print true if the two pairs of numbers are in order or false if
        // not..
        for (int i = 0; i < randomNums.size() - 1; i++) {
            System.out.println(randomNums.get(i) + " and " + randomNums.get(i + 1) + " are in numerical order:");
            System.out.println(randomNums.get(i) < randomNums.get(i + 1));
        } // end for loop -- check if in order

        // creating an ArrayList of 5 fruits
        ArrayList<String> allFruit = new ArrayList();
        // allFruit.add("apple"); // 0
        // allFruit.add("banana"); // 1
        // allFruit.add("dragon fruit"); // 2
        // allFruit.add("pomegranate"); // 3
        // allFruit.add("plum"); // 4
        // allFruit.add("starfruit"); // 5
        allFruit.addAll(Arrays.asList("apple", "banana", "dragon fruit", "pomegranate", "plum", "starfruit"));
        System.out.println(allFruit);

        // Using a FOR Loop print out if the order of the fruits are correct.
        // This should print true if the two pairs of fruits are in alphabetical order
        // or false if not..

        for (int i = 0; i < allFruit.size() - 1; i++) {
            System.out.println(allFruit.get(i) + " and " + allFruit.get(i + 1) + " are in alphabetical order:");
            System.out.println(allFruit.get(i).compareTo(allFruit.get(i + 1)) < 0 ? "Yes" : "No");
        } // end for loop

        // put the fruits in order by swapping index 3 and index 4

        String temp = allFruit.get(3);
        allFruit.set(3,allFruit.get(4));
        allFruit.set(4,temp);
        System.out.println(allFruit);
    }// run
}// class
