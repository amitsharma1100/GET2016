package session7.assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import session3.assignment1.Node;
/**
 * 
 * @author Amit
 *
 */
public class TestBinarySearchTree {

	BinaryTree binaryTree;
	Node node;

	/**
	 * initializes the objects
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
      binaryTree=new BinaryTree();
      node=new Node();
      node.setData(552);
      node.setLeft(null);
      node.setRight(null);
      binaryTree.getBst().insert(552);
	}

	//tests if--
	// the data is successfully inserted into the tree
	//the item to be searched is found or not
	@Test
	public void testBinaryTree() {
		assertEquals(true, binaryTree.getBst().insert(24));
		assertEquals(node.getData(), binaryTree.getBst().search(binaryTree.getBst().getRoot(), 552).getData());
		
	}

}
