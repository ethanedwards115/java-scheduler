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
	
	public Diary() {
		appointments = new ArrayList<Appointment>();
	}

	/**
	 * Accessor method for appointments
	 * 
	 * @return appointments
	 */
	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}

	/**
	 * Mutator method for appointments
	 * 
	 * @param appointments the list of appointments
	 *
	 */
	public void setAppointments(ArrayList<Appointment> appointments) {
		this.appointments = appointments;
	}

	/**
	 * Displays the contents of the diary
	 */
	public void display() {
		
		String start;
		String end;
		ArrayList<HealthProfessional> hp;
		String type;
		
		for (Appointment appointment : appointments) {
			start = appointment.getStartTime();
			end = appointment.getEndTime();
			hp = appointment.getAssignedHPs();
			type = appointment.getType();

			System.out.println("Appointment");
			System.out.println("Start time: " + start);
			System.out.println("End time: " + end);
			System.out.println("Health professionals present: " + hp);
			System.out.println("Appointment type: " + type);
		}

	}

	/**
	 * Search method to search diary for free appointment slots
	 * 
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

	/**
	 * Method to make a copy of a Diary object
	 * 
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
