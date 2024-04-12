/**
 * Programmierung 2 (PCÜ)
 * Pflichtaufgabe Nr. 4
 * Dozentin: Prof. Dr. Adrianna Alexander
 * Tutor: Ole Gordieck
 * 
 * This class represents a student in a student management system. 
 * The class implements the StudentInterface and Comparable<Student> interfaces 
 * to provide necessary methods for managing and comparing students. 
 * 
 * Some comments of the methods of this class are available in the interface.
 * to avoid redundancy.
 * 
 * @author Tomas Proano
 * @version 1.0
 * @param <E> any class which implements the interface Comparable<E>
 */

public class Student implements StudentInterface, Comparable<Student> {
	 
	// Attributes
	private int matriculationNo;
	private String name;
	private String course;
	
	
	/**
	 * Constructor without parameters, attributes with default values
	 */
	public Student() {
	    this.matriculationNo = 0;
	    this.name = ""; 
	    this.course = ""; 
	}

	/**
	 * A unique 6-digits matriculation number is assigned to each student
       upon enrollment
	 * Each student has a name
	 * Each student has a course he/she has enrolled for	
	 * @param m matriculation number, must be greater than or equal to 100000
	 * @param n name, cannot be null or an empty string
	 * @param c course, cannot be null or an empty string
	 * @throws IllegalArgumentException if matriculationNo, name or 
	 *         course is not valid
	 * @throws NullPointerException if name or course is null
	 */
	public Student(int m, String n, String c)
			throws IllegalArgumentException, NullPointerException {
		if (m < 100000) {
			throw new IllegalArgumentException("Invalid matriculation number");
		}
		if (n == null || n.isEmpty()) {
			throw new NullPointerException("Name cannot be null or empty");
		}
		if (c == null || c.isEmpty()) {
			throw new NullPointerException("Course cannot be null or empty");
		}
		matriculationNo = m;
		name = n;
		course = c;
	}
	
	//Getter and setter (as required, no setter for matriculationNo):
	
	@Override
	public int getMatriculationNo() {
		return matriculationNo;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) throws NullPointerException, IllegalArgumentException {
		if (name == null) {
			throw new NullPointerException("Name cannot be null");
		}
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}

	@Override
	public String getCourse() {
		return course;
	}

	@Override
	public void setCourse(String course) throws NullPointerException, IllegalArgumentException {
		if (course == null) {
			throw new NullPointerException("Course cannot be null");
		}
		if (course.isEmpty()) {
			throw new IllegalArgumentException("Course cannot be empty");
		}
		this.course = course;
	}

	// Required methods:
	
	@Override
	public String toString() {
		return "Matriculation No: " + matriculationNo 
				+ ", Name: " + name 
				+ ", Course: " + course;
	}

	@Override
	public int compareTo(Student other) {
	    if (this.matriculationNo < other.matriculationNo) {
	        return -1;
	    } else if (this.matriculationNo > other.matriculationNo) {
	        return 1;
	    } else {
	    	// equal
	        return 0;
	    }
	}
    
}