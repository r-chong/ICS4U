import java.util.ArrayList;

class Sort {

    public static void bubbleSortStrings(ArrayList<String> list) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).compareToIgnoreCase(list.get(i + 1)) > 0) {
                    swap = true;
                    String temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);

                }
            } // for
        } // while
    }// end bubbleSortStrings

    public static void bubbleSortWorldRank(ArrayList<Act_13_Universities> list) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).worldRank > list.get(i + 1).worldRank) {
                    swap = true;
                    Act_13_Universities temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);

                }
            } // for
        } // while
    }// end bubbleSortStrings
    
    public static void bubbleSortDoubles(ArrayList<Double> list) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    swap = true;
                    Double temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            } // for
        } // while
    }// end bubbleSortDoubles

    public static void bubbleSortIntegers(ArrayList<Integer> list) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    swap = true;
                    Integer temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            } // for
        } // while
    }// end bubbleSortIntegers

    // // Add Selection sorts for strings, doubles and integers
    public static void selectionSortString(ArrayList<String> list) {
        for (int j = 0; j < list.size() - 1; j++) {
            int iMin = j;

            for (int i = j + 1; i < list.size(); i++) {
                if (list.get(i).compareToIgnoreCase(list.get(iMin)) < 0) {
                    iMin = i;
                }
            }

            if (iMin != j) {
                String temp = list.get(iMin);
                list.set(iMin, list.get(j));
                list.set(j, temp);
            }
        }
    }// end selectionSortStrings

    // Add Selection sorts for strings, doubles and integers
    public static void selectionSortNames(ArrayList<Act_13_Universities> list) {
        for (int j = 0; j < list.size() - 1; j++) {
            int iMin = j;

            for (int i = j + 1; i < list.size(); i++) {
                if (list.get(i).name.compareToIgnoreCase(list.get(iMin).name) < 0) {
                    iMin = i;
                }
            }

            if (iMin != j) {
                Act_13_Universities temp = list.get(iMin);
                list.set(iMin, list.get(j));
                list.set(j, temp);
            }
        }
    }// end selectionSortStrings

    public static void selectionSortDouble(ArrayList<Double> list) {
        for (int j = 0; j < list.size() - 1; j++) {

            int iMin = j;

            for (int i = j + 1; i < list.size(); i++) {
                if (list.get(i) < list.get(iMin)) {
                    iMin = i;
                }
            }

            if (iMin != j) {
                Double temp = list.get(iMin);
                list.set(iMin, list.get(j));
                list.set(j, temp);
            }
        }
    }// end selectionSortDoubles

    public static void selectionSortInteger(ArrayList<Integer> list) {
        for (int j = 0; j < list.size() - 1; j++) {

            int iMin = j;

            for (int i = j + 1; i < list.size(); i++) {
                if (list.get(i) < list.get(iMin)) {
                    iMin = i;
                }
            }

            if (iMin != j) {
                int temp = list.get(iMin);
                list.set(iMin, list.get(j));
                list.set(j, temp);
            }
        }
    }// end selectionSortIntegers

    // Add Insertion sorts for strings, doubles and integers
    public static void insertionSortString(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i++) {
            int j = i;
            while (j > 0 && list.get(j).compareToIgnoreCase(list.get(j - 1)) < 0) {
                String temp = list.get(j);
                list.set(j, list.get(j - 1));
                list.set(j - 1, temp);
                j = j - 1;
            }
        }
    }// end selectionSortStrings

    public static void insertionSortAdmissionAvgs(ArrayList<Act_13_Universities> list) {
        for (int i = 1; i < list.size(); i++) {
            int j = i;
            while (j > 0 && list.get(j - 1).admissionAverage < list.get(j).admissionAverage) {
                Act_13_Universities temp = list.get(j);
                list.set(j, list.get(j - 1));
                list.set(j - 1, temp);
                j = j - 1;
            }
        }
    }// end selectionSortDoubles

    public static void insertionSortDouble(ArrayList<Double> list) {
        for (int i = 1; i < list.size(); i++) {
            int j = i;
            while (j > 0 && list.get(j - 1) > list.get(j)) {
                Double temp = list.get(j);
                list.set(j, list.get(j - 1));
                list.set(j - 1, temp);
                j = j - 1;
            }
        }
    }// end selectionSortDoubles

    public static void insertionSortInteger(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int j = i;
            while (j > 0 && list.get(j - 1) > list.get(j)) {
                int temp = list.get(j);
                list.set(j, list.get(j - 1));
                list.set(j - 1, temp);
                j = j - 1;
            }
        }
    }// end selectionSortIntegers
}// end Sort Class
