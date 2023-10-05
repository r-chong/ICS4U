class Act3_Quiz{    
	public static void run(){
        // declare and initialize variables
        int correct = 0;
        String username;
        String topStudent = "";
        int topScore = 0;
        String strResponse;
        double numResponse;
        int intResponse;

        // main logic loop
        do {
            correct = 0;
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Welcome to the Humanities Quiz!" + Library.TEXT_RESET);

            // ask user for name
            System.out.println("What is your name?");

            // allow exiting
            username = Library.input.nextLine();
            if (username.equals("exit")) {
                break;
            }

            // question 1   (equalsIgnoreCase)
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Question 1: " + Library.TEXT_RESET + "What is the capital of France?");

            strResponse = Library.input.nextLine();
            if (strResponse.equalsIgnoreCase("paris"))                 {
                correct+=1;
                System.out.println(Library.TEXT_GREEN + "You are correct!" + Library.TEXT_RESET);
            } else {
                System.out.println(Library.TEXT_RED + "Incorrect." + Library.TEXT_RESET);
            }
            System.out.println(""); // end question 1

            // question 2 (==)
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Question 2: " + Library.TEXT_RESET + "What was the 2019 population of Canada in millions?");
            numResponse = Library.input.nextDouble();
            Library.input.nextLine();
            
            if (numResponse == 37.6 || numResponse == 38) {
                correct+=1;
                System.out.println(Library.TEXT_GREEN + "You are correct!" + Library.TEXT_RESET);
            } else {
                System.out.println(Library.TEXT_RED + "Incorrect." + Library.TEXT_RESET);
            }
            System.out.println(""); // end question 2

            // question 3 (.contains)
             System.out.println(Library.GREEN_BOLD_BRIGHT + "Question 3: " + Library.TEXT_RESET + "Who was the first Canadian astronaut on the ISS?");
            strResponse = Library.input.nextLine();
            strResponse.toLowerCase();
            if (strResponse.contains("julie") || strResponse.contains("payette")) {
                correct+=1;
                System.out.println(Library.TEXT_GREEN + "You are correct!" + Library.TEXT_RESET);
            } else {
                System.out.println(Library.TEXT_RED + "Incorrect." + Library.TEXT_RESET);
            }
            System.out.println(""); // end question 3

            // question 4 (startswith, endswith)
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Question 4: " + Library.TEXT_RESET + "Which of the following continents starts with the letter A and contains the Sahara Desert?");
            System.out.println("Europe\nAsia\nAfrica\nAustralia");
            strResponse = Library.input.nextLine();
            strResponse.toLowerCase();
            if (strResponse.startsWith("a") || strResponse.endsWith("ica")) {
                correct+=1;
                System.out.println(Library.TEXT_GREEN + "You are correct!" + Library.TEXT_RESET);
            } else {
                System.out.println(Library.TEXT_RED + "Incorrect." + Library.TEXT_RESET);
            }
            System.out.println(""); // end question 4

            // question 5 (==)
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Question 5: " + Library.TEXT_RESET + "Which spot is Canada on the OECD BetterLifeIndex?");
            intResponse = Library.input.nextInt();
            if (intResponse == 10) {
                correct+=1;
                System.out.println(Library.TEXT_GREEN + "You are correct!" + Library.TEXT_RESET);
            } else {
                System.out.println(Library.TEXT_RED + "Incorrect." + Library.TEXT_RESET);
            }
            System.out.println(""); // end question 5

            if(correct > topScore) {
                topStudent = username;
                topScore = correct;
            }

            // scoreboard
            System.out.println(Library.GREEN_BOLD_BRIGHT + username + Library.TEXT_RESET + ", " + "you received a " + correct + " out of 5");
            System.out.println("Current high score: " 
+ topStudent + " with " + topScore);

            // credits
            System.out.println("This test was created and marked by Reese Chong.\nPress enter to continue.");
            Library.input.nextLine();
            Library.input.nextLine();
            System.out.println("\n---\n");
        }while(!username.equalsIgnoreCase("exit"));
	}
	
}