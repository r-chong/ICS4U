import java.util.ArrayList;

class Sort {

    public static void bubbleSortStrings(ArrayList<String> list) {
        boolean swap = true;
        String temp = "";
        while (swap) {
            swap = false;
            for (int i = 0; i < list.size() - 1; i++) {
                // check if it's returning a positive
                if (list.get(i).compareToIgnoreCase(list.get(i + 1)) > 0) {
                    swap = true;
                    temp = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, temp);
                }
            }
        }
    }// end bubbleSortStrings

    public static void bubbleSortDoubles(ArrayList<Double> list) {
        boolean swap = true;
        Double temp = 0.0;

        while (swap) {
            swap = false;
            for (int i = 0; i > list.size() - 1; i++) {
                if (list.get(i) < list.get(i + 1)) {
                    swap = true;
                    temp = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, temp);
                }
            }
        }
    }// end bubbleSortDoubles

}// end Sort Class
