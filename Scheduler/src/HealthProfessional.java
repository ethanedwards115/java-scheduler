import java.io.IOException;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

/**
 * A class which will allow the user the store the details of Health
 * Professionals using an Array List
 *
 * @author Aidan Dolan
 * @version 1.0
 */

public class HealthProfessional {
	// initialise the variables

	private String name;
	private String profession;
	private String location;
	private Diary diary;

	/**
	 * Constructor to set the variables to null
	 */

	public HealthProfessional() {
		name = "";
		profession = "";
		location = "";
		diary = new Diary();
	}

	public HealthProfessional(String name, String profession, String location) {
		this();

		setName(name);
		setProfession(profession);
		setLocation(location);
	}

	/**
	 * Mutator to get the name of the professional
	 *
	 * @return name
	 */

	public String getName() {
		return name;
	}

	/**
	 * Accessor to set the name of the Health Professional
	 *
	 * @param name
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Mutator to get the profession of the Health Professional
	 *
	 * @return
	 */

	public String getProfession() {
		return profession;
	}

	/**
	 * Accessor to set the profession of the Health Professional
	 *
	 * @param profession
	 */

	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * Mutator to get the location of where the Health Professional works
	 *
	 * @return
	 */

	public String getLocation() {
		return location;
	}

	/**
	 * Accessor to set the location of where the Health Professional works
	 *
	 * @param location
	 */

	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Mutator to get the diary
	 *
	 * @return diary
	 */

	public Diary getDiary() {
		return diary;
	}

	/**
	 * Accessor to set the diary
	 *
	 * @param diary
	 */

	public void setDiary(Diary diary) {
		this.diary = diary;
	}

	/**
	 * A method which will create a copy of a health professional object
	 *
	 * @return
	 */

	public HealthProfessional clone() {

		HealthProfessional clonedHP;

		String clonedName = String.copyValueOf(name.toCharArray());
		String clonedProf = String.copyValueOf(profession.toCharArray());
		String clonedLoc = String.copyValueOf(location.toCharArray());

		clonedHP = new HealthProfessional(clonedName, clonedProf, clonedLoc);

		clonedHP.setDiary(diary);

		return clonedHP;

	}

	@Override
	public String toString() {

		String toString = name + ";" + profession + ";" + location + "\n";

		return toString;
	}
}
