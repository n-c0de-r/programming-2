/**
 * Programmierung 2 (PCÜ)
 * Pflichtaufgabe Nr. 4
 * Dozentin: Prof. Dr. Adrianna Alexander
 * Tutor: Ole Gordieck
 * 
 * The BinNodeGen class represents a node in the binary tree. Each node contains 
 * an item of a generic type and references to its left and right child nodes. 
 * The item in each node implements the Comparable interface. 
 * 
 * @author Tomas Proano
 * @version 1.0
 * @param <E> any class which implements the interface Comparable<E>
 */
public class BinNodeGen<E extends Comparable<E>> {
	
	private E item;
	private BinNodeGen<E> leftNode;
	private BinNodeGen<E> rightNode;
	
	/**
	 * This constructor sets the item in the node
	 * @param item item in the node, cannot be null
	 * @throws NullPointerException if item is null
	 */
	public BinNodeGen(E item) throws NullPointerException {
		if(item == null) {
			throw new NullPointerException("Item cannot be null!");
		}
		this.item = item;
		leftNode = null;
		rightNode = null;
	}
	
	/**
	 * This method returns the item in the node
	 * @return item in node
	 */
	public E getItem() {
		return item;
	}
	
	/**
	 * This method returns the left node of the current node
	 * @return left node of current node
	 */
	public BinNodeGen<E> getLeftNode() {
		return leftNode;
	}
	
	/**
	 * This method sets the left node of the current node
	 * @param node left node of the current node, cannot be null
	 * @throws NullPointerException if node is null
	 */
	public void setLeftNode(BinNodeGen<E> node) throws NullPointerException {
		if(node == null) {
			throw new NullPointerException("Node cannot be null!");
		}
		leftNode = node;
	}
	
	/**
	 * This methods returns the right node of the current node
	 * @return right node of current node
	 */
	public BinNodeGen<E> getRightNode() {
		return rightNode;
	}
	
	/**
	 * This method sets the right node of the current node
	 * @param node right node of the current node, cannot be null
	 * @throws NullPointerException if node is null
	 */
	public void setRightNode(BinNodeGen<E> node) throws NullPointerException {
		if(node == null) {
			throw new NullPointerException("Node cannot be null!");
		}
		rightNode = node;
	}

}