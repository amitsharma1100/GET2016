package session3.assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestGCD {
	GCD gcd = new GCD();

	@Before
	public void setUp() throws Exception {
		gcd = new GCD();

	}

	@Test
	public void testGCD() {
		assertEquals(1, gcd.gcd(2, 1));
		assertEquals(6, gcd.gcd(12, 18));
		assertEquals(1, gcd.gcd(100, 3));
	}

}
