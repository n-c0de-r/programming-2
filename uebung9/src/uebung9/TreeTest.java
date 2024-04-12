package uebung9;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TreeTest {
	
	
	@Test
	
	public void testPrintBinTree() {
        // Create a binary tree with nodes 1, 2, and 3
        BinNode k = new BinNode(7);
        BinNode m = new BinNode(5,k,null);
        BinNode n = new BinNode(3);
        BinNode o = new BinNode(2, null,n);
        BinNode p = new BinNode(6);
        BinNode q = new BinNode(4,o,p);
        BinNode r = new BinNode(10,m,q);

        BinTree tree = new BinTree(r);

        tree.printBinTree(); 
    }
	
    @Test
    public void testCountLeaves() {
        // Create a binary tree with 3 leaves
        BinNode k = new BinNode(7);
        BinNode m = new BinNode(5,k,null);
        BinNode n = new BinNode(3);
        BinNode o = new BinNode(2, null,n);
        BinNode p = new BinNode(6);
        BinNode q = new BinNode(4,o,p);
        BinNode r = new BinNode(10,m,q);

        BinTree tree = new BinTree(r);

        tree.printBinTree(); 

        // Test the countLeaves method
        int expected = 3;
        int actual = tree.countLeaves();
        Assertions.assertEquals(expected, actual);
        
        
    }

//    @Test
//    public void testCountInnerNodes() {
//        // Create a binary tree with 3 inner nodes
//        BinNode left = new BinNode(1);
//        BinNode right = new BinNode(2);
//        BinNode root = new BinNode(3, left, right);
//        BinTree tree = new BinTree(root);
//
//        // Test the countInnerNodes method
//        int expected = 3;
//        int actual = tree.countInnerNodes();
//        Assertions.assertEquals(expected, actual);
//    }
    
    
// ???????????
    @Test
    public void testFindBiggest() {
        // Create a sorted binary tree
		    BinNode k = new BinNode(7);
		    BinNode m = new BinNode(5,k,null);
		    BinNode n = new BinNode(3);
		    BinNode o = new BinNode(2, null,n);
		    BinNode p = new BinNode(6);
		    BinNode q = new BinNode(4,o,p);
		    BinNode r = new BinNode(10,m,q);
		
		    BinTree tree = new BinTree(r);
		
		    tree.printBinTree(); 

        // Test the findBiggest method
        int expected = 6;
        int actual = tree.findBiggest();
        Assertions.assertEquals(expected, actual);
    }
}
