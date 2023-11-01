import java.util.ArrayList;
import java.io.*;

class Act13_DatabaseMain {
    public static void run() {
        // Explain contents of database
        System.out.println(Library.GREEN_BOLD_BRIGHT + "Welcome to the Ontario CS Program Searcher!" + Library.TEXT_RESET);
        System.out.println("This database contains information for all future DAWSS CS students, since they will all go into Computer Science of course. It includes filterable categories to search by town name, in case DAWSS students don't want to live on residence.");

        // initialize arraylist for custom class
        ArrayList<Act_13_Universities> allUniversities = new ArrayList();

        // load from file
        loadFile("Universities.csv", allUniversities);

        // main while loop
        while (true) {
            // menu
            System.out.println(Library.GREEN_BOLD_BRIGHT + "Choose an option from the menu:" + Library.TEXT_RESET);
            System.out.println("1... Print all names");
            System.out.println("2... Search by name");
            System.out.println("3... Add a new university");
            System.out.println("4... Print filtered by town");
            System.out.println("5... Average world rank of universities");
            System.out.println("6... Update world rank");
            System.out.println("7... Update admissions average");
            System.out.println("8... Check if living on residence is recommended for DAW students");
            System.out.println("9... Sort CS programs alphabetically");
            System.out.println("10... Sort CS programs by admissions average");
            System.out.println("11... Search by world rank");
            System.out.println("12... Exit");
            System.out.println("What is your choice?");

            // take choice
            int choice = Library.input.nextInt();
            Library.input.nextLine();

            if (choice == 1) {
                for (int i = 0; i < allUniversities.size(); i++) {
                    System.out.println(allUniversities.get(i).name);
                }
                System.out.println("");
            } // end choice 1
            else if (choice == 2) {
                System.out.println("Which university would you like to search for? Enter the full name.");
                String tempSearch = Library.input.nextLine();
                int indexOfFound = searchByName(allUniversities, tempSearch);

                if (indexOfFound == -1) {
                    System.out.println("University not found");
                } else {
                    System.out.println(allUniversities.get(indexOfFound));
                    System.out.println("");
                }
            } // end choice 2
            else if (choice == 3) {
                System.out.println("What is the name of the university you would like to add?");
                String newName = Library.input.nextLine();
                System.out.println("What is the address of the university?");
                String newAddress = Library.input.nextLine();
                System.out.println("What is the admission average for their CS program?");
                double newAverage = Library.input.nextDouble();
                Library.input.nextLine();
                System.out.println("What is the OUAC fee to apply to this university? (including supp app)");
                double newOUAC = Library.input.nextDouble();
                Library.input.nextLine();
                System.out.println("What region is the new university in? ie. Toronto, Ottawa, Waterloo, Guelph");
                String newTownCategory = Library.input.nextLine();
                System.out.println("What is the world ranking on TIMES Higher Education?");
                int newWorldRank = Library.input.nextInt();
                System.out.println("Is the university located in the GTA? (true/false)");
                boolean newIsInGTA = Library.input.nextBoolean();
                System.out.println("");

                allUniversities.add(new Act_13_Universities(newName,newAddress,newAverage,newOUAC,newTownCategory,newWorldRank,newIsInGTA));
            } // end choice 3
            else if (choice == 4) {
                System.out.println("Which town would you like to search? (ie. Toronto, Waterloo, Kingston, Guelph, Ottawa)");
                String searchCategory = Library.input.nextLine();
                
                for (int i = 0; i < allUniversities.size(); i++) {
                    if (allUniversities.get(i).townCategory.equalsIgnoreCase(searchCategory)) {
                        System.out.println(allUniversities.get(i));
                        System.out.println("");
                    }
                }
            } // end choice 4
            else if (choice == 5) {
                double totalRank = 0.0;
                int numUnis = allUniversities.size();
                double averageRank;
                for (int i = 0; i < allUniversities.size(); i++) {
                    totalRank += allUniversities.get(i).worldRank;
                }
                averageRank = totalRank / numUnis;

                System.out.println("In this database, there are " + numUnis + " universities with a total of " + totalRank + " and an average TIME world ranking of " + averageRank + ".\n(1,904 universities across 108 countries assessed)\n");
            } // end choice 5
            else if (choice == 6) {
                System.out.println("Which university would you like to update the rank of? Enter the full name.");
                String tempSearch = Library.input.nextLine();
                int indexOfFound = searchByName(allUniversities, tempSearch);
                if (indexOfFound == -1) {
                    System.out.println("University not found");
                } else {

                    System.out.println("How much would you like to change the world rank by? (ie. -10)");
                    int rankChange = Library.input.nextInt();
                    Library.input.nextLine();
                    allUniversities.get(indexOfFound).updateWorldRank(rankChange);
                    System.out.println("The new world rank for " + allUniversities.get(indexOfFound).name + " is: " + allUniversities.get(indexOfFound).worldRank);                }
            } // end choice 6
            else if (choice == 7) {
                System.out.println("Which university would you like to update the rank of? Enter the full name.");
                String tempSearch = Library.input.nextLine();
                int indexOfFound = searchByName(allUniversities, tempSearch);

                if (indexOfFound == -1) {
                    System.out.println("University not found");
                } else {
                    System.out.println("How much would you like to change the admissions average by? (ie. 3.22)");
                    double averageChange = Library.input.nextDouble();
                    Library.input.nextLine();
                    allUniversities.get(indexOfFound).updateAdmissionAverage(averageChange);
                    System.out.println("The new average for " + allUniversities.get(indexOfFound).name + " is: " + Library.df.format(allUniversities.get(indexOfFound).admissionAverage) + "%");
                }
            } // end choice 7
            else if (choice == 8) {
                System.out.println("Which university would you like to get recommendations on residence?");
                String tempSearch = Library.input.nextLine();
                int indexOfFound = searchByName(allUniversities, tempSearch);

                if (indexOfFound == -1) {
                    System.out.println("University not found");
                } else {
                    allUniversities.get(indexOfFound).liveOnResidence();
                }
            } // end choice 8
            else if (choice == 9) {
                Sort.selectionSortNames(allUniversities);
                for (int i = 0; i < allUniversities.size(); i++) {
                    System.out.println(allUniversities.get(i).name);
                }
            } // end choice 9
            else if (choice == 10) {
                // insertion sort here
                Sort.insertionSortAdmissionAvgs(allUniversities);
                for (int i = 0; i < allUniversities.size(); i++) {
                    System.out.println(Integer.toString(i+1) + ". " + allUniversities.get(i).name + " (" + Library.df.format(allUniversities.get(i).admissionAverage) + "%)");
                }
            } // end choice 10
            else if (choice == 11) {
                // bubble sort and binary search here
                System.out.println("Which rank # are you searching for?");     
                Sort.bubbleSortWorldRank(allUniversities);
                double searchWorldRank = Library.input.nextDouble();
                Library.input.nextLine();
                int indexOfRank = binarySearch(allUniversities, searchWorldRank);

                if (indexOfRank == -1) {
                    System.out.println("University not found");
                } else {
        System.out.println(allUniversities.get(indexOfRank));
                }
            } // end choice 11
            else {
                saveFile("Universities.csv",allUniversities);
                System.out.println(Library.GREEN_BOLD_BRIGHT + "Program Saved successfully." + Library.TEXT_RESET);
                System.out.println("Good luck on your CS applications!");
                break;
            } // end choice 12
        } // end while loop
    } // end run

    public static int searchByName(ArrayList<Act_13_Universities> list, String searchTerm) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equalsIgnoreCase(searchTerm)) {
                return i;
            }
        }

        return -1;
    }// end search

    public static void loadFile(String fileName, ArrayList<Act_13_Universities> list) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(fileName));

            // java file intake
            String dataToRead;
            while(file.ready()) {
                dataToRead = file.readLine();
                String tempArray[] = dataToRead.split(",");

                list.add(new Act_13_Universities(tempArray[0],tempArray[1],Double.parseDouble(tempArray[2]),Double.parseDouble(tempArray[3]),tempArray[4],Integer.parseInt(tempArray[5]),Boolean.parseBoolean(tempArray[6])));
            }; // end while
        } catch (IOException e ) {
            System.out.println(e);
        }
    }// end loadFile

    // binary search method
    public static int binarySearch(ArrayList<Act_13_Universities> list, double searchTerm) {
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (searchTerm == list.get(mid).worldRank) {
                return mid;
            } else if (searchTerm > list.get(mid).worldRank) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } // while

        return -1;
    }// binarySearchStrings

    public static void saveFile(String filename, ArrayList<Act_13_Universities> tempList) {
        try {
            PrintWriter file = new PrintWriter(new FileWriter(filename));

            // separate by comma
            for (int i = 0; i < tempList.size(); i++) {
                String toSave = "";
                toSave = tempList.get(i).name;
                toSave += "," + tempList.get(i).address;
                toSave += "," + tempList.get(i).admissionAverage;
                toSave += "," + tempList.get(i).ouacFee;
                toSave += "," + tempList.get(i).townCategory;
                toSave += "," + tempList.get(i).worldRank;
                toSave += "," + tempList.get(i).isInGTA;

                file.println(toSave);
            }
            file.close();
        }catch(IOException e) {
            System.out.println(e);
        }
    }// end saveFile
}