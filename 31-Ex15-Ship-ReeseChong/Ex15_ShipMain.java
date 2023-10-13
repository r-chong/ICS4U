import java.util.ArrayList;
import java.util.Arrays;

class Ex15_ShipMain {

	public static void run() {
    Ex15_Ship ship1 = new Ex15_Ship("Millenium Falcon", true, "Lando", 1500, new ArrayList(Arrays.asList("Chewie","R2-D2")),1,true);
    Ex15_Ship ship2 = new Ex15_Ship("Titanic", false, "White Starline", 0, new ArrayList(Arrays.asList("Leonardo DiCaprio","Kate Winslett")),0,false);
    Ex15_Ship ship3 = new Ex15_Ship("Falcon Heavy", false, "Elon", 0, new ArrayList(Arrays.asList("X Æ A-Xii")),3,true);

    System.out.println(ship1.toString());
    System.out.println("");
    System.out.println(ship2);
    System.out.println("");
    System.out.println(ship3);
    System.out.println("");

   // System.out.println(ship1.captain); // variable is private and can not be accessed from here
   // ship1.captain = "Mr. Buckland"; // variable is private and can not be accessed from here
    System.out.println("");

    ship1.setCaptain("Mr. Buckland");
    ship1.addCrewmate("Mr. Mah");
    System.out.println(ship1);

    System.out.println("");
        
    ship2.addYears(12);
    ship2.addLifeBoat(1);
    System.out.println(ship2);
    System.out.println(ship2.inspectLifeboats());
  }// run

}// end class