/**
 * Programmierung 2 (PCÜ)
 * Pflichtaufgabe Nr. 4
 * Dozentin: Prof. Dr. Adrianna Alexander
 * Tutor: Ole Gordieck
 * 
 * This class is an implementation of the BinTreeGenInterface that represents 
 * a generic sorted binary tree. The nodes of the tree contain objects that 
 * implement the Comparable interface.
 *
 * Comments of the methods of this class are available in the respective interface.
 * 
 * @author Tomas Proano
 * @version 1.0
 * @param <E> any class which implements the interface Comparable<E>
 */

public class BinTreeGen<E extends Comparable<E>> implements BinTreeGenInterface<E> {
	
	private BinNodeGen<E> root;
	
	/**
	 * This constructor initializes the root variable to "null"
	 */
	public BinTreeGen() {
		root = null;
	}
	/**
	 * This getter returns the root node of the binary tree
	 * @return object of type BinNodeGen<E>
	 */
    public BinNodeGen<E> getRoot() {
        return root;
    }

	@Override
	public int countNodes() {
		// Just the root
		return countNodes(root);
	}
	
	private int countNodes(BinNodeGen<E> node) {
		if(node == null) {
			return 0;
		}
		// else increment count by 1 and add results of calling the method 
		// on the left and right nodes
		return 1 + countNodes(node.getLeftNode()) + countNodes(node.getRightNode());
	}

	@Override
	public boolean insertNode(E item) {
		if(root == null) {
			// if root == null, create a new node 
			// with the given item as the root
			root = new BinNodeGen<E>(item);
			return true;
		}
		// else pass root and item as parameters
		return insertNode(root, item);
	}
	
	private boolean insertNode(BinNodeGen<E> node, E item) {
		if(item.compareTo(node.getItem()) < 0) {
			// item is smaller, go to the left subtree
			if(node.getLeftNode() == null) {
				node.setLeftNode(new BinNodeGen<E>(item));
				return true;
			} else {
				return insertNode(node.getLeftNode(), item);
			}
		} else if(item.compareTo(node.getItem()) > 0) {
			// item is larger, go to the right subtree
			if(node.getRightNode() == null) {
				node.setRightNode(new BinNodeGen<E>(item));
				return true;
			} else {
				return insertNode(node.getRightNode(), item);
			}
		} else {
			// false, if item already exists
			return false;
		}
	}

	@Override
	// Pass item to be found as an argument
	public BinNodeGen<E> find(E item) {
		// Call find() method and passes root and item as parameters 
		return find(root, item);
	}
	
	private BinNodeGen<E> find(BinNodeGen<E> node, E item) {
		// Base case
		if(node == null) {
			return null;
		}
		if(item.compareTo(node.getItem()) == 0) {
			return node;
		} else if(item.compareTo(node.getItem()) < 0) {
			// Item is smaller, go to the left subtree
			return find(node.getLeftNode(), item);
		} else {
			// Item is larger, go to the right subtree
			return find(node.getRightNode(), item);
		}
	}
	
	@Override
	public String toString() {
	    // String representation of root
		return toString(root);
	}

	private String toString(BinNodeGen<E> node) {
		// Return an empty string for nodes == null
		if(node == null) {
			return "";
		}
		String output = "";
		 // Traverse the left subtree and append it to the output
		output += toString(node.getLeftNode());
		// Append the current node's item (as a string with a space)
		output += node.getItem().toString() + " ";
		// Traverse the right subtree and append it to the output
		output += toString(node.getRightNode());
		// Return final result
		return output;
	}

}