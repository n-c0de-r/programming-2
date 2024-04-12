package university;

/**
 * This class defines the object Person.
 * 
 * @author Tomas Proano (s0589661)
 * @version 1.0
 * 
 * Programmierung 2 (PCÜ) Pflichtaufgabe Nr. 2 
 * Dozentin: Prof. Dr. Adrianna Alexander 
 * Tutor: Ole Gordieck
 */

public abstract class Person {

	private String name;
	private char gender;

	/**
	 * Constructs a new Person object with a given name and gender.
	 * 
	 * @param name:   cannot be null or empty.
	 * @param gender: must be 'm', 'f' or 'd', which stands for male, female and  diverse.
	 * @throws IllegalArgumentException if name is null or empty.
	 * @throws IllegalArgumentException if another character other than 'm', 'f' or 'd' is used.
	 */
	protected Person(String name, char gender) throws IllegalArgumentException {

		//if name is null or empty
		if (name == null || name.isEmpty()) {
			// throw an exception
			throw new IllegalArgumentException("Ein Name muss angegeben werden.");
		}

		this.name = name;

		// if gender is not 'm', 'f' or 'd'
		if (gender != 'm' && gender != 'f' && gender != 'd') {
			// throw an exception
			throw new IllegalArgumentException("Das Geschlecht muss als 'm', 'f' oder 'd' angegeben werden.");
		}
		this.gender = gender;
	}

	// Getter and setter

	/**
	 * Sets the name of a person.
	 * 
	 * @throws IllegalArgumentException if name is null or empty.
	 */
	protected void setName(String name) {
		
		//if name is null or empty
		if (name == null || name.isEmpty()) {
			// throw an exception
			throw new IllegalArgumentException("Ein Name muss angegeben werden.");
		}

		this.name = name;
	}

	/**
	 * Gets the name of a person.
	 * 
	 * @return name.
	 */
	protected String getName() {
		return name;
	}

	/**
	 * Sets the gender of a person.
	 * 
	 * @param gender: can be 'm', 'w' or 'd', which stands for male, female and diverse.
	 * @throws IllegalArgumentException if another character other than 'm', 'f' or 'd' is used.
	 */
	protected void setGender(char gender) {

		// if gender is not 'm', 'f' or 'd'
		if (gender != 'm' || gender != 'f' || gender != 'd') {
			// throw an exception
			throw new IllegalArgumentException("Das Geschlecht muss als 'm', 'f' oder 'd' angegeben werden.");
		}

		this.gender = gender;
	}

	/**
	 * Gets the gender of a person.
	 * 
	 * @return character indicating gender.
	 */
	protected char getGender() {
		return gender;
	}

}
