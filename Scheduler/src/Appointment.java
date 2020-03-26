import java.util.ArrayList;

/**
 * @author Eilidh Strachan
 * @version 16/3/2020
 *
 */
public class Appointment {

	private String date;
	private String startTime;
	private String endTime;
	private String type;
	private ArrayList<HealthProfessional> assignedHPs;

	// Add a default constructor and a constructor that takes in all the different
	// data that this class is supposed to store
	
	/*
	 * e.g. ::
	 * public Appointment() {
	 *     // initialise variables & assign default values
	 * }
	 * 
	 * public Appointment(String date, String startTime, String endTime, String type) {
	 *     // set the variables of the object using "this.<name> = <name>" 
	 *     // note that you only need to initialise the ArrayList, you don't have to
	 *     // assign any HPs yet. In clone(), you can just use setAssignedHPs()
	 * }
	 */

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
	public Appointment clone(Appointment appointment) {
		
		// Here, you don't need the "appointment" parameter. It should just work on
		// the object you're calling the method on.
		
		// First, clone the strings and save them in new object references
		
		// Then, for the ArrayList, make a new ArrayList<HealthProfessional>
		// and use:
		// for (HealthProfessional hp : assignedHPs) {
		//
		//     HealthProfessional clonedHP = hp.clone()
		//     clonedArray.add(clonedHP);
		//}
		
		// Use the setAssignedHPs() method to set the assigned HPs of the *CLONE*
		// to be the cloned array of HPs.
		
		// Finally, just return the clone and you should be done

		Appointment appointmentCopy = new Appointment();

		appointmentCopy = appointment;

		return appointmentCopy;

	}

}
