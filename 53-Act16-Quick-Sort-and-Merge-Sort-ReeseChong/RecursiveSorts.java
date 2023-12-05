import java.util.ArrayList;
import java.util.Arrays;

class RecursiveSorts {

    // Complete the Quick sorts for Strings, Doubles and Integers
    public static void QuickSortIntegers(ArrayList<Integer> list, int begin, int end) {
        if (begin < end) {
            int pivot_location = PartitionInteger(list, begin, end);

            QuickSortIntegers(list, begin, pivot_location);
            QuickSortIntegers(list, pivot_location + 1, end);
        }
    }

    public static void QuickSortDoubles(ArrayList<Double> list, int begin, int end) {
        if (begin < end) {
            int pivot_location = PartitionDouble(list, begin, end);

            QuickSortDoubles(list, begin, pivot_location);
            QuickSortDoubles(list, pivot_location + 1, end);
        }
    }

    public static void QuickSortStrings(ArrayList<String> list, int begin, int end) {
        if (begin < end) {
            int pivot_location = PartitionString(list, begin, end);

            QuickSortStrings(list, begin, pivot_location);
            QuickSortStrings(list, pivot_location + 1, end);
        }
    }

    public static int PartitionInteger(ArrayList<Integer> list, int begin, int end) {
        int pivot = list.get(begin);
        int leftwall = begin;

        for (int i = begin + 1; i < end; i++) {
            if (list.get(i) < pivot) {
                leftwall += 1;
                int temp = list.get(i);
                list.set(i, list.get(leftwall));
                list.set(leftwall, temp);
            }
        }

        // begin is just pivot index
        list.set(begin, list.get(leftwall));
        list.set(leftwall, pivot);

        return leftwall;
    }

    public static int PartitionDouble(ArrayList<Double> list, int begin, int end) {
        double pivot = list.get(begin);
        int leftwall = begin;

        for (int i = begin + 1; i < end; i++) {
            if (list.get(i) < pivot) {
                leftwall += 1;
                double temp = list.get(i);
                list.set(i, list.get(leftwall));
                list.set(leftwall, temp);
            }
        }

        // begin is just pivot index
        list.set(begin, list.get(leftwall));
        list.set(leftwall, pivot);

        return leftwall;
    }

    public static int PartitionString(ArrayList<String> list, int begin, int end) {
        String pivot = list.get(begin);
        int leftwall = begin;

        for (int i = begin + 1; i < end; i++) {
            if (list.get(i).compareTo(pivot) < 0) {
                leftwall += 1;
                String temp = list.get(i);
                list.set(i, list.get(leftwall));
                list.set(leftwall, temp);
            }
        }

        // begin is just pivot index
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
            return list;
        }
        int i = 0;

        ArrayList<Integer> arrayOne = new ArrayList();
        ArrayList<Integer> arrayTwo = new ArrayList();
        while (i < n / 2) {
            arrayOne.add(list.get(i));
            i++;
        }
        while (i < n) {
            arrayTwo.add(list.get(i));
            i++;
        }

        arrayOne = MergeSortIntegers(arrayOne);
        arrayTwo = MergeSortIntegers(arrayTwo);

        return MergeIntegers(arrayOne, arrayTwo);
    }

    public static ArrayList<Double> MergeSortDoubles(ArrayList<Double> list) {
        int n = list.size();
        if (n <= 1) {
            return list;
        }
        int i = 0;

        ArrayList<Double> arrayOne = new ArrayList();
        ArrayList<Double> arrayTwo = new ArrayList();
        while (i < n / 2) {
            arrayOne.add(list.get(i));
            i++;
        }
        while (i < n) {
            arrayTwo.add(list.get(i));
            i++;
        }

        arrayOne = MergeSortDoubles(arrayOne);
        arrayTwo = MergeSortDoubles(arrayTwo);

        return MergeDoubles(arrayOne, arrayTwo);
    }

    public static ArrayList<String> MergeSortStrings(ArrayList<String> list) {
        int n = list.size();
        if (n <= 1) {
            return list;
        }
        int i = 0;

        ArrayList<String> arrayOne = new ArrayList();
        ArrayList<String> arrayTwo = new ArrayList();
        while (i < n / 2) {
            arrayOne.add(list.get(i));
            i++;
        }
        while (i < n) {
            arrayTwo.add(list.get(i));
            i++;
        }

        arrayOne = MergeSortStrings(arrayOne);
        arrayTwo = MergeSortStrings(arrayTwo);

        return MergeStrings(arrayOne, arrayTwo);
    }

    // Complete the Merge sorts for Strings, Doubles and Integers
    public static ArrayList<Integer> MergeIntegers(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList();

        while (a.size() > 0 && b.size() > 0) {
            if (b.get(0) < b.get(0)) {
                c.add(b.get(0));
                b.remove(b.get(0));
            } else {
                c.add(a.get(0));
                a.remove(a.get(0));
            }
        }

        // At this point, either a or b is empty

        while (a.size() > 0) {
            c.add(a.get(0));
            a.remove(a.get(0));
        }
        while (b.size() > 0) {
            c.add(b.get(0));
            b.remove(b.get(0));
        }

        return c;
    }

    public static ArrayList<Double> MergeDoubles(ArrayList<Double> a, ArrayList<Double> b) {
        ArrayList<Double> c = new ArrayList();

        while (a.size() > 0 && b.size() > 0) {
            if (a.get(0) > b.get(0)) {
                c.add(b.get(0));
                b.remove(b.get(0));
            } else {
                c.add(a.get(0));
                a.remove(a.get(0));
            }
        }

        // At this point, either a or b is empty

        while (a.size() > 0) {
            c.add(a.get(0));
            a.remove(a.get(0));
        }
        while (b.size() > 0) {
            c.add(b.get(0));
            b.remove(b.get(0));
        }

        return c;
    }

    public static ArrayList<String> MergeStrings(ArrayList<String> a, ArrayList<String> b) {
        ArrayList<String> c = new ArrayList();

        while (a.size() > 0 && b.size() > 0) {
            if (b.get(0).compareTo(a.get(0)) > 0) {
                c.add(a.get(0));
                a.remove(a.get(0));
            } else {
                c.add(b.get(0));
                b.remove(b.get(0));
            }
        }

        // At this point, either a or b is empty

        while (a.size() > 0) {
            c.add(a.get(0));
            a.remove(a.get(0));
        }
        while (b.size() > 0) {
            c.add(b.get(0));
            b.remove(b.get(0));
        }

        return c;
    }

}