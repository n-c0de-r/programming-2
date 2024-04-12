/**
 * Programmierung 2 (PCÜ)
 * Pflichtaufgabe Nr. 4
 * Dozentin: Prof. Dr. Adrianna Alexander
 * Tutor: Ole Gordieck
 * 
 * This class implements the StudentManagementInterface, which 
 * represents a student management system using a binary search tree. 
 * 
 * Some comments of the methods of this class are available in the interface.
 * to avoid redundancy.
 * 
 * @author Tomas Proano
 * @version 1.0
 * @param <E> any class which implements the interface Comparable<E>
 */public class StudentManagement implements StudentManagementInterface {
	 
	// studentTree declared as instance of BinTreeGen<Student> 
	// The BinTreeGen<Student> class enables storing and updating 
	// student's data
	private BinTreeGen<Student> studentTree;

	/**
	 * Constructor which initializes the student tree
	 */
	public StudentManagement() {
		studentTree = new BinTreeGen<Student>();
	}

	@Override
	public int countStudents() {
		return studentTree.countNodes();
	}

	@Override
	public boolean insertStudent(Student student) {
		return studentTree.insertNode(student);
	}

	@Override
	public Student searchStudent(int matriculationNo) throws IllegalArgumentException {
	    if (matriculationNo < 100000) {
	        throw new IllegalArgumentException("Invalid matriculation number!");
	    }
	    // Create a temporary student object with the provided matriculation number, 
	    // a name, and a non-null, non-empty course
	    Student temporaryStudent = new Student(matriculationNo, "dummy", "dummy");
	    //looks for student
	    BinNodeGen<Student> node = studentTree.find(temporaryStudent);
	    // if found, return object
	    if (node != null) {
	        return node.getItem();
	    } else {
	    	//otherwise, return null
	        return null;
	    }
	}

	@Override
	public boolean isStudent(Student s) throws NullPointerException {
		// checks if student == null
		if (s == null) {
			throw new NullPointerException("Student cannot be null.");
		}
		//if node not empty, return true. Else, return false
		BinNodeGen<Student> node = studentTree.find(s);
		if (node != null) {
			return true;
		} else {
			return false;
		}
	}
	
	/** 
	 * This method generates a string representation of the 
	 * student tree using recursion. It creates string representations 
	 * of the left and right nodes and concatenates them with information 
	 * of the current node 
	 * @param node parameter representing the current node in the recursion
	 */
	private String generateStudentTreeString(BinNodeGen<Student> node) {
		// if node == null, return empty string
	    if (node == null) {
	        return "";
	    }
	    
	    // generate strings
	    String leftChild = generateStudentTreeString(node.getLeftNode());
	    String rightChild = generateStudentTreeString(node.getRightNode());
	    
	    // return students' information
	    return "Matriculation Number: " + node.getItem().getMatriculationNo()
	            + ", Name: " + node.getItem().getName()
	            + ", Course: " + node.getItem().getCourse()
	            + ", Left Node: " + getChildInfo(node.getLeftNode())
	            + ", Right Node: " + getChildInfo(node.getRightNode())
	            + "\n" + leftChild + rightChild;
	}

	/**
	 * This method returns the string representation of the node object's 
	 * matriculation number if the node is not null, otherwise it returns 
	 * the string "null".
	 * @param node
	 * @return String (matriculation number) or "null" if node == null
	 */
	private String getChildInfo(BinNodeGen<Student> node) {
	    if (node != null) {
	        return String.valueOf(node.getItem().getMatriculationNo());
	    } else {
	        return "null";
	    }
	}
	
	/**
	 * This method returns a string representation of the student tree 
	 * (with recursion). 
	 * It uses the countNodes() and the toStringHelper() method
	 * @return String representation of student tree
	 */
	@Override
	public String toString() {
	    return "Student tree:\nNumber of students: " 
	    		+ countNodes(studentTree.getRoot()) + "\n" 
	    		+ toStringHelper(studentTree.getRoot());
	}

	/**
	 * This method counts the number of nodes in the subtree rooted at node 
	 * and returns the count (with recursion)
	 * @param node
	 * @return count of nodes
	 */
	private int countNodes(BinNodeGen<Student> node) {
	    if (node == null) {
	        return 0;
	    }
	    return 1 + countNodes(node.getLeftNode()) + countNodes(node.getRightNode());
	}

	/**
	 * This method recursively generates a string representation of the student tree by 
	 * concatenating the string representations of the left child, the current node's student data
	 * and the string representations of the right child
	 * 
	 * @param node
	 * @return empty string (if node === null) or string of student tree
	 */
	private String toStringHelper(BinNodeGen<Student> node) {
		// if node == null, return empty string
	    if (node == null) {
	        return "";
	    }
	    // get left node
	    String leftChildStr = toStringHelper(node.getLeftNode());
	    // get student's data
	    String studentDataStr = "Name: " + node.getItem().getName() 
	    		+ ", Course: " + node.getItem().getCourse();	    
	   // get right node
	    String rightChildStr = toStringHelper(node.getRightNode());
	    // return student tree
	    return leftChildStr + studentDataStr + "\n" + rightChildStr;
	}

}