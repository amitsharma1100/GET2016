package session8.assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Amit
 *
 */
public class TestTreeSort {

	//references 
	BST bst;
	Node node;

	/**
	 * setUp method for object initialization
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		bst=new BST();
		node=new Node();
		
		node.setData(34);
		bst.insert(6);
		bst.insert(34);
	}

	/**
	 * checks the tree
	 */
	@Test
	public void testTreeSort() {
		assertEquals(true,bst.insert(54));
		assertEquals(node.getData(), bst.search(bst.getRoot(), 34).getData());
	}

}
