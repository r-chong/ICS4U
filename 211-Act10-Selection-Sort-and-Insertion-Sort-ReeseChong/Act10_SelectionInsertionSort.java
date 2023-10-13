import java.util.ArrayList;
import java.util.Arrays;

class Act10_SelectionInsertionSort {
    public static void run() {
        // Integer test
        // duplicate entries
        // zero, negative and positive numbers
        ArrayList<Integer> integerData1 = new ArrayList(Arrays.asList(-6,36,49,83,0,55,5,-75,37,5,3));

        // String test
        // duplicate entries
        // capital and lowercase (to test IgnoreCase)
        // number strings
        ArrayList<String> stringData1 = new ArrayList(
Arrays.asList("MY","quick","brown","fox","jumps","over","the","lazy","dog","100"));

        // Double test
        // duplicate entries
        // zero, negative and positive numbers
        ArrayList<Double> doubleData1 = new ArrayList(Arrays.asList(1.21,3.45,72.4,0.00,8.00,4.1,777.0,1.21,-100.0));

        // run three selection sorts
        System.out.println("\nSelection Sort");
        Sort.selectionSortInteger(integerData1);
        Sort.selectionSortString(stringData1);
        Sort.selectionSortDouble(doubleData1);
        System.out.println(integerData1);
        System.out.println(stringData1);
        System.out.println(doubleData1);

        // re-shuffle the arraylists
        integerData1 = new ArrayList(Arrays.asList(-6,36,49,83,0,55,5,-75,37,5,3));
        
        stringData1 = new ArrayList(
Arrays.asList("MY","quick","brown","fox","jumps","over","the","lazy","dog","100"));
        
        doubleData1 = new ArrayList(Arrays.asList(1.21,3.45,72.4,0.00,8.00,4.1,777.0,1.21,-100.0));

        // run three insertion sorts
        System.out.println("\nInsertion Sort");
        Sort.insertionSortInteger(integerData1);
        Sort.insertionSortString(stringData1);
        Sort.insertionSortDouble(doubleData1);
        System.out.println(integerData1);
        System.out.println(stringData1);
        System.out.println(doubleData1);
    }// run

}// class
