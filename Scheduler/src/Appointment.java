import java.util.ArrayList;

/**
 * the Appointment class contains all the methods and data relating to the appointments,
 * including the clone() method for cloning Appointment objects
 *
 * @author Eilidh Strachan
 * @version 07/04/2020
 *
 */
public class Appointment {

	private String date;
	private String startTime;
	private String endTime;
	private String type;
	private ArrayList<HealthProfessional> assignedHPs;
	
	/**
	 * default constructor for Appointment class
	 */
	public Appointment() {
		
		// initialises and assigns default values to the variables
		date = "";
		startTime = "";
		endTime = "";
		type = "";
		
		assignedHPs = new ArrayList<HealthProfessional>();
		
	}
	
	/**
	* constructor that takes in the data that the Appointment class stores
	*/
	public Appointment(String date, String startTime, String endTime, String type) {
		
		// assigns values to the variables
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.type = type;
		
		assignedHPs = new ArrayList<HealthProfessional>();
		
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the assignedHPs
	 */
	public ArrayList<HealthProfessional> getAssignedHPs() {
		return assignedHPs;
	}

	/**
	 * @param assignedHPs the assignedHPs to set
	 */
	public void setAssignedHPs(ArrayList<HealthProfessional> assignedHPs) {
		this.assignedHPs = assignedHPs;
	}

	/**
	 * the clone method makes a copy of an Appointment object so that it can be
	 * stored in a different object reference
	 */
	public Appointment clone() {
		
		// creates instance of an Appointment object to store the clone 
		Appointment appointmentCopy;

		// initialises variables for the cloned data to be stored in
		String dateClone = "";
		String startTimeClone = "";
		String endTimeClone = "";
		String typeClone = "";
		
		// copies the data from the appointment to be cloned into the cloned appointment
		dateClone = String.copyValueOf(date.toCharArray());
		startTimeClone = String.copyValueOf(startTime.toCharArray());
		endTimeClone = String.copyValueOf(endTime.toCharArray());
		typeClone = String.copyValueOf(type.toCharArray());
		
		// creates new arraylist 
		ArrayList<HealthProfessional> arrayClone = new ArrayList<HealthProfessional>();
		
		// for each of the assigned health professionals
		for (HealthProfessional hp : assignedHPs) {
			
			// clones the health professional data
			HealthProfessional hpClone = hp.clone();
			
			// adds the cloned health professional data to the clone arraylist 
			arrayClone.add(hpClone);
		}
		
		appointmentCopy = new Appointment(dateClone, startTimeClone, endTimeClone, typeClone);
		
		// adds the cloned health professional data to the appointment clone
		appointmentCopy.setAssignedHPs(arrayClone);

		// returns the cloned appointment
		return appointmentCopy;

	}
	
	@Override
	public String toString() {
		
		String toString = date + ";" + startTime + ";" + endTime + ";" + type + "\n";
		
		return toString;
	}

}
