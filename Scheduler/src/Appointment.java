import java.util.Date;
import java.util.ArrayList;

/**
 * @author Eilidh Strachan
 * @version 16/3/2020
 *
 */
public class Appointment {
	
	private Date date;
	private Date startTime;
	private Date endTime;
	private String type;
	private ArrayList<HealthProfessional> assignedHPs;
	
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}
	
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}
	
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
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
	public Appointment clone() {
		
	}

}

