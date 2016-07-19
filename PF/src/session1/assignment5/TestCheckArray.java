package session1.assignment5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCheckArray {
	CheckArray sampleClass;
	int[] array1;
	int[] array2;
	int[] array3;

	@Before
	public void setUp() throws Exception {
		sampleClass = new CheckArray();
		array1 = new int[]{1,2,3,4,5,6,7,8,9};
		array2 = new int[]{9,8,7,6,5,4,3,2,1};
		array3 = new int[]{16,7,34,8,9};
	}

	@Test
	public void testSorted() {
		assertEquals(1, sampleClass.check(array1));
		assertEquals(2, sampleClass.check(array2));
		assertEquals(3, sampleClass.check(array3));
		assertEquals(3, sampleClass.check(array2));
	}

}