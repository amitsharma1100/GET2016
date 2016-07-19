package session3.assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRecursiveLinearSearch {

	RecursiveLinearSearch recursiveLinearSearch;
	int[] input;
	
	@Before
	public void setUp() throws Exception {
		recursiveLinearSearch = new RecursiveLinearSearch();
		input= new int[] {2,5,8,9,10, 77, 55};
			}

	@Test
	public void testRecursiveLinearSearch() {
		assertEquals(false, recursiveLinearSearch.search(input,88));
		assertEquals(true, recursiveLinearSearch.search(input,77));
	}

}
