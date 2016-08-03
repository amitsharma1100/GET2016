package session4.assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Amit
 *
 */
public class TestPrintHandler {

	Heap heap;
	
	 /**
	  * setup the object creation before the test execution
	  * @throws Exception
	  */
	@Before
	public void setup() throws Exception
	{
		heap=new Heap();
	}
	
	/**
	 * tests the class against the given inputs
	 */
	@Test
	public void test() {
		assertEquals(true,heap.insert(4));
		assertEquals(4, heap.delete());
	}

}
