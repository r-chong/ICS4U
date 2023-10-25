import java.util.ArrayList;
import java.io.*;

class LawnMain {
    public static void run() {
        ArrayList<LawnClient> allClients = new ArrayList();

        allClients.add(new LawnClient("Mr. Buckland", "666 Maple Lane", 20, false));
        allClients.add(new LawnClient("Grogu", "444 Galaxy far far away", 10, true));
        allClients.add(new LawnClient("Luke", "35 Tatooine Drive", 100, false));
        allClients.add(new LawnClient("Queen Amidala", "5 Naboo Street", 200, true));

        // Get new client file from previous company
        loadFile("lawn.csv", allClients);

        while (true) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1.  Print all addresses");
            System.out.println("2.  Mow all lawns");
            System.out.println("3.  Receive Payment");
            System.out.println("4.  Add new client");
            System.out.println("5.  Delinquent Payments");
            System.out.println("6.  Save and Exit");

            int choice = Library.input.nextInt();
            Library.input.nextLine();
            if (choice == 1) {
                printAllClients(allClients);
            } else if (choice == 2) {
                for (int i = 0; i < allClients.size(); i++) {
                    allClients.get(i).mowLawn();
                }
            } else if (choice == 3) {
                System.out.println("Which name is making the payment?");
                String name = Library.input.nextLine();
                System.out.println("How much are they paying?");
                double payment = Library.input.nextDouble();
                Library.input.nextLine();
                int foundIndex = searchByName(allClients, name);
                if (foundIndex == -1) {
                    System.out.println("Name not found.");
                } else {
                    allClients.get(foundIndex).processPayment(payment);
                }
            } else if (choice == 4) {
                System.out.println("Manually (M) or from a .csv file (F)");
                String newClientType = Library.input.nextLine();

                if (newClientType.equalsIgnoreCase("f")) {
                    System.out.println("What is the name of your .csv file?");
                    String fileName = Library.input.nextLine();
                    
                    if (fileName.endsWith(".csv")) {
                        loadFile(fileName, allClients);
                    } else {
                        loadFile(fileName + ".csv",allClients);
                    }
                    
                } else {
                    System.out.println("What is the new client's name?");
                    String newName = Library.input.nextLine();
                    System.out.println("What is the new client's address?");
                    String newAddress = Library.input.nextLine();
                    System.out.println("What is the lawn size in square meters?");
                    int newSize = Library.input.nextInt();
                    Library.input.nextLine();
                    System.out.println("Do they have a dog? (y/n)");
                    String dogTemp = Library.input.nextLine();
                    boolean newDog = dogTemp.startsWith("y"); //converts answers to boolean
                    allClients.add(new LawnClient(newName,newAddress,newSize,newDog));
                }
            } else if (choice == 5) {
                for (int i = 0; i < allClients.size(); i++) {
                    allClients.get(i).delinquentFees();
                }
            } else {
                saveFile("lawn.csv",allClients);
                break;
            }
        } // while

    }// run

    public static void printAllClients(ArrayList<LawnClient> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).address + " Owner:" + list.get(i).name + " Owes: $" + list.get(i).outstandingFees);
        }
    }// printAllClients

    public static int searchByName(ArrayList<LawnClient> list, String searchTerm) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equalsIgnoreCase(searchTerm)) {
                return i;
            }
        }
        
        return -1;
    }// end search

    public static void loadFile(String fileName, ArrayList<LawnClient> list) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(fileName));

            String dataToRead;
            while(file.ready()) {
                dataToRead = file.readLine();
                String tempArray[] = dataToRead.split(",");

                list.add(new LawnClient(tempArray[0],tempArray[1],Integer.parseInt(tempArray[2]),Boolean.parseBoolean(tempArray[3]),Double.parseDouble(tempArray[4])));
            }; // end while
        } catch (IOException e ) {
            System.out.println(e);
        }
    }// end loadFile

    public static void saveFile(String filename, ArrayList<LawnClient> tempList) {
        try {
            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < tempList.size(); i++) {
                String toSave = "";
                toSave = tempList.get(i).name;
                toSave += "," + tempList.get(i).address;
                toSave += "," + tempList.get(i).hasDog;
                toSave += "," + tempList.get(i).outstandingFees;
                
                file.println(toSave);
            }
            file.close();
        }catch(IOException e) {
            System.out.println(e);
        }
    }// end saveFile

}// class