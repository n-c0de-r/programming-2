	
/** This class defines the object BinTree and implements the required 
 * methods as described below. (The method's descriptions from the first 4 methods
 * are taken from the provided "BinTreeInterface" class).
 * 
 * @author Tomas Proano (s0589661)
 * @version 1.0 
 * 
 * Programmierung 2 (PCÜ)
 * Pflichtaufgabe Nr. 3
 * Dozentin: Prof. Dr. Adrianna Alexander
 * Tutor: Ole Gordieck
 */


	public class BinTree implements BinTreeInterface {

		// Root node of the binary tree
	    private BinNode root;

	    /**
	     * Creates a binary tree with the given root node
	     * 
	     * @param root: root node of the binary tree
	     */
	    public BinTree(BinNode root) {
	    	this.root = root;
	    }   

		/**
		 * Calculates the maximum sum of the node values on a path from the root to any leaf
		 * 
		 * @return maximum sum of the node values from the root to any leaf
		 */
	    @Override
	    //Calls the method with the root
	    public int calculateMaxSum() {
	        return calculateMaxSum(root);
	    }
	    
	    //Calls the method with a node
	    private int calculateMaxSum(BinNode node) {
	    	// If the node is null, the sum is 0
	        if (node == null) {
	            return 0;
	        }

	        // Calculate the sum of the left subtree
	        int leftSum = calculateMaxSum(node.left);
	        // Calculate the sum of the right subtree
	        int rightSum = calculateMaxSum(node.right);
	        
	        // Return the maximum sum of values 
	        return Math.max(leftSum, rightSum) + node.data;
	    }
	    
		/**
		 * Checks whether the tree is sorted 
		 * 
		 * @param node: the starting node of the binary tree
		 * @return true, if the tree is sorted
		 */
	    
	    @Override
	    //Calls the method with the root
		public boolean isSorted() {
			return isSorted(root);
		}
	    
	    //Calls the method with a node
	    private boolean isSorted(BinNode node) {
	    	// If the tree is empty, it is sorted
	    	if (node == null) {
	    		return true;
	    	}
	    	// If the value of the left child is >= the value of 
	    	// the parent, the tree is not sorted
	    	if (node.left != null && node.left.data >= node.data) {
	    		return false;
	    	}        
	    	// If the value of the right child is <= the value of 
	    	// the parent, the tree is not sorted
	    	if (node.right != null && node.right.data <= node.data) {
	            return false;
	        }
	    	// Check with recursion if left and right subtrees are sorted
	        return isSorted(node.left) && isSorted(node.right);
	    }
		
		
			
		/**
		 * Print all nodes of a tree according to the preorder
		 * using a generic stack
		 * not recursive (but iterative) method 
		 */
	    
	    @Override
	    public void depthFirst() {
	    	// if root is null (empty tree)
	        if (root == null) {
	        	// Skip the rest of the method
	            return;
	        }
	        
	        // If the tree is not empty, create a stack
	        StackGeneric<BinNode> stack = new StackGeneric<>();
	        // Push the root into the stack
	        stack.push(root);

	        while (!stack.isEmpty()) {
	        	// Pop node from the stack
	            BinNode node = stack.pop();
	            // Print the data of the node
	            System.out.println(node.data);

	            // Check if the node has a right child
	            if (node.right != null) {
	            	// If it does, push the right child to the stack
	                stack.push(node.right);
	            }
	            
	            // As above, in this case with the left child
	            if (node.left != null) {
	                stack.push(node.left);
	            }
	        }
	        
	    }

		/**
		 * Removes a node with the given value from a sorted binary tree
		 * after that, the binary tree is still sorted
		 * 
		 * @param value to remove
		 * @return true, if the node with the given value is removed 
		 *         and the tree remains sorted
		 */
	    @Override
	    public boolean removeNode(int away) {
	    	// If root is null (empty tree), return false
	        if (root == null) {
	            return false;
	        }
	        // If root data is the value to remove,
	        // call the removeRoot method
	        if (root.data == away) {
	            BinNode newRoot = removeRoot(root);
	            // Assign new root to root variable
	            root = newRoot;
	            return true;
	        }

	        return removeNode(root, away);
	    }
	    
		/**
		 * Removes a specific node from the tree starting from the given node.
		 * 
		 * @param node: starting node to begin the search for the "away"-node
		 * @param value of node to be removed
		 * @return true if the node with the given value is removed,
		 *         or false if it did not exist/was not found
		 * 
		 */
	    private boolean removeNode(BinNode node, int away) {
	    	
	    	// Check if left child has the value to remove
	        if (node.left != null && node.left.data == away) {
	        	// If found, call the "removeRoot" method to remove the left node
	            node.left = removeRoot(node.left);
	            return true;
	        }
	        
	        // Check if right child has the value to remove
	        if (node.right != null && node.right.data == away) {
	        	// If found, call the "removeRoot" method to remove the right node
	            node.right = removeRoot(node.right);
	            return true;
	        }
	        
	        // If the value to remove is < the node's data 
	        // and there exists a left child
	        if (away < node.data && node.left != null) {
	        	// Call "removeNode" on the left child
	            return removeNode(node.left, away);
	        }
	        
	        // If the value to remove is > the node's data 
	        // and there exists a right child
	        if (away > node.data && node.right != null) {
	        	// Call the "removeNode" method on the right child
	            return removeNode(node.right, away);
	        }
	        // If node to remove was not found, return false
	        return false;
	    }
	    
	    /**
         * Removes the root node from the given binary tree
         * 
         * @param node: the root node of the binary tree
         * @return the updated tree after removing the root node
         */
	    private BinNode removeRoot(BinNode node) {
	    	
	    	// Check if left node is null
	        if (node.left == null) {
	        	// If so, return right node
	            return node.right;
	        }

	        // Check if right node is null
	        if (node.right == null) {
	        	// If so, return left node
	            return node.left;
	        }
	        
	        // Calls the "getSuccessor" method to find the successor of the root node 
	        // (the smallest value in the right).
	        BinNode successor = getSuccessor(node.right);
	        // Assign the left child of the root to the left child of the successor
	        successor.left = node.left;
	        // Return successor node as new root of the tree
	        return successor;
	    }

	    /**
	     * This method finds and returns the node with the smallest value in
	     * the binary tree starting from the given node.
	     * 
	     * @param node: the starting node to find its successor
	     * @return the node with the smallest value in the binary tree
	     */
	    private BinNode getSuccessor(BinNode node) {
	    	
	    	// Iterate until the smallest node is found
	    	// Check if left child is not empty
	        while (node.left != null) {
	        	// Set value of node to left child node
	            node = node.left;
	        }

	        return node;
	    }
	}

