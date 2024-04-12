package university;

/**
 * This class is the Administration class. It implements the AdministrationInterface and overrides the 
 * methods described in that class. 
 * 
 * @author Tomas Proano (s0589661)
 * @version 1.0
 * 
 * Programmierung 2 (PCÜ) Pflichtaufgabe Nr. 2 
 * Dozentin: Prof. Dr. Adrianna Alexander 
 * Tutor: Ole Gordieck
 */

public class Administration implements AdministrationInterface {

	private Person[] personList;

	/**
	 * Constructs a new Administration object that enables to create lists
	 * or an indeterminate (beliebig) number of persons (docents and students).
	 * 
	 * @param utilizes varags, so it is possible to pass multiple parameters.
	 */
	public Administration(Person... list) {
		personList = list;
	}

	/**
	 * This method gives back a sorted list of the persons by name using insertion sort algorithm.
	 * 
	 * @return the sorted list of persons
	 * @throws NullPointerException if list is null.
	 * @throws IllegalStateException if list is empty.
	 * @see AdministrationInterface#sortList()
	 */
	@Override
	public Person[] sortList() throws NullPointerException, IllegalStateException {

		if (personList == null) {
			throw new NullPointerException("Die Liste ist \"Null\".");
		}
		if (personList.length == 0) {
			throw new IllegalStateException("Die Liste ist leer.");
		}

		for (int i = 1; i < personList.length; i++) {
			Person current = personList[i];
			int j = i - 1;

			while (j >= 0 && personList[j].getName().compareTo(current.getName()) > 0) {
				personList[j + 1] = personList[j];
				j--;
			}

			personList[j + 1] = current;
		}
		return personList;
	}

	/**
	 * This method gives back the number of all female students.
	 * 
	 * @throws NullPointerException if list is null.
	 * @throws IllegalStateException if list is empty.
	 * @see AdministrationInterface#countFemale()
	 */
	@Override
	public int countFemale() throws NullPointerException, IllegalStateException {
		
		// If personList == 0, throw exception
		if (personList == null) {
			throw new NullPointerException(
					"Die Liste der Studentinnen ist \"Null\"  (es gibt keine Referenzen zu den Objekten).");
		}

		// Declare and initialize female students counter
		int femaleCount = 0;

		// For each person in the list
		for (Person person : personList) {
			// If person is instance of student and gender is == 'f'
			if (person instanceof Student && ((Student) person).getGender() == 'f') {
				// Increment
				femaleCount++;
			}
		}
		
		// If counter == 0, throw exception
		if (femaleCount == 0) {

			throw new IllegalStateException("Es wurden keine Studentinnen gefunden.");

		}
		// Return the number of female students
		return femaleCount;

	}

	/**
	 * This method gives back a list of all docents working at a specific deparment.
	 * 
	 * @param Number of the department, from which we want to know the number of docents working at it.
	 * @throws NullPointerException if list is null.
	 * @throws IllegalStateException if list is empty.
	 * @throws IllegalArgumentException if number of the department is not between 1 and 6.
	 * @see AdministrationInterface#getDocents()
	 */
	@Override
	public Docent[] getDocents(int department)
			throws NullPointerException, IllegalStateException, IllegalArgumentException {
		//wenn peronList == null ist
		if (personList == null) {
			throw new NullPointerException(
					"Die Liste der Dozierenden ist \"Null\" (es gibt keine Referenzen zu den Objekten).");
		}

		if (department < 1 || department > 6) {
			throw new IllegalArgumentException(
					"Ungueltiger Parameter. Die Nummer des Fachbereichs kann nur zwischen 1 und 6 sein.");
		}

		// Declare and initialize docent counter
		int docentCount = 0;

		// For each person in the list
		for (Person person : personList) {
			//If person is instance of docent and department number is equal to the given deparment number
			if (person instanceof Docent && ((Docent) person).getDepartment() == department) {
				// Increment
				docentCount++;
			}
		}

		// If counter == 0, throw exception
		if (docentCount == 0) {

			throw new IllegalStateException("Es wurden keine Dozierende in diesen Fachbereich gefunden.");

		}

		// Create an array with the length of the docent counter
		Docent[] docents = new Docent[docentCount];
		int index = 0;
		// Another iterarion
		for (Person person : personList) {
			// Same condition as before
			if (person instanceof Docent && ((Docent) person).getDepartment() == department) {
				// Put the docent objects in the respectively index of the array
				docents[index] = (Docent) person;
				// Increment
				index++;
			}
		}
		// Return the array of docents
		return docents;
	}

	/**
	 * This method prints the list of persons.
	 * 
	 * @param List that should be printed.
	 * @throws NullPointerException if list is null.
	 * @see AdministrationInterface#printList()
	 */
	@Override
	public void printList(Person[] list) throws NullPointerException {

		// If list == null, throw an exception
		if (list == null) {
			throw new NullPointerException("Die Liste ist \"Null\".");
		}
		
		// For each person in the list, print the person
		for (Person person : list) {
			System.out.println(person);
		}

	}

	/**
	 * This method returns the array represented as a string.
	 * 
	 * @param here it does not take parameters.
	 */
	@Override
	public String toString() {
		
		// Empty string to use as return in the end with all the names
		String result = "";
		
		// Iterate over each index of the array to and get each name back using the getName method
		for (int i = 0; i < personList.length; i++) {
			result += personList[i].getName();
			
			if (i < personList.length - 1) {
				// Print new line between each name
				result += "\n";
			}
		}
		// Here should be all the names
		return result;
	}

}
