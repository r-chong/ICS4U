import java.util.ArrayList;
import java.util.Arrays;

public class Act11_CoinsMain {

    public static void run() {        
        Act11_Coins dCoin = new Act11_Coins("Dime", 9.015, 10, 1.75);
        Act11_Coins qCoin = new Act11_Coins("Quarter", 11.94, 25, 4.4);
        Act11_Coins nCoin = new Act11_Coins("Nickel", 10.6, 5, 3.95);
        Act11_Coins lCoin = new Act11_Coins("Loonie", 13.25, 100, 6.27); 
        Act11_Coins tCoin = new Act11_Coins("Toonie", 14, 200, 6.92);

        ArrayList<Act11_Coins> allCoins = new ArrayList(
            Arrays.asList(nCoin,dCoin,qCoin,lCoin,tCoin)
        );

        for (int i = 0; i < allCoins.size(); i++) {
            Act11_Coins c = allCoins.get(i);
            c.printArea();
            c.printCircumference();
            c.printValue();
            c.deflate(25);
            c.printValue();
            c.deflate(50);
            c.printValue();
            System.out.println("");
        }
        
        // dCoin.printArea();
        // dCoin.printCircumference();
        // dCoin.printValue();
        // dCoin.deflate(25);
        // dCoin.printValue();
        // System.out.println("Darn this government! Call another deflate of 50% and reprint once again.");
        // dCoin.deflate(50);
        // dCoin.printValue();
        
        // System.out.println("");
        
        // qCoin.printArea();
        // qCoin.printCircumference();
        // qCoin.printValue();
        // qCoin.deflate(25);
        // qCoin.printValue();
        // System.out.println("Darn this government! Call another deflate of 50% and reprint once again.");
        // qCoin.deflate(50);
        // qCoin.printValue();

        // System.out.println("");
        
        // nCoin.printArea();
        // nCoin.printCircumference();
        // nCoin.printValue();
        // nCoin.deflate(25);
        // nCoin.printValue();
        // System.out.println("Darn this government! Call another deflate of 50% and reprint once again.");
        // nCoin.deflate(50);
        // nCoin.printValue();

        // System.out.println("");
        
        // lCoin.printArea();
        // lCoin.printCircumference();
        // lCoin.printValue();
        // lCoin.deflate(25);
        // lCoin.printValue();
        // System.out.println("Darn this government! Call another deflate of 50% and reprint once again.");
        // lCoin.deflate(50);
        // lCoin.printValue();

        // System.out.println("");
        
        // tCoin.printArea();
        // tCoin.printCircumference();
        // tCoin.printValue();
        // tCoin.deflate(25);    
        // tCoin.printValue();
        // System.out.println("Darn this government! Call another deflate of 50% and reprint once again.");
        // tCoin.deflate(50);        
        // tCoin.printValue();
    }// end run

}// end class