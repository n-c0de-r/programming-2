/** This class represents a generic stack data structure. 
 * The stack is implemented using a linked list, where each element 
 * of the stack is represented by an instance of the "Element" class. 
 * 
 * @author Tomas Proano (s0589661)
 * @version 1.0 
 * 
 * Programmierung 2 (PCÜ)
 * Pflichtaufgabe Nr. 3
 * Dozentin: Prof. Dr. Adrianna Alexander
 * Tutor: Ole Gordieck
 */

public class StackGeneric<T> {
	
	// Private instance variable that point to the top element of the stack
	private Element<T> top;

	
	/**
	 * This method adds a new element to the top of the stack 
	 * It also creates a new instance of "Element" with the given input
	 */
	public void push(T input) {
		
		// New instance of "Element" with the provided input
		Element<T> newElem = new Element<>(input);
		
		// Set reference "next" to the top element
		newElem.next = top;
		// Update "top" to point to the new element
		top = newElem;
	}

	/**
	 * This method removes and returns the element at the top of the stack
	 * 
	 * @return the data stored in the element of the top of the stack  
	 *         or null, if the stack is empty
	 */
	public T pop() {
		
		// If the stack is empty, return null
		if (top == null) {
			return null;
		}

		// Access data of "top"
		T data = top.data;
		// Update the "top" reference to point the next element in the stack
		top = top.next;
		return data;
	}

	/**
	 * This method just checks is the stack is empty with a comparison 
	 * of "top" with null
	 * 
	 * @return "true" if the stack is empty or "false" if not
	 */
	public boolean isEmpty() {
		return top == null;
	}
}