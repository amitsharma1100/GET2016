package session2.assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestPattern1 {
	
	Pattern1 pattern1;

	

	@Before
	public void setUp() throws Exception {
		pattern1=new Pattern1();
	}

	@Test
	public void test() {
		assertEquals("       ",pattern1.spaces(5,6));
		assertEquals("       ",pattern1.spaces(5,3));
		assertEquals("1\n",pattern1.numbers(5,0));
		assertEquals("12321\n",pattern1.numbers(5,0));
		
	}

}