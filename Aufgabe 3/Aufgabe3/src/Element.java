/** This generic class "Element" represents a node in the tree. 
 * There are two instance variables: 
 * "data" -> stores the data of type "T" that the node will have.
 * "next" -> stores a reference to the next node in the tree.
 * 
 * The class also has a constructor, as described in the comments.
 * 
 * @author Tomas Proano (s0589661)
 * @version 1.0 
 * 
 * Programmierung 2 (PCÜ)
 * Pflichtaufgabe Nr. 3
 * Dozentin: Prof. Dr. Adrianna Alexander
 * Tutor: Ole Gordieck
 */

public class Element <T> {
	
	// Stores data of type "T"
	T data;
	
	// Stores a reference to the next node
	Element<T> next;
	
	/**
	 * Constructs a new "Element" object that that takes an input of 
	 * type "T" and  assigns it to the "data" variable
	 * The "next" variable is set to "null"
	 * 
	 * @param input: type parameter "T"
	 */
	public Element(T input) {
		data = input;
		next = null;
	}

}
