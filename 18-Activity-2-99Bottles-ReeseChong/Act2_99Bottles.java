class Act2_99Bottles{
	public static void run(){
		// In this activity, you will print the lyrics to 99 Bottles of Pop/Beer On The Wall. 
		// You will use a for loop to print the numbers in each verse.  
		// Use google to find the lyrics if needed.

        final String [] FRIENDS = {"Minglun","Mohammad","Ryan","Jack","Calvin"};
        final String [] PREFERENCE = {"Sprite","Ginger Ale","Water","Root Beer","Mountain Dew"};
        
        String beverage = "pop";
        String suffix = "bottles";
        String name = "";
        String yesNoIsFriend;
        boolean isFriend = false;
        boolean endProgram = false;
        int age;

        System.out.println("Are you a friend of mine? (y/n)");

        yesNoIsFriend = Library.input.nextLine();
            
        if (yesNoIsFriend.equals("y")) {
            isFriend = true;
            System.out.println("What is your name?");
            name = Library.input.nextLine();
            for (int i = 0; i < FRIENDS.length; i++) {
                if (FRIENDS[i].equals(name)) {
                    beverage = PREFERENCE[i];
                }
            }
            if (beverage == "pop") {
                System.out.println("Hmm, you don't seem to be in my friend list. Try the program again");
                isFriend = false;
                endProgram = true;
            }
        } else if (yesNoIsFriend.equals("n")) {
            System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "How old are you?" + Library.RESET);
            age = Library.input.nextInt();
            Library.input.nextLine();
    
            if (age >= 18) {
                beverage = "beer";
            } else if (age <= 17 && age >= 10) {
                beverage = "pop ";
            } else if (age < 10) {
                beverage = "vegan milk";
            }
        }

        if (!endProgram) {
            for (int i = 99; i >= 1; i--) {
                if (i == 1) {
                    suffix = " bottle of ";
                } else {
                    suffix = " bottles of ";
                }
                
                System.out.println(i + suffix + beverage + " on the wall, " + i + suffix + beverage);
                if (i > 1 && isFriend) {
                    System.out.println("If " + name + " should drink one of those bottles of " + beverage + ",");
                } else {
                    System.out.println("You take one down, pass it around, " + i + suffix + beverage + " on the wall!");
                }
            System.out.println("");
        }
        System.out.println("If one of those bottles should happen to fall, 0 bottles of" + beverage + "on the wall.");   
        }
		
	}//end run

	
}//end class