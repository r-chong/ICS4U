import java.util.ArrayList;

class Act9_BinarySearch {

    public static ArrayList<String> allAnimals = Files.loadStringList("data/animals.txt");
    public static ArrayList<String> allCategories = Files.loadStringList("data/category.txt");
    public static ArrayList<Double> allWeights = Files.loadDoubleList("data/weights.txt");

    public static void run() {

        String searchAnimal = "";
        int searchAnimalIndex = -1;
        boolean contSearch = true;

        for (int i = 0; i < allAnimals.size(); i++) {
            System.out.println(allAnimals.get(i));
        }

        customBubbleSort(allAnimals);

        // main while loop
        while(contSearch) {
            System.out.println(Library.GREEN_BOLD_BRIGHT + "\nWhich animal would you like to know more about?" + Library.TEXT_RESET);
            searchAnimal = Library.input.nextLine();

            if (searchAnimal.equalsIgnoreCase("exit")) {
                return;
            }
            
            searchAnimalIndex = Search.binarySearchStrings(allAnimals, searchAnimal);
    
            if (searchAnimalIndex == -1) {
                System.out.println(Library.GREEN_BOLD_BRIGHT + "I am sorry this creature is not in our list. Please try again later" + Library.TEXT_RESET);
            } else if (searchAnimal.charAt(0) == 'a' || searchAnimal.charAt(0) == 'e' || searchAnimal.charAt(0) == 'i' || searchAnimal.charAt(0) == 'o' || searchAnimal.charAt(0) == 'u') {
                System.out.println(Library.GREEN_BOLD_BRIGHT + "I found it. An " + searchAnimal + " is a " + allCategories.get(searchAnimalIndex) + " and its average weight is " + allWeights.get(searchAnimalIndex) + " kg." + Library.TEXT_RESET);
            } else {
                System.out.println(Library.GREEN_BOLD_BRIGHT + "I found it. A " + searchAnimal + " is a " + allCategories.get(searchAnimalIndex) + " and its average weight is " + allWeights.get(searchAnimalIndex) + " kg." + Library.TEXT_RESET);
            }
        }
    }// run

    public static void customBubbleSort(ArrayList<String> list) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).compareToIgnoreCase(list.get(i + 1)) > 0) {
                    swap = true;
                    String temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);

                    String temp2 = allCategories.get(i);
                    allCategories.set(i, allCategories.get(i + 1));
                    allCategories.set(i + 1, temp2);

                    double temp3 = allWeights.get(i);
                    allWeights.set(i, allWeights.get(i + 1));
                    allWeights.set(i + 1, temp3);
                }
            } // for
        } // while
    }// end bubbleSortStrings

}// class
