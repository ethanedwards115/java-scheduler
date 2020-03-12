
import java.util.ArrayList;

/**
 * A scheduler class for scheduling appointments for health professionals
 * 
 * @author Ethan Edwards
 * @version 11/03/2020
 */
public class Scheduler {

	private ArrayList<HealthProfessional> hps;
	private HistoryStack history;

	/**
	 * Default constructor
	 */
	public Scheduler() {
		hps = new ArrayList<HealthProfessional>();
		history = new HistoryStack();
	}

	/**
	 * Add a new health professional to the Scheduler
	 * 
	 * @param hp The health professional to add
	 * @return {@code true} if the add was successful, {@code false} otherwise
	 */
	public boolean addHP(HealthProfessional hp) {

		history.push(hps);
		return hps.add(hp);
	}

	/**
	 * Remove a health professional from the scheduler by their index
	 * 
	 * @param index The index of the health professional to remove
	 * @throws IndexOutOfBoundsException
	 */
	public void deleteHP(int index) throws IndexOutOfBoundsException {
		history.push(hps);
		hps.remove(index);
	}

	/**
	 * Edit the details of a health professional
	 * 
	 * @param index The index of the health professional whose details are to be
	 *              edited
	 */
	public void editHP(int index) {
		// TODO some stuff that allows the user to edit the details of a health
		// professional
	}

	/**
	 * Schedule an appointment
	 */
	public void scheduleAppointment() {

	}

	/**
	 * Undo a previous edit to the scheduler
	 */
	public void undo() {
		hps = history.pop();
	}
}
