import java.util.ArrayList;

class Search {

    public static int linearStringSearch(ArrayList<String> list, String searchTerm) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(searchTerm)) {
                return i;
            }
        }
        return -1;
    }// linearStringSearch

    public static int binarySearchStrings(ArrayList<String> list, String searchTerm) {
        int start = 0;
        int end = list.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (searchTerm.equalsIgnoreCase(list.get(mid))) {
                return mid;
            } else if (searchTerm.compareToIgnoreCase(list.get(mid)) > 0) {
                // check if it's returning positive
                // then it's the right of the middle
                start = mid+1;
            } else {
                end = mid-1;
            }
        } // end while 

        return -1;
    }// binarySearchStrings

}// class