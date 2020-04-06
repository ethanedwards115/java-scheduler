import java.util.ArrayList;
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
    public void setAppointments(ArrayList<appointment> appointments) {
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
            appointment.getStartTime(start);
            appointment.getEndTime(end);
            appointment.getAssignedHPs(hp);
            appointment.getType(type);
            
            System.out.println("Appointment");
            System.out.println("Start time: " + start);
            System.out.println("End time: " + end);
            System.out.println("Health professionals present: " + hp);
            System.out.println("Appointment type: " + type);
        }
        
           
    }
    
/**
 *Search method to search diary for free appointment slots
 * 
 * @return 
 * 
 */
    public ArrayList<Appointment> search() {
        Scanner s = new Scanner(System.in);
        ArrayList<HealthProfessional> searchHp;
        String start;
        String end;
        System.out.println("Please enter the start date for when you wish your appointment to be.");
        start = s.nextLine();
        System.out.println("Please enter the end date for when you wish your appointment to be.");
        end = s.nextLine();
        System.out.println("Please enter the health professionals needed for this appointment.");
        
        
        return null;
        
    }
    
    
/**
 *Method to make a copy of a Diary object
 * @return diaryClone
 */
    public Diary clone() {

        Diary diaryClone = new Diary();
	ArrayList<Appointment> listCopy = new ArrayList<appointments>();

            for (Appointment app : appointments) {
			Appointment appCopy;
                        appCopy = app.clone();
			listCopy.add(appCopy);
                        
    }
    
        diaryClone.setAppointments(listCopy);
	return diaryClone;	

}
}
