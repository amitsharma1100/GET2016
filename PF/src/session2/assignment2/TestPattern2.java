package session2.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class TestPattern2 {

	Pattern2 pattern2;

	

	@Before
	public void setUp() throws Exception {
		pattern2=new Pattern2();
	}

	@Test
	public void test() {
		assertEquals("",pattern2.spaces(5,0));
		assertEquals("     ",pattern2.spaces(5,3));
		assertEquals("12345\n",pattern2.numbers(5,0));
		assertEquals("12\n",pattern2.numbers(5,0));
		
	}

}