package session5.assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Amit
 *
 */
public class TestQueueImplementor {

	MyQueue myQueue;
	
	@Before
	public void setUp() throws Exception
	{
		myQueue=new MyQueue();
	}
	
	@Test
	public void testMyQueue() {
	assertEquals(true, myQueue.enqueue(25));
	assertEquals(true, myQueue.enqueue(43));
	assertEquals(25, myQueue.dequeue());
	}

}
