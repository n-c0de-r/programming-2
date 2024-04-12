package university;

/**
 * This class defines the object Person.
 * 
 * @author Tomas Proano (s0589661)
 * @version 1.0
 * 
 *Programmierung 2 (PCÜ) Pflichtaufgabe Nr. 2 
 *Dozentin: Prof. Dr.Adrianna Alexander 
 *Tutor: Ole Gordieck
 */

/**
 * Constructs a new Docent object with a given name and gender.
 * 
 * @param name: cannot be null or empty.
 * @param gender: can be m, f or d, which stands for male, female and diverse.
 * @param department: must be positive, must be a number between 1 and 6.
 * @throws IllegalArgumentException  if department is not a number between 1 and 6.
 * @see Person#setName()
 * @see Person#setGender()
 */
public class Docent extends Person {

	// Accepted values of "department" are between 1 and 6.
	private int department;

	public Docent(String name, char gender, int department) throws IllegalArgumentException {
		
		//from Person class
		super(name, gender);

		// Number must be between 1 and 6.
		if (department < 1 || department > 6) {
			//if not, throw exception
			throw new IllegalArgumentException(
					"Ungueltiger Parameter. Die Nummer des Fachbereichs kann nur zwischen 1 und 6 sein.");
		}

		this.department = department;
	}

	/**
	 * Sets the department's number of a docent.
	 */
	public void setDepartment(int department) {

		// Number must be between 1 and 6.
		if (department < 1 || department > 6) {
			throw new IllegalArgumentException(
					"Ungueltiger Parameter. Die Nummer des Fachbereichs kann nur zwischen 1 und 6 sein.");
		}

		this.department = department;
	}

	/**
	 * Gets the department's number of a docent.
	 * 
	 * @return department's number
	 */
	public int getDepartment() {
		return department;
	}

	/**
	 * Returns a string representation of a docent.
	 * 
	 * @return string representation.
	 */
	@Override
	public String toString() {
		return ("Docent: Name: " + getName() + ", gender: " + getGender() + ", department: " + getDepartment());
	}

}
