package session1.assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestRemoveDuplicates {
	RemoveDuplicates sampleObject;
	int input[] ;
	@Before
	public void setUp() throws Exception {
		input = new int[] {2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		sampleObject = new RemoveDuplicates();
	}

	@Test
	public void testRemoveDuplicate() {
		assertArrayEquals(new int[] {2,5,4,6,3,8,9,0}, sampleObject.removeDuplicate(input));
	}

}