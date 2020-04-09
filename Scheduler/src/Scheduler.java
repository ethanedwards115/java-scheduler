import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
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
	 * Get the user to add a new health professional to the scheduler
	 */
	public void userAddHP() {

		HealthProfessional newHP;

		String name;
		String profession;
		String location;

		System.out.println();
		System.out.print("Enter the name of the health professional to add: ");
		name = Menu.SCANNER.nextLine();

		System.out.println();
		System.out.print("Enter the profession of the health professional to add: ");
		profession = Menu.SCANNER.nextLine();

		System.out.println();
		System.out.print("Enter the office/location of the health professional to add: ");
		location = Menu.SCANNER.nextLine();

		newHP = new HealthProfessional(name, profession, location);

		if (addHP(newHP)) {
			return;

		} else {
			// bruh wtf happened lmao
		}
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
	 */
	public void editHP() {
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
	
	
	public void saveToDisk() {
		
		FileOutputStream fos;
		PrintWriter pw;
		
		ArrayList<Appointment> apps;
		
		try {
			
			fos = new FileOutputStream("datastore.txt");
			pw = new PrintWriter(fos);
			
			for (HealthProfessional hp : hps) {
				
				pw.print(hp);
				
				apps = hp.getDiary().getAppointments();
				
				for(Appointment app : apps) {
					
					pw.print(app);
				}
			}
			
			pw.close();
			fos.close();
		
		} catch(IOException ioe) {
			
		}
	}
}
