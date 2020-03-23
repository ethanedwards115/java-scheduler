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
	 * the clone method makes a copy of an Appointment object so
	 * that it can be stored in a different object reference 
	 */
	public Appointment clone(Appointment appointment) {
		
		Appointment appointmentCopy = new Appointment();
		
		appointmentCopy = appointment;
		
		return appointmentCopy;
		
	}

}

