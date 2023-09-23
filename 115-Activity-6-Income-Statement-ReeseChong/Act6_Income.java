class Act6_Income{
    // declare and initialize arrays that will be used throughout
    // Added 4 of each, however they can be added to
    final public static String[] revNames = {"Carpenting Revenue", "Lawn Mowing Revenue","Snow Removal Revenue","Repairs Revenue"};
    public static double[] revDollars = {56660.00,22634.55,12264.00,500.26}; 
    public static String[] expNames = {"Website Expense","Marketing Expense","Transport Expense","Rental Expense"};
    public static double[] expDollars = {1920.00,2102.94,48000.00,30000.00};

    
	public static void run(){
        // Test out my rounding function! System.out.println(Library.myRound(2355.2653,2));
        updateRevenues();
        printStatement();
	}//end run

    // all calculations done in other methods
    // this method is purely formatting
    public static void printStatement() {
        // declare, initialize main accounting variables 
        // set the toals using totalCalculator method
        double totalRevenues = totalCalculator(revDollars); 
        double totalExpenses = totalCalculator(expDollars); 
        double netIncome = netIncomeCalculator(totalRevenues,totalExpenses);
        // create these variables to reduce redundant calculations
        int revLen = revNames.length-1;
        int expLen = expNames.length-1;        
        // calculate tax
        double taxValue = taxCalculator(netIncome);
        taxCalculator(netIncome);
        double profitAfterTaxes = netIncome - taxValue;

        // MAIN MENU STARTS
        highlightBackground("Chong Corporation");
        highlightBackground("Income  Statement");
        highlightBackground("For the year ended, December 31, 2022");
        System.out.println(Library.TEXT_WHITE_BOLD + "Revenues:" + Library.TEXT_RESET);

        // revenues printing loop
        for (int i = 0; i <= revLen; i++) {
            String revFormatted = Library.dollarFormat.format(revDollars[i]);
            
            if (i == revLen) {
                System.out.println(revNames[i] + "   \t\t\t\t" + Library.WHITE_UNDERLINED + revFormatted + Library.TEXT_RESET);
            } else {
                System.out.println(revNames[i] + "   \t\t\t" + revFormatted);
            }            
        };
        System.out.println("Total Revenues:" + "   \t\t\t\t\t\t" + Library.dollarFormat.format(totalRevenues));
        System.out.println("");
        // revenues end
        
        System.out.println(Library.TEXT_WHITE_BOLD + "Expenses:" + Library.TEXT_RESET);
        // expenses printing loop
        for (int i = 0; i <= expLen; i++) {
            String expFormatted = Library.dollarFormat.format(expDollars[i]);
            
            if (i == expLen) {
                System.out.println(expNames[i] + "  \t\t\t\t" + Library.WHITE_UNDERLINED + expFormatted + Library.TEXT_RESET);
            } else {
                System.out.println(expNames[i] + "  \t\t\t\t" + expFormatted);
            }            
        };
        System.out.println("Total Expenses:" + "  \t\t\t\t\t\t" + Library.WHITE_UNDERLINED + Library.dollarFormat.format(totalExpenses) + Library.TEXT_RESET);
        System.out.println("");
        // expenses end

        // this is the net income print statement
        // if the value is negative, it will put it in brackets (100)
        // it's in another method for cleanliness
        addBrackets(netIncome);

        // taxes menu
        System.out.println("Taxes:" + "  \t\t\t\t\t\t\t\t" + Library.dollarFormat.format(taxValue));
        // profit after taxes
        System.out.println("Profit after Taxes:" + "  \t\t\t\t\t" + Library.dollarFormat.format(profitAfterTaxes));
    } // printStatement

    public static double totalCalculator(double[] arr) {
        int maxNum = arr.length - 1;
        double totalValue = 0;
        
        for (int i = 0; i <= maxNum; i++) {
            totalValue += arr[i];
        }
        
        return totalValue;
    } // totalCalculator

    public static double netIncomeCalculator(double rev, double exp) {
        double netIncomeValue = rev - exp;
        return netIncomeValue;
    } // netIncomeCalculator

    // "Find out the actual income tax rate for businesses in Ontario."
    // I added Ontario federal tax + Ontario provincial tax, as businesses in Ontario must pay both.
    public static double taxCalculator(double netIncome) {
        double taxTotal = 0;
        if (netIncome >= 500000) {
            // corporation rate
            taxTotal = 0.265 * netIncome;
        } else if (netIncome < 0) {
            // no taxable income
            taxTotal = 0;
        } else {
            // small business rate
            taxTotal = 0.122 * netIncome;
        }
        return taxTotal;
    }; // taxCalculator

    public static void addBrackets(double value) {
        // if negative show brackets
        if(value < 0) {
            System.out.println("Net Income:" + "  \t\t\t\t\t\t\t" + "(" + Library.WHITE_UNDERLINED + Library.dollarFormat.format(Math.abs(value)) + ")" + Library.TEXT_RESET);
        } else {
            System.out.println("Net Income:" + "  \t\t\t\t\t\t\t" + Library.WHITE_UNDERLINED + Library.dollarFormat.format(value) + Library.TEXT_RESET);
        }
    } // addBrackets

    // updating reenue logic
    public static void updateRevenues() {
        // setup variables
        String revenueToUpdate = "";
        int indexOfRevenue = -1;
        double newSales = 0;

        // find which one to update
        System.out.println("Which revenue would you like to update?");
        revenueToUpdate = Library.input.nextLine();

        // serach using stringsearch
        indexOfRevenue = Library.stringSearch(revNames, revenueToUpdate);
        System.out.println(revenueToUpdate + " current: " + Library.dollarFormat.format(revDollars[indexOfRevenue]));

        System.out.println("What are the new sales for " + revenueToUpdate + "?");
        newSales = Library.input.nextDouble();
        Library.input.nextLine();

        revDollars[indexOfRevenue] = newSales;
    }; // searchRevenues

    // logic to calculate the amount of blank green space there should be
    public static void highlightBackground(String body) {
        // totalWidth could be responsive based on console width however it is just set to one number currently
        
        int totalWidth = 50;
        int bodyWidth = body.length();
        int paddingWidth = (totalWidth - bodyWidth) / 2;
        // padding is remainder of 45 / 2 (since there are 2 sides)
        
        StringBuilder padding = new StringBuilder();
        for (int i = 0; i < paddingWidth; i++) {
            padding.append(" ");
        }
        System.out.println(Library.TEXT_BACKGROUND_GREEN + padding.toString() + body + padding.toString() + Library.TEXT_RESET);
    } // highlightBackground
    
}//end class