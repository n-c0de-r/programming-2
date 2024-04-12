package university;

/** This class defines the object Student.
 * @author Tomas Proano (s0589661)
 * @version 1.0 
 * 
 * Programmierung 2 (PCÜ)
 * Pflichtaufgabe Nr. 2
 * Dozentin: Prof. Dr. Adrianna Alexander
 * Tutor: Ole Gordieck
 */

public class Student extends Person{

	// must be positiv, have 6 digits and cannot start with 0
	private int matrikelnummer;

	/**
	 * Constructs a new Student object with a given name, gender and matriculation number.
	 * 
	 * @param name: cannot be null or empty.
	 * @param gender: can be m, f or d, which stands for male, female and diverse.
	 * @param matrikelnummer: must be positive, must have 6 digits and cannot start with 0.
	 * @throws IllegalArgumentException  if "Matrikelnummer" < 0.
	 * @throws IllegalArgumentExceptionwenn "Matrikelnummer" does not have 6 digits or starts with 0, throw an exception.
	 * @see Person#setName()
	 * @see Person#setGender()
	 */
	public Student(String name, char gender, int matrikelnummer) throws IllegalArgumentException {

		//from Person class
		super(name, gender);

		// if "Matrikelnummer" < 0, throw an exception
		if (matrikelnummer < 0) {
			throw new IllegalArgumentException("Die Matrikelnummer muss positiv sein");
		}

		// if "Matrikelnummer"  does not have 6 digits or starts with 0, throw an exception
		if (matrikelnummer >= 1000000 || matrikelnummer < 100000) {
			throw new IllegalArgumentException("Die Matrikelnummer muss stellig sein und darf nicht mit Null beginnen.");
		}

		this.matrikelnummer =  matrikelnummer;
	}

	/**
	 * Sets the matriculation number of a student.
	 */
	public void setMatrikelnummer(int matrikelnummer) throws IllegalArgumentException {

		// if "Matrikelnummer" < 0, throw an exception
		if (matrikelnummer < 0) {
			throw new IllegalArgumentException("Die Matrikelnummer muss positiv sein.");
		}

		// if "Matrikelnummer"  does not have 6 digits or starts with 0, throw an exception
		if (matrikelnummer >= 1000000 || matrikelnummer < 100000) {
			throw new IllegalArgumentException("Die Matrikelnummer muss stellig sein und darf nicht mit Null beginnen.");
		}

		this.matrikelnummer = matrikelnummer;
	}

	/**
	 * Gets the matriculation number of a student.
	 * 
	 * @return matriculation number
	 */
	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	/**
	 * Returns a string representation of a student.
	 * 
	 * @return string representation.
	 */
	@Override
	public String toString() {
		return ("Student: Name: " + getName() + ", Geschlecht: "+ getGender() + ", Matrikelnummer: " + getMatrikelnummer());
	}

}
