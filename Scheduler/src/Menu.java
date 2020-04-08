import java.util.ArrayList;
import java.util.Scanner;

public class Menu
{
    private ArrayList <HealthProfessional> hp;
    private Appointment app;
    private Diary diary;

    public static void main(String []args)
    {
        Menu myMenu = new Menu();
        myMenu.runMenu();
    }

    /**
     * Method to display the appointments from the Menu
     * @param start
     * @param end
     * @param type
     */

   public void displayAppointments(String start, String end, String type)
   {
       diary = new Diary();
       diary.display(hp,start,end, type);
   }

    /**
     * Method to load the Diary from the Menu
     */

   public void saveDiary()
   {
       diary = new Diary();
       diary.saveToDisk();
   }

    /**
     * Method to load the Diary from the Menu
     */

    public void loadDiary()
   {
        diary = new Diary();
        diary.loadFromDisk();
   }

    /**
     * Method to search the Diary from the Menu
     */
   public void searchDiary()
   {
       diary = new Diary();
       diary.search(hp);
   }

    /**
     * Method to clone the diary from the Menu
     */

    public void cloneDiary()
    {
        diary = new Diary();
        diary.clone();
    }

    /**
     * Method to add Health Professionals from the menu
     */
    public void addHealthProfessional()
    {
        hp = new ArrayList<HealthProfessional>();
        hp.addTolist();

    }

    /**
     * Method to print the Health Professionals from the Menu
     */
    public void printList()
    {
        hp = new ArrayList<HealthProfessional>();
        hp.printList();

    }

    /**
     * Method to save the Health Professionals from the Menu
     */

    public void saveHP()
    {
        hp = new ArrayList<HealthProfessional>();
        hp.saveToDisk;
    }

    /**
     * Method to load the Health Professoionals from the menu
     */

    public void loadHP()
    {
        hp = new ArrayList<HealthProfessional>();
        hp.loadFromDisk;
    }

    /**
     * Method to clone the Health Professional class
     */

    public void cloneHP()
    {
        hp = new ArrayList<HealthProfessional>();
        hp.clone;
    }
    private void runMenu() {
        String choice;
        boolean exit = false;

        do {

            printMenu();
            choice = getString("Please make a choice, and press ENTER: ");

            switch (choice) {
                case "A":
                case "a":
                    addHealthProfessional();
                    break;
                case "B":
                case "b":
                    printList();
                    break;
                case "C":
                case "c":
                    saveHP();
                    break;
                case "D":
                case "d":
                    loadHP();
                    break;
                case "E":
                case "e":
                    cloneHP();
                    break;
                case "F":
                case "f":
                    displayAppointments();
                    break;
                case "G":
                case "g":
                    saveDiary();
                case "H":
                case "h":
                    loadDiary();
                case "I":
                case "i":
                    cloneDiary();
                case "Q":
                case "q":
                    System.out.println("Goodbye\n");
                    exit = true;
                    break;
                default:
                    System.out.println("That is not a valid choice, please try again");
                    break;
            }

        }
        while (!exit);
    }

    public void  printMenu()
    {
        System.out.println("\nLottery test Menu");
        System.out.println("A - Add Health Professionals to the system");
        System.out.println("B - Print the Health Professional List");
        System.out.println("C - Save the Health Professionals to the disk");
        System.out.println("D - Load the Health Professionals from the disk");
        System.out.println("E- Clone the Health Professional Class ");
        System.out.println("F - Display Appointments");
        System.out.println("G - Search for appointments");
        System.out.println("H- Save the appointments to disk");
        System.out.println("I - load the appointments from disk");
        System.out.println("J- Clone the appointments");
        System.out.println("Q - quit");
    }


    public String getString(String userPrompt)
    {
        Scanner s = new Scanner(System.in);
        System.out.print(userPrompt);
        while (!s.hasNext())
        {
            s.next();
            System.out.print(userPrompt);
        }
        return s.next();
    }

}


