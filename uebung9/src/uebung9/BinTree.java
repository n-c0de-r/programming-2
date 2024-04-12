package uebung9;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This methods prints a binary tree.
 * 
 */
public class BinTree{
	
	private BinNode root = null;
	
	
	BinTree() { root = null;
	}
	
	BinTree(BinNode rn) { root = rn;
	}
	
	// de la uebung 
	
	   // Method to print the binary tree
    public void printBinTree() {
    	printBinTree(root);
    }

    private void printBinTree(BinNode node) {
        if (node != null) {
            // Print the left subtree
        	System.out.print("(");
            printBinTree(node.left);

            // Print the root node
            System.out.print(node.data);

            // Print the right subtree
            printBinTree(node.right);
            System.out.print(")");
        }
    }
    
    /**
     * Counts the number of leaves in the binary tree.
     * @return the number of leaves in the binary tree
     */
    public int countLeaves() {
        return countLeaves(root);
    }

	private int countLeaves(BinNode node) {

		int counter = 0;

		if (node == null) {
			return counter;
		}

		if (node != null) {
			// wenn k ein Blatt
			if (node.left == null && node.right == null) {
				counter++; // auch: return 1;
			} else { 
				// wenn k kein blatt -> rekursion
				counter = countLeaves(node.left) + countLeaves(node.right);
			}
		}
		return counter;
	}
    
    /**
     * Finds the biggest value in a sorted binary tree.
     * This method assumes that the binary tree is sorted.
     * @return the biggest value in the sorted binary tree
     */
    		
    public int findBiggest() {
    	return findBiggest(BinNode node);
    }
    
    private int findBiggest(BinNode node) throws IllegalStateException {
    	
    	if (node == null) {
    		//exception
    	}
    	if (node.right != null) {
    		//rekursion
    		
    		findBiggest(node.right);
    		
    	} else {
    		return node.data;
    		}
    	return biggest;
    }



    /**
     * Counts the number of inner nodes in the binary tree.
     * @return the number of inner nodes in the binary tree
     */
    public int countInnerNodes() {
        return countInnerNodes(root);
    }

    private int countInnerNodes(BinNode node) {
        if (node == null || (node.left == null && node.right == null)) {
            return 0;
        } else {
            return 1 + countInnerNodes(node.left) + countInnerNodes(node.right);
        }
    }
    
    /**
     * Performs a breadth-first traversal on the binary tree and prints each visited node.
     */
    public void breadthFirst() {
        if (root == null) {
            return;
        }

        // Create a queue to store nodes for traversal
        Queue<BinNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // Dequeue a node from the queue
            BinNode node = queue.poll();

            // Print the visited node
            System.out.print(node.data + " ");

            // Enqueue the left and right child nodes for traversal
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
    
    
    // de las folien  /////////////////////////////////

	private int countNodes(BinNode k) {
		int counter = 0;
		if(k != null) {
			counter = 1 + countNodes(k.left) + countNodes(k.right);
	}
	
	return counter; 
	}
	
	public int countNodes() { 
		return countNodes(root);
	}

	
	private int calculateDepth(BinNode k) { 
		int counter = 0;
	//falls k nicht leer und kein Blatt 
		if(k != null && (k.left != null || k.right != null)) { 
		Math.max(calculateDepth(k.left),
		calculateDepth(k.right)); 
		}
		return counter;
	}
	
	public int calculateDepth() { 
		return calculateDepth(root);
	}
	
}
