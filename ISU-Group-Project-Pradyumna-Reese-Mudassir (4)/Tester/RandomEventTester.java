//RandomEventTester
import UserInteraction.*;

public class RandomEventTester {
    public static void main(String[] args) {

      //Creating RandomEvent Object
        RandomEvent randEvent = new RandomEvent(
                "Campus Sustainability Initiative",
                "Students and faculty are advocating for a campus sustainability initiative to reduce the university's environmental impact...",
                "Expenses: -$80,000 (sustainability initiative), Campus Sustainability: +10%, Environmental Research Program: +10%",
                "Missed opportunity for enhancing campus sustainability and environmental awareness"
            );

        // Test case 1: constructor test
        System.out.println("Constructor test: ");
        System.out.println("Expected title: Campus Sustainability Initiative");
        System.out.println("Actual title: " + randEvent.getTitle());
        System.out.println("");
        
        System.out.println("Expected description: Students and faculty are advocating for a campus sustainability initiative to reduce the university's environmental impact...");
        System.out.println("Actual description: " + randEvent.getDescription());
        System.out.println("");

        System.out.println("Expected Accept result: Expenses: -$80,000 (sustainability initiative), Campus Sustainability: +10%, Environmental Research Program: +10%");
        System.out.println("Actual result: " + randEvent.getAcceptResult());
        System.out.println("");
        
        System.out.println("Expected Ignore Result: Missed opportunity for enhancing campus sustainability and environmental awareness");
        System.out.println("Actual Ignore Result: " + randEvent.getIgnoreResult());
        System.out.println("");

        // Test case 2: set title and get title
        randEvent.setTitle("Awesome event");
        System.out.println("Test case 2: Set title to Awesome event");
        System.out.println("Expected title: Awesome event");
        System.out.println("Actual title: " + randEvent.getTitle());
    }
}//end class