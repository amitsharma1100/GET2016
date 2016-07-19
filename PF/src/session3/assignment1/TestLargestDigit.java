package session3.assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLargestDigit {
	LargestDigit largestDigit;

	@Before
	public void setUp() throws Exception {
	largestDigit = new LargestDigit();
	
	}

	@Test
	public void testLargestDigit() {
		assertEquals(2, largestDigit.largestdigit(2));
		assertEquals(9, largestDigit.largestdigit(1257369));
		assertEquals(4, largestDigit.largestdigit(444));
			}

}
