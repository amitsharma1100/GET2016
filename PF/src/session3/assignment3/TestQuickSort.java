package session3.assignment3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestQuickSort {

	QuickSort quicksortObject;
	int[] input;
	int[] output;
	
	@Before
	public void setUp() throws Exception {
		quicksortObject = new QuickSort();
		input= new int[] {2,5,8,9,10, 77, 55, 11 };
		output=new int[] {2,5,8,9,10, 11, 55, 77};
	}

	@Test
	public void testQuickSort() {
		assertEquals(output, quicksortObject.sort(input));
	}

}
