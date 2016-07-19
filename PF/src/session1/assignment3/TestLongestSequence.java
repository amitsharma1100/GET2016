 package session1.assignment3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestLongestSequence {
	LongestSequence sampleClass;
	int input[];
	@Before
	public void setUp() throws Exception {
		sampleClass = new LongestSequence();
		input = new int[] {2,5,4,7,5,3,7,8,9,5,3,7};
	}

	@Test
	public void testLonestSequence() {
		assertArrayEquals(new int[]{3,7,8,9},sampleClass.longestSequence(input));
	}

}