import java.util.ArrayList;

class Ex12_ElementsSort{
    public static void run(){
        ArrayList<String> sciTeachers = new ArrayList();
        sciTeachers.add("Feddema");
        sciTeachers.add("Yau");
        sciTeachers.add("MacGillvary");
        sciTeachers.add("Lobraico");
        sciTeachers.add("Maillet");
        
        System.out.println(sciTeachers);
        Sort.bubbleSortStrings(sciTeachers);
        System.out.println(sciTeachers);


        ArrayList<String> elements = Files.loadStringList("data/enames.txt");
        // System.out.println(elements);
        ArrayList<Double> weights  = Files.loadDoubleList("data/weights.txt");

        System.out.println("Sorted by name");
        // Sort.bubbleSortStrings(elements);
        // Sort.bubbleSortDoubles(weights);
        bubbleSortByName(elements,weights);
        for(int i=0; i<elements.size(); i++){
            System.out.println( elements.get(i) + "  " + weights.get(i)  );
			//Something has gone wrong with the sorting...
			
        }//end forLoop
        
    }//run

    public static void bubbleSortByName(ArrayList<String> elements, ArrayList<Double> weights) {
        boolean swap = true;
        String temp = "";
        double temp2 = 0.0;
        while (swap) {
            swap = false;
            for (int i = 0; i < elements.size() - 1; i++) {
                // check if it's returning a positive
                if (elements.get(i).compareToIgnoreCase(elements.get(i + 1)) > 0) {
                    swap = true;
                    // swap names
                    temp = elements.get(i + 1);
                    elements.set(i + 1, elements.get(i));
                    elements.set(i, temp);
                    // swap weights
                    temp2 = weights.get(i + 1);
                    weights.set(i + 1, weights.get(i));
                    weights.set(i, temp2);
                }
            }
        }
    }// end bubbleSortStrings
    
}//class
