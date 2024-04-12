/** This class defines the interface BinTreeInterface and implements the required methods as described below.
 *
 * @author Tomas Proano (s0589661)
 * @version 1.0 
 * 
 * Programmierung 2 (PCÜ)
 * Pflichtaufgabe Nr. 3
 * Dozentin: Prof. Dr. Adrianna Alexander
 * Tutor: Ole Gordieck
 */

// upload not needed

public interface BinTreeInterface {
	
	/**
	 * calculates the maximum sum of the node values on a path from the root to any leaf
	 * @return maximum sum of the node values from the root to any leaf
	 */
	public abstract int calculateMaxSum();

	/**
	 * checks whether the tree is sorted 
	 * @return true, if the tree is sorted
	 */
	public abstract boolean isSorted();


	/**
	 * print all nodes of a tree according to the preorder
	 * using a generic stack
	 * not recursive (but iterative) method 
	 */
	public abstract void depthFirst();

	/**
	 * removes a node with the given value from a sorted binary tree
	 * after that the binary tree is still sorted
	 * @param away given value to remove
	 */
	public abstract boolean removeNode(int away);

}
