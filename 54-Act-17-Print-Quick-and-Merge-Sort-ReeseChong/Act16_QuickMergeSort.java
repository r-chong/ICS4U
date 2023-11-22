import java.util.ArrayList;
import java.util.Arrays;

class Act16_QuickMergeSort {
    public static void run() {
        System.out.println("Which sort would you like to use?");
        System.out.println("1...Quick\n2...Merge");

        ArrayList<Integer> integers = new ArrayList();
        integers.addAll(Arrays.asList(9, 2, 3, 1, 11, 5, 8, 6, 4, 15, 0, 1111, -18));

        int choice = Library.input.nextInt();

        if (choice == 1) {
            // lists for selection sort
            RecursiveSorts.QuickSortIntegers(integers, 0, integers.size());
            System.out.println(integers);
        } else if (choice == 2) {
            RecursiveSorts.MergeSortIntegers(integers);
        }
    }
}