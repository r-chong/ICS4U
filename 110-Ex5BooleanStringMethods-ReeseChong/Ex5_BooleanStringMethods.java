class Ex5_BooleanStringMethods {
  public static void run() {

    while (true) {
      int score = 0;

      System.out.println("Movie Quiz");

      System.out.println("Who is the princess in the movie Shrek?");
      String answer1 = Library.input.nextLine().toLowerCase();
      if (answer1.startsWith("fi") || answer1.startsWith("princess f")) {
        System.out.println("Correct");
        score++;
      } else {
        System.out.println("Go watch the movie and try again.");
      }	

      System.out.println("What is the 2022 action movie starring Tom Cruise?");
      answer1 = Library.input.nextLine().toLowerCase();
      // discuss that it would be more memory efficient to use the first answer
      // variable every time we want to Scan strings. But for simplicity of
      // understanding, we will use a new one instead.
      if (answer1.contains("top gun") && (answer1.contains("maverick") || answer1.contains("2"))) {
        System.out.println("Correct for 2 points");
        score += 2;
      } else if (answer1.contains("top gun")) {
        System.out.println("Correct for 1 point");
        score += 1;
      }

      System.out.println("How many dwarves are there in Snow White?");
      int numDwarves = Library.input.nextInt();
      Library.input.nextLine();
      if (numDwarves == 7) {
        System.out.println("Correct for 1 point");
        score += 1;
      } else if (numDwarves > 7 || numDwarves < 7) {
        System.out.println("You must have watched a different movie");
      }

      System.out.println("Your score is: " + score);
      System.out.println("");
    } // while loop

  }// run

}// end class

