import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This test class contains 4 test cases of the removeNode() method. 
 * The first two tests cover a null tree and a tree with only one node, respectively. 
 * The next two tests use Abbildung 1 and Abbildung 2 and remove nodes that are present
 * and not present in each tree. 
 * 
 * The tests 3 and 4 also verify that the resulting tree is sorted.
 * 
 * @author Tomas Proano (s0589661)
 * @version 1.0
 * 
 * Programmierung 2 (PCÜ) Pflichtaufgabe Nr. 3 
 * Dozentin: Prof. Dr. Adrianna Alexander 
 * Tutor: Ole Gordieck
 */

public class BinTreeTest {
	
	private BinNode root1, root2;
	
	@Before
	public void setup() {
		
		// Create different instances for testing purposes
		
		// Example tree (Abbildung 1)
		//       7
		//      / \
		//     4   9
		//    / \   \
		//   2   5   8
		//  / \
		// 1   3
		
		root1 = new BinNode(7);
		
		BinNode leftChild1 = new BinNode(4);
		BinNode rightChild1 = new BinNode(9);
		BinNode leftChild11 = new BinNode(2);
		BinNode rightChild11 = new BinNode(5);
		BinNode leftChild111 = new BinNode(1);
		BinNode rightChild111 = new BinNode(3);
		BinNode rightChild12 = new BinNode(8);
		
		root1.left = leftChild1;
		root1.right = rightChild1;
		
		leftChild1.left = leftChild11;
		leftChild1.right = rightChild11;
		leftChild11.left = leftChild111;
		leftChild11.right = rightChild111;
		rightChild1.right = rightChild12;
		
		
		// Modified example tree (Abbildung 2)
		//     6
		//    / \
		//   4   9
		//  / \
		// 2   7
		root2 = new BinNode(6);
		
		BinNode leftChild2 = new BinNode(4);
		BinNode rightChild2 = new BinNode(9);
		BinNode leftChild21 = new BinNode(2);
		BinNode rightChild21 = new BinNode(7);
		
		root2.left = leftChild2;
		root2.right = rightChild2;
		
		leftChild2.left = leftChild21;
		leftChild2.right = rightChild21;
	}
	
	// Remove node from a null tree
	@Test
	public void testRemoveNodeNullTree() {
		BinTree tree = new BinTree(null);
		boolean removed = tree.removeNode(5);
		Assert.assertFalse(removed);
	}
	
	// Remove a node from a tree with just one node/root
	@Test
	public void testRemoveNodeSingleRoot() {
		BinNode root = new BinNode(5);
		BinTree tree = new BinTree(root);
		boolean removed = tree.removeNode(5);
		Assert.assertTrue(removed);
		Assert.assertNull(root.left);
		Assert.assertNull(root.right);
	}
	
	// Remove nodes 3, 9, 4, 7 and 10 (not existent)
	@Test
	public void testRemoveNodeFigure1() {
		BinTree tree = new BinTree(root1);
		
		boolean removed3 = tree.removeNode(3);
		boolean removed9 = tree.removeNode(9);
		boolean removed4 = tree.removeNode(4);
		boolean removed7 = tree.removeNode(7);
		boolean removed10 = tree.removeNode(10);
		
		Assert.assertTrue(removed3);
		Assert.assertTrue(removed9);
		Assert.assertTrue(removed4);
		Assert.assertTrue(removed7);
		Assert.assertFalse(removed10);
		
		// Check if sorted
		boolean isSorted = tree.isSorted();
		Assert.assertTrue(isSorted);
	}
	
	// Remove nodes 4, 7 and 10 (not existent)
	@Test
	public void testRemoveNodeFigure2() {
		BinTree tree = new BinTree(root2);
		
		boolean removed4 = tree.removeNode(4);
		boolean removed7 = tree.removeNode(7);
		boolean removed10 = tree.removeNode(10);
		
		Assert.assertTrue(removed4);
		Assert.assertTrue(removed7);
		Assert.assertFalse(removed10);
		
		// Check if sorted
		boolean isSorted = tree.isSorted();
		Assert.assertTrue(isSorted);
	}

}