package session1.assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestBinaryToOctal {
	BinaryToOctal testBinaryToOctal;
	int correctNumber;
	int wrongNumber;
	@Before
	public void setUp() throws Exception{
		testBinaryToOctal = new BinaryToOctal();
		correctNumber = 110101 ;
		wrongNumber=101101;
	}
	@Test
	public void testConvertBinaryToOctal() {
		assertEquals(65, testBinaryToOctal.convertBinaryToOctal(correctNumber));
		assertEquals(65, testBinaryToOctal.convertBinaryToOctal(wrongNumber));
	}

}