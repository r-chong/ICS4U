import org.hamcrest.Description.NullDescription;

import junit.extensions.RepeatedTest;

class Act3_Airfare{
    public static void run(){

        // initialize variables
        int numTravelers;
        boolean isMember;
        String city;
        String ticketClass;
        String dayToday;
        int mealChoice;

        // initialize and declare variables
        double eachTicket = 0;
        double discount = 0;

        // main questioning area
        System.out.println("What day of the week is it?");
        dayToday = Library.input.nextLine();

        // used Library.input.nextLine() to make sure ghost characters aren't there
        System.out.println("How many travelers in your party?");
        numTravelers = Library.input.nextInt();
        Library.input.nextLine();

        // run discount logic
        System.out.println("Are you a member of BucklandAir? (true or false)");
        isMember = Library.input.nextBoolean();
        Library.input.nextLine();
        discount = isMember(isMember);

        System.out.println("Where are you travelling?");
        city = Library.input.nextLine();

        System.out.println("What class of ticket (first, business, economy)");
        ticketClass = Library.input.nextLine();

        // new method for part 4
        System.out.println("Which meal option would you like?\nNote: if in a party, you must all get the exact same item.");
        System.out.println("1) Grilled fish legs\n2) Liquified cheese in a jar\n3) Vegetarian ham\n4) Strange Salad\n5) Backpack d'oeuvre");

        // get user input for meal choice
        mealChoice = Library.input.nextInt();
        Library.input.nextLine();
        System.out.println("Enjoy your meal!");

        // final statements and calculations
        // the prices are decimal formatted
        eachTicket = destinationAmount(city);
        eachTicket += mealAmount(mealChoice);
        eachTicket -= discount;
        eachTicket += classAmount(ticketClass) + dayAmount(dayToday);
        System.out.println("Each ticket is: $" + String.format("%.2f",eachTicket));
        System.out.println("Your total is: $" + String.format("%.2f",(eachTicket * numTravelers)));
    }//run

    // check for class type then return the amount it should be per ticket
    // this is not input validated
    public static double classAmount(String ticketClass){
        double subtotal = 0;
        
        if (ticketClass.equalsIgnoreCase("first")) {
            subtotal = 700;
        } else if (ticketClass.equalsIgnoreCase("business")) {
            subtotal = 400;
        } else if (ticketClass.equalsIgnoreCase("economy")) {
            subtotal = 100;
        }
        return subtotal;
    }//classamount

    // calculate distance for pricing
    public static double destinationAmount( String city ){
        final String[] destinations= {"Edmonton", "Cancun","Calgary", "Vancouver","Nunavut","New York","Alberta"};
        final double[] distances = {3297.80, 5261.0, 3239.1, 4206.2, 2968.0, 789.7, 3572.3};

        int indexOfDistance = -1;
        // should have more input validation, because it defaults to index 0
        // however it still needs to be initialized..
        
        for (int i = 0; i < destinations.length; i++) {
            if (city.equals(destinations[i])) {
                indexOfDistance = i;
            }
        }
        return distances[indexOfDistance];
    }//destinationAmount

	
	// logic for weekday pricing
 	public static double dayAmount(String travelDay) {
        double dayPrice = 40.00;
        
       if (travelDay.equals("saturday") || travelDay.equals("Sunday")) {
           dayPrice = 100.00;
       }  else if (travelDay.equals("Friday")) {
           dayPrice = 80.00;
       } else {
           dayPrice = 40.00;
       }

	return dayPrice; //this line is temporary to avoid an error
    }// end dayAmount

    // logic for checking if the user is a member
    // then give discount else allow them to become a member
    // honesty is our policy
	public static double isMember(Boolean member) {
        double discount = 0.00;
        String response;
        
        if (member) {
            System.out.println("BucklandAir thanks you for your loyalty with a $50 reimbursement.");
           return 50.00;
        } else {
            System.out.println("Would you like to join our loyalty program? (y/n)");
            response = Library.input.nextLine();
            if (response.equals("y")) {
                isMember(true);
            } else {
                System.out.println("Okay, enjoy your trip");
            }
        }

	return 0.0; //this line is temporary to avoid an error
    }// end dayAmount

    // get the meal price based on the index
    public static double mealAmount(int mealChoice) {
        final double[] MEALS = {18.99,13.39,25.98,0.76,12.99};

        return MEALS[mealChoice-1];
    }
}//end class