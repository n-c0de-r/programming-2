/** This class defines the BinNode object.
 * 
 * @author Tomas Proano (s0589661)
 * @version 1.0 
 * 
 * Programmierung 2 (PCÜ)
 * Pflichtaufgabe Nr. 3
 * Dozentin: Prof. Dr. Adrianna Alexander
 * Tutor: Ole Gordieck
 */

public class BinNode {
	
	// Data stored in the node
	int data; 
	
	// References to the left and right child nodes
	BinNode left;
	BinNode right; 
	
    /**
     * Creates a node with the given data and sets 
     * the left and right child references to null
     * (to create nodes without child nodes)
     * 
     * @param dataValue: value of the node being created
     */
	
	BinNode(int dataValue) {
		data = dataValue;
		left = null;
		right = null;
	}
	
	
    /**
     * Creates a node with the given data and sets the left 
     * and right child references to the given nodes
     * (to create nodes with child nodes)
     * 
     * @param dataValue: value of the node being created
     * @param BinNode l: left node
     * @param BinNode r: right node
     */
	
	BinNode(int dataValue, BinNode l, BinNode r) {
		data = dataValue;
		left = l;
		right = r;
	}
}