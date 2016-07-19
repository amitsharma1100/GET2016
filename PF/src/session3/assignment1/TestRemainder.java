package session3.assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRemainder {
	Remainder remainder;

	@Before
	public void setUp() throws Exception {
		remainder = new Remainder();

	}

	@Test
	public void testLargestDigit() {
		assertEquals(0, remainder.rem(2, 1));
		assertEquals(-1, remainder.rem(2,0));
		assertEquals(1, remainder.rem(100,3));
	}

}