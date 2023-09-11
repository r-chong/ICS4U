// imports
import java.lang.Math;

class Act1_Warehouse {
    public static void run() {
        // Initial menu
        System.out.println();
        System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "Reese's New-Items-Only Thrift Store" + Library.RESET);
        System.out.println();
        System.out.println(Library.BLACK_BOLD + "Inventory Tracking System" + Library.RESET);

        // Declare and initialize constants
        final String SALE_ITEM = "GPU";
        
        // Declare variables productType, cost, brandName, numberInShipment
        String productType;
        double cost;
        // this is the initial multiplier. It is always updated later based on the cost
        double multiplier = 1; 
        String priced;
        String brandName;
        int numberInShipment;
        String totalValue;
        boolean playAgain = true;
        boolean backOrder;

        // On sale message (part 1)
        System.out.println("This month's sale: " + SALE_ITEM);

        // Collect data through user input

        // Main loop to allow multiple entries
        // This can be done more efficiently, I will do that in the future (I had to review my Java)
        while(playAgain) {
            // User input for productType
            System.out.println();
            System.out.println("Please enter the type of product received.");
            productType = Library.input.nextLine(); 

            // Logic for on sale message
            if(productType.equals("GPU")) {
                System.out.println("This product is on sale.");
            }

            // User input for cost
            System.out.println("Please enter the cost to us for each " + productType + "?");
            cost = Library.input.nextDouble();
            Library.input.nextLine(); // Clear the input

            // Logic for markup
            if(cost >= 50) {
                multiplier = 1.5;
            } else if (cost < 50) {
                multiplier = 2.0;
            }

            // User input for brand name
            System.out.println("Please enter the brand name of the " + productType);
            brandName = Library.input.nextLine();

            // User input for # in shipment
            System.out.println("Please enter the number in shipment of " + productType);
            numberInShipment = Library.input.nextInt();
            Library.input.nextLine();

            // Logic for back order
            if(numberInShipment < 10 && numberInShipment > 5) {
                System.out.println("Back order warning - Watch inventory level carefully");
            }
            if(numberInShipment <= 5) {
                System.out.println("Back order warning - Order from different supplier");
            }

            // Begin shipment container summary 
            System.out.println("");
            System.out.println(Library.BLACK_BOLD + "Shipment Container Summary:" + Library.RESET);

            // Update the price of productType (priced) and format to 2 decimal places
            // Also calculate total value of container
            priced = String.format("%.2f",multiplier*cost);
            totalValue = String.format("%.2f", cost*multiplier*numberInShipment);

            // Nice user interface
            System.out.println("The new product is " + ConsoleColors.GREEN_BOLD_BRIGHT + productType + Library.RESET);
            System.out.println("The shipment included " + ConsoleColors.GREEN_BOLD_BRIGHT + numberInShipment + Library.RESET + " from " + ConsoleColors.GREEN_BOLD_BRIGHT + brandName + Library.RESET);
            System.out.println("The value of this container is " + ConsoleColors.GREEN_BOLD_BRIGHT + "$" + totalValue + Library.RESET);
            System.out.println("The productType should be priced at " + ConsoleColors.GREEN_BOLD_BRIGHT + "$" + priced + Library.RESET);

            // Logic checking if user wants to "play" the inventory tracking system again
            System.out.println("Are there more products? Type 'y'");
            
            if(Library.input.nextLine().equals("y")) {         
                playAgain = true;
            } else {
                playAgain = false;
                return;
            }
        }
    }// end run

}// end class
