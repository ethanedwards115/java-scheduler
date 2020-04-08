import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ruthgurney
 * @version 05/04/20
 */
public class Diary {
    private ArrayList<Appointment> appointments;


    /**
     *Accessor method for appointments
     * @return appointments
     */
    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    /**
     *Mutator method for appointments
     * @param appointments the list of appointments
     *
     */
    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    /**
     *Displays the contents of the diary
     * @param hp list of health professionals
     * @param start start time of appointment
     * @param end end time of appointment
     * @param type type of appointment taking place
     */
    public void  display(ArrayList<HealthProfessional> hp, String start, String end, String type ) {
        for (Appointment appointment : appointments) {
            appointment.getStartTime();
            appointment.getEndTime();
            appointment.getAssignedHPs();
            appointment.getType();

            System.out.println("Appointment");
            System.out.println("Start time: " + start);
            System.out.println("End time: " + end);
            System.out.println("Health professionals present: " + hp);
            System.out.println("Appointment type: " + type);
        }


    }

    /**
     *Search method to search diary for free appointment slots
     * @param hp list of health professionals
     * @return
     *
     */
    public ArrayList<Appointment> search(ArrayList<HealthProfessional> hp) {
        Scanner s = new Scanner(System.in);
        String start;
        String end;
        String requiredHPs;
        Date startDate;
        Date endDate;

        System.out.println("Please enter the start date for when you wish your appointment to be.");
        start = s.nextLine();
        System.out.println("Please enter the end date for when you wish your appointment to be.");
        end = s.nextLine();
        System.out.println("Please enter the health professionals needed for this appointment, seperated by commas");
        requiredHPs = s.nextLine();

        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");

        try {
            startDate = f.parse(start);
            endDate = f.parse(end);

        } catch (ParseException ex) {
            System.out.println("Incorrect date format. " + ex);
        }


        String[] searchHP = requiredHPs.split(",");

        for (int i = 0; i < appointments.size(); i++) {

        }

        return null;

    }

    public void saveToDisk()
    {
        FileOutputStream fileOutputStream;
        PrintWriter printWriter;

        try {
            fileOutputStream = new FileOutputStream("diary of our me.txt"); // This will save the array list of health professionals
            printWriter = new PrintWriter(fileOutputStream);
            printWriter.println("The is the file contains the records of the Health Professionals");
            {
                printWriter.print(display(hp, start, end, type));
            }
            printWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("Sorry an error occurred");
        }
    }

    /**
     * Method which will load a file from the disk
     */

    // don't know if this works
    public void loadFromDisk()
    {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String nextLine;

        try
        {
            fileReader = new FileReader("diary.txt"); // Will load the file containing the array list
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
     *Method to make a copy of a Diary object
     * @return diaryClone
     */
    public Diary clone() {

        Diary diaryClone = new Diary();
        ArrayList<Appointment> listCopy = new ArrayList<Appointment>();

        for (Appointment app : appointments) {
            Appointment appCopy;
            appCopy = app.clone();
            listCopy.add(appCopy);

        }

        diaryClone.setAppointments(listCopy);
        return diaryClone;

    }
}
