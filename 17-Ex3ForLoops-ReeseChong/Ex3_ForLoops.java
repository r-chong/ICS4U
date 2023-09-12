//Ex3_ForLoops.java
class Ex3_ForLoops {
    // isPrime method

    // prime method
    public static boolean isPrime(int num) {
        // two is a weird one so we keep this as true
        if (num == 2) {
            return true;
        }

        // only do up to half of the number 
        // if it divides evenly into anything (mod0) then we know its a factor
        // therefore not prime
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        // otherwise its a prime
        return true;
    }
    
  public static void run() {
      
    //Count up to 1000

    System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "Counting to 1000" + Library.RESET);

    // loop until 1000
    for (int i = 1; i <= 1000; i++) {
        System.out.print(i + "\t");
    }

	//Count up to 50 showing the square roots of each number

    System.out.println("");
    System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "Counting to 50 by sqrt" + Library.RESET);
    // loop to 50 and square root. format decimals
    for (int i = 1; i <= 50; i++) {
        System.out.println(Library.commaFormat.format(Math.sqrt(i)));
    }

	//Count down from 50, showing the even numbers only

    System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "Counting to 50 by even numbers" + Library.RESET);
    // only print the ones that are evenly divisible by 2 aka even
    for (int i = 50; i >= 1; i--) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }

	//Print out the Prime Numbers up to 100

    System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "Counting Prime to 100" + Library.RESET);
    for (int i = 1; i <= 100; i++) {
        // boolean if statement
        if(isPrime(i)) {
            System.out.println(i);
        }
    }
      
    System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "FizzBuzz" + Library.RESET);
	
    //Code the FizzBuzz Game: 
	  
	for (int i = 1; i <= 100; i++) {
        // check if it is divisible by 3 and 5.. this is first as the other ones would flag it
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        // if it is divisible by 3
        } else if (i % 3 == 0) {
            System.out.println("Fizz");  
        // if it is divisible by 5
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        // else print it
        } else {
            System.out.println(i);
        }
    }
  }
}