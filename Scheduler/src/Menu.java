import java.util.Scanner;

public class Menu {

	public static Scanner SCANNER = new Scanner(System.in);
	public Scheduler scheduler = new Scheduler();

	public void display() {

		System.out.println("Scheduler - Main Menu");
		System.out.println();
		System.out.println("1 - Add a health professional");
		System.out.println("2 - Edit the details of a health professional");
		System.out.println("3 - Delete a health professional");
		System.out.println("4 - Display diary entries for an individual health professional");
		System.out.println("5 - Save diary entries to disk");
		System.out.println("6 - Restore diary entries from disk");
		System.out.println("7 - Schedule an appointment");
		System.out.println("8 - Undo last change");
		System.out.println();
		System.out.println("0 - Exit");
	}

	public void processUserChoices() {

		display();

		String choice;

		choice = SCANNER.nextLine();

		switch (choice) {

		case "1":
			scheduler.userAddHP();
			break;

		case "2":
			scheduler.editHP();
			break;

		case "3":
			break;

		case "4":
			break;

		case "5":
			break;

		case "6":
			break;

		case "7":
			scheduler.scheduleAppointment();
			break;

		case "8":
			scheduler.undo();
			break;

		case "0":
			System.exit(0);
			break;

		default:
			System.out.println("Invalid choice. Please select another option.");
			break;
		}
	}

	public static void main(String[] args) {
		Menu m = new Menu();

		while (true) {
			m.processUserChoices();
		}
	}
}