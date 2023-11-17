import java.util.ArrayList;
import java.util.Arrays;

class Act16_QuickMergeSort {
    public static void run() {
        // lists for selection sort
        ArrayList<Integer> integers = new ArrayList();
        ArrayList<Double> doubles = new ArrayList();
        ArrayList<String> strings = new ArrayList();

        integers.addAll(Arrays.asList(9, 2, 3, 1, 11, 5, 8, 6, 4, 15, 0, 1111, -18));
        doubles.addAll(Arrays.asList(0.1, -9.9, 100.2, 5.42, 5.41, 64.3, 0.7, -16.3, 4.4, 6.5, 1200.9, -9.91, 0.0));
        strings.addAll(Arrays.asList("pear", "apple", "banana", "watermelon", "orange", "kiwi", "blueberry",
                "strawberry", "coconut", "grape", "apple"));

        RecursiveSorts.QuickSortIntegers(integers, 0, integers.size());
        System.out.println(integers);

        RecursiveSorts.QuickSortDoubles(doubles, 0, doubles.size());
        System.out.println(doubles);

        RecursiveSorts.QuickSortStrings(strings, 0, strings.size());
        System.out.println(strings);

        // System.out.println(RecursiveSorts.MergeSortStrings(strings));

        ///////////////////////////////////////////////////////
        // MERGE SORT
        ///////////////////////////////////////////////////////

        System.out.println("\nBegin Merge Sort");

        ArrayList<Integer> integers2 = new ArrayList();
        ArrayList<Double> doubles2 = new ArrayList();
        ArrayList<String> strings2 = new ArrayList();

        integers2.addAll(Arrays.asList(9, 2, 3, 1, 11, 5, 8, 6, 4, 15, 0, 1111, -18));
        doubles2.addAll(Arrays.asList(0.1, -9.9, 100.2, 5.42, 5.41, 64.3, 0.7, -16.3, 4.4, 6.5, 1200.9, -9.91, 0.0));
        strings2.addAll(Arrays.asList("pear", "apple", "banana", "watermelon", "orange", "kiwi", "blueberry",
                "strawberry", "coconut", "grape", "apple"));

        System.out.println(RecursiveSorts.MergeSortIntegers(integers));
        System.out.println(RecursiveSorts.MergeSortDoubles(doubles2));
        System.out.println(RecursiveSorts.MergeSortStrings(strings2));
    }
}