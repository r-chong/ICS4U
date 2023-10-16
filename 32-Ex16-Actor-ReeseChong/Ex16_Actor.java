public class Ex16_Actor{
	
	public String name;
	private String role;
	private double sales;
	private boolean isPro;

    //constructor
	public Ex16_Actor(String name, boolean pro){
		this.name = name; 
		role = "unassigned";
		sales = 0;
		isPro = pro;

	}//constructor

	//instance methods
	public String toString(){
		return name+"  Role: " + role+"   $" + sales+ "  Professional: " + isPro;

	}

    //setter method
	public void setRole(String role){
		this.role = role;
	}

    // does more than set to sales
    // adds to sales then sets it
    // it's its own method on its own
	// public void addSales (double sale){
	// 	sales += sale;
	// }

    public void sellTix(int numTix) {
        sales += numTix * 15;
    }

    public double pay() {
        double total = 500; // base pay

        if (isPro) {
            total += 200; // extra for professionals
        }

        total += sales * 0.33; // 33% commission

        System.out.println(name + " was paid through Interac eTransfer " + total);
        return total;
    }

    // getter method
	public double getSales(){
	  return sales;
	}



}//actor class