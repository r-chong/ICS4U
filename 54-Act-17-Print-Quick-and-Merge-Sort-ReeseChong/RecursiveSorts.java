import java.util.ArrayList;
import java.util.Arrays;

class RecursiveSorts {

    public static int inceptionCounter = 0;

    public static void QuickSortIntegers(ArrayList<Integer> list, int begin, int end) {
        if (begin < end) {
            System.out.println("---------------");
            System.out.println(Library.TEXT_BLUE + "Current level: " + inceptionCounter + Library.TEXT_RESET);
            System.out.println("---------------");

            inceptionCounter += 1;
            int pivot_location = PartitionInteger(list, begin, end);
            greenPrint("Array after swapping: " + list);
            ArrayList<Integer> lessThanPivot = new ArrayList();
            ArrayList<Integer> moreThanPivot = new ArrayList();

            for (int j = 0; j < pivot_location; j++) {
                lessThanPivot.add(list.get(j));
            }

            for (int j = pivot_location + 1; j < list.size(); j++) {
                moreThanPivot.add(list.get(j));
            }

            System.out.println("Less than pivot: " + lessThanPivot);
            System.out.println("More than pivot: " + moreThanPivot);

            QuickSortIntegers(list, begin, pivot_location);
            QuickSortIntegers(list, pivot_location + 1, end);
        }
    }

    public static int PartitionInteger(ArrayList<Integer> list, int begin, int end) {
        int pivot = list.get(begin);
        int leftwall = begin;
        System.out.println("The pivot is " + pivot);

        for (int i = begin + 1; i < end; i++) {
            if (list.get(i) < pivot) {
                System.out.println(
                        Library.GREEN_BOLD_BRIGHT
                                + "Since " + list.get(i) + " is less than " + pivot
                                + ", set left wall to " + leftwall
                                + Library.TEXT_RESET);
                leftwall += 1;

                System.out.println(
                        Library.GREEN_BOLD_BRIGHT + "Swap " + list.get(i) + " and " + list.get(leftwall)
                                + Library.TEXT_RESET);

                System.out.println("");
                System.out.println(Library.TEXT_YELLOW + "The new list is " + list + Library.TEXT_RESET);
                System.out.print("[");
                for (int x = 0; x < list.size() - 1; x++) {
                    if (x == i || x == leftwall) {
                        System.out.print(
                                Library.TEXT_RED + list.get(x) + Library.GREEN_BOLD_BRIGHT + "," + Library.TEXT_RESET);
                    } else {
                        System.out.print(
                                Library.GREEN_BOLD_BRIGHT + list.get(x) + "," + Library.TEXT_RESET);
                    }
                }
                System.out.print("]");
                System.out.println("");
                int temp = list.get(i);
                list.set(i, list.get(leftwall));
                list.set(leftwall, temp);

            }
            greenPrint("Since " + list.get(i) + " is more than " + pivot + ", we continue");
        }

        // begin is just pivot index
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Set the new beginning to the index of the leftwall "
                + Library.TEXT_RESET);
        list.set(begin, list.get(leftwall));
        list.set(leftwall, pivot);

        return leftwall;
    }

    ///////////////////////////////////////////////////////
    // MERGE SORT
    ///////////////////////////////////////////////////////

    // Complete the Merge sorts for Strings, Doubles and Integers
    public static ArrayList<Integer> MergeSortIntegers(ArrayList<Integer> list) {
        int n = list.size();
        if (n <= 1) {
            System.out.println(Library.TEXT_RED + "Sorted" + Library.TEXT_RESET);
            return list;
        }
        int i = 0;

        ArrayList<Integer> arrayOne = new ArrayList();
        ArrayList<Integer> arrayTwo = new ArrayList();
        greenPrint("Split list into two halves");
        System.out.println(list);
        while (i < n / 2) {
            arrayOne.add(list.get(i));
            i++;
        }
        System.out.print(Library.TEXT_BLUE + arrayOne + Library.TEXT_RESET);
        while (i < n) {
            arrayTwo.add(list.get(i));
            i++;
        }
        System.out.print(Library.TEXT_YELLOW + arrayTwo + Library.TEXT_RESET);
        System.out.println("\n");

        arrayOne = MergeSortIntegers(arrayOne);
        arrayTwo = MergeSortIntegers(arrayTwo);

        return MergeIntegers(arrayOne, arrayTwo);
    }

    // Complete the Merge sorts for Strings, Doubles and Integers
    public static ArrayList<Integer> MergeIntegers(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList();

        while (a.size() > 0 && b.size() > 0) {
            if (a.get(0) > b.get(0)) {
                greenPrint("Since " + b.get(0) + " is less than " + a.get(0) + ", add " + b.get(0)
                        + " to the new array and delete it from the old array (merge)");
                c.add(b.get(0));
                b.remove(b.get(0));
            } else {
                greenPrint("Since " + a.get(0) + " is less than " + b.get(0) + ", add " + a.get(0)
                        + " to the new array and delete it from the old array (merge)");
                c.add(a.get(0));
                a.remove(a.get(0));
            }
        }

        greenPrint("At this point, either a or b is empty");

        while (a.size() > 0) {
            c.add(a.get(0));
            a.remove(a.get(0));
        }
        while (b.size() > 0) {
            c.add(b.get(0));
            b.remove(b.get(0));
        }
        greenPrint("The new array is:");
        System.out.println(c);

        return c;
    }

    public static void greenPrint(String msg) {
        System.out.println(Library.GREEN_BOLD_BRIGHT + msg + Library.TEXT_RESET);
    }

}