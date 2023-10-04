// https://www.ontario.ca/page/what-you-should-know-about-fruit-production-ontario
// import libraries
import java.util.ArrayList;
import java.util.Arrays;

class Act8_Crops{

    public static void run(){
        // declare, initialize variables
        Boolean continueFarming = true; 
        String optionChoice = "";
        String searchCrop = "";
        Integer searchCropIndex = 0;
        Integer acres = 0;
        Double yield = 0.0;
        String unit = "";
        Double price = 0.0;
        Double revenue = 0.00;

        // decimal format settings
        Library.dollarFormat.setMinimumFractionDigits(2);

        // populate arraylists
        ArrayList <String> allNames = new ArrayList(
            Arrays.asList("Apricots","Soybeans","Corn","Grapes","Cherries")
        );
        ArrayList <Integer> allAcres = new ArrayList(
            Arrays.asList(25,125,800,25,25)
        );
        ArrayList <Double> allYield = new ArrayList(
            Arrays.asList(6.0,46.3,160.4,10.0,5.0)
        );
        ArrayList <String> allUnits = new ArrayList(
            Arrays.asList("lbs","bushels","bushels","lbs","lbs")
        );
        ArrayList <Double> allPrices = new ArrayList(
            Arrays.asList(1.99,12.80,2.45,1.57,4.90)
        );

        // main while loop
        while(continueFarming) {  
            // being menu prompt
            System.out.println("---------------------------");
            System.out.println("a.. Print farm summary");
            System.out.println("b.. Search & harvest a crop");
            System.out.println("c.. Calculate revenue");
            System.out.println("d.. Exit");
            System.out.println("---------------------------");
            System.out.println("");
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Which farming action would you like to perform?" + Library.TEXT_RESET);
            optionChoice = Library.input.nextLine();

            // reset the search and search index
            searchCrop = "";
            searchCropIndex = -1;    
            
            // option A: farm summary
            if (optionChoice.equalsIgnoreCase("a")) {
                System.out.println(Library.GREEN_BOLD_BRIGHT + "FARM SUMMARY:" + Library.TEXT_RESET);
                
                for (int i = 0; i < allNames.size(); i++) {
                    // store into variables for ease of readability
                    acres = allAcres.get(i);
                    yield = allYield.get(i);
                    unit = allUnits.get(i);
                    price = allPrices.get(i);
                    
                    System.out.println(allNames.get(i) + ":");
                    System.out.println("Acres: " + acres);
                    System.out.println("Yield: " + yield);
                    System.out.println("Units: " + unit);
                    System.out.println("Prices: " + Library.dollarFormat.format(price));
                    System.out.println("");
                }
            } // end option A
            // option B search / harvest crop
            else if (optionChoice.equalsIgnoreCase("b")) {
                // input query 
                System.out.println("Search for a crop to harvest:");
                searchCrop = Library.input.nextLine();

                // search using arraylist search
                searchCropIndex = Library.linearStringSearch(allNames,searchCrop);

                // check if search is existing
                if (searchCropIndex != -1) {
                    System.out.println("Acres: " + allAcres.get(searchCropIndex));
                    System.out.println("Yield: " + allYield.get(searchCropIndex));
                    System.out.println("Units: " + allUnits.get(searchCropIndex));
                    System.out.println("Prices: " + Library.dollarFormat.format(allPrices.get(searchCropIndex)));
                    
                    revenue += allPrices.get(searchCropIndex) * allYield.get(searchCropIndex) * allAcres.get(searchCropIndex);
                    allAcres.set(searchCropIndex, 0);
                } else {
                    // error case
                    System.out.println(Library.TEXT_RED + "Not found" + Library.TEXT_RESET);
                } 
                System.out.println("");
            } // end option B
            // option C: calculate revenue
            else if (optionChoice.equalsIgnoreCase("c")) {
                System.out.println("Total revenue from all harvested crops: " + Library.dollarFormat.format(revenue));
                System.out.println("");
            } // end option C
            // option D: end program
            else if (optionChoice.equalsIgnoreCase("d")) {
                System.out.println("Goodbye");
                System.out.println("");
                break;
            }
        } // end while loop
    }//end run
}//end class

