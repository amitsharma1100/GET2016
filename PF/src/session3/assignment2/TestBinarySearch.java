package session3.assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestBinarySearch {

	BinarySearch binarySearchObject;
	int[] input;
	int output;
	int key;
	
	@Before
	public void setUp() throws Exception {
		binarySearchObject = new BinarySearch();
		input= new int[] {2,5,8,9,10, 55, 77 };
		key=11;
		output=5;
	}

	@Test
	public void testBinarySearch() {
		assertEquals(-1, BinarySearch.binarySearch(input, 0, input.length, 88));
		assertEquals(6, BinarySearch.binarySearch(input, 0, input.length, 77));
	}

}