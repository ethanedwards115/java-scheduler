import java.io.IOException;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

/**
 * A class which will allow the user the store the details of Health Professionals using an Array List
 *
 * @author Aidan Dolan
 * @version 1.0
 */

public class HealthProfessional {
    //initialise the variables

    private ArrayList<String> assignedHP; // creates an Array list which will store the details
    private String name;
    private String profession;
    private String location;
    private String diary;

    /**
     * Constructor to set the variables to null
     */

    public HealthProfessional() {
        name = "";
        profession = "";
        location = "";
        diary = "";
    }

    /**
     * Mutator to get the name of the professional
     *
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * Accessor to set the name of the Health Professional
     *
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mutator to get the profession of the Health Professional
     *
     * @return
     */

    public String getProfession() {
        return profession;
    }

    /**
     * Accessor to set the profession of the Health Professional
     *
     * @param profession
     */

    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * Mutator to get the location of where the Health Professional works
     *
     * @return
     */

    public String getLocation() {
        return location;
    }

    /**
     * Accessor to set the location of where the Health Professional works
     *
     * @param location
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Mutator to get the diary
     *
     * @return diary
     */

    public String getDiary() {
        return diary;
    }

    /**
     * Accessor to set the diary
     *
     * @param diary
     */

    public void setDiary(String diary) {
        this.diary = diary;
    }

    /**
     * Method to add Health Professional's details to the array list
     */

    public ArrayList addToList() {
        ArrayList<String> assignedHP = new ArrayList();
        Scanner s1 = new Scanner(System.in);

        System.out.println("Please enter the name of the Health Professional");
        System.out.println("Please enter the profession of the Health Professional e.g. Doctor/Nurse");
        System.out.println("Please enter the location of where the Health Professional works e.g. Dundee");
        assignedHP.add(s1.next());
        return assignedHP;
    }

    /**
     * Method to print the Arraylist
     */

    // don't think this method is correct
    public void printList()
    {
        while (assignedHP != null)
        {
            System.out.print(assignedHP);
        }

        /**
         * Method which will allow the file to be saved to disk
         */
    }

    public void saveToDisk()
    {
        FileOutputStream fileOutputStream;
        PrintWriter printWriter;

        try {
            fileOutputStream = new FileOutputStream("healthprofessionals.txt"); // This will save the array list of health professionals
            printWriter = new PrintWriter(fileOutputStream);
            printWriter.println("The is the file contains the records of the Health Professionals");
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Sorry an error occurred");
        }
    }

    /**
     * Method which will load a file from the disk
     */

    // don't know if this works
    public void loadFromDisk() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String nextLine;

        try
        {
            fileReader = new FileReader("healthprofessionals.txt"); // Will load the file containing the array list
            bufferedReader = new BufferedReader(fileReader);

            nextLine = bufferedReader.readLine();
            while (nextLine != null) ;
            {
                System.out.println(nextLine);
                nextLine = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e)
        {
            System.out.println("Sorry there is an error");
        }
    }

    /**
     * A method which will create a copy of the class
     *
     * @param healthProfessional
     * @return
     */

    public HealthProfessional clone(HealthProfessional healthProfessional) {

        HealthProfessional healthProfessionalCopy = new HealthProfessional();

        healthProfessionalCopy = healthProfessional;

        return healthProfessionalCopy;

    }
}
