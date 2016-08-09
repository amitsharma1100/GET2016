package session8.assignment2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Amit
 *
 */
public class TestSorter {
	
	// create references of all the sorts
	BubbleSort bubbleSort;
	CountingSort countingSort;
	QuickSort quickSort;
	RadixSort radixSort;
	
	// expected arrays for all the 4 sorts
	int[] expected1;
	int[] expected2;
	int[] expected3;
	int[] expected4;

	/**
	 *  initializes the objects and creates the expected arrays
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		bubbleSort = new BubbleSort();
		countingSort = new CountingSort();
		quickSort = new QuickSort();
		radixSort = new RadixSort();
		expected1=new int[]{1,2,2,8,9,14,19,334,580};
		expected2=new int[]{1,2,2,8,9,14,19,334,580};
		expected3=new int[]{1,2,2,8,9,14,19,334,580};
		expected4=new int[]{1,2,2,8,9,14,19,334,580};
		
	}

	/**
	 * tests all the four sorts
	 */
	@Test
	public void testSorter() {
		assertArrayEquals(expected1, bubbleSort.bubbleSort(new int[]{8,9,2,334,580,19,14,2,1}));
		assertArrayEquals(expected2, countingSort.countSort(new int[]{580,19,8,9,2,334,14,2,1}));
		assertArrayEquals(expected3, quickSort.sort(new int[]{580,19,8,14,9,2,334,2,1}));
		assertArrayEquals(expected4, radixSort.sort(new int[]{1,19,8,14,9,2,334,2,580}));
	}

}
