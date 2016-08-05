package session6.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author Amit
 *
 */
public class TestUniqueCharacters {

	@Test
	public void testUniqueCharacter() {
		assertEquals(4,new UniqueCharacters().uniqueCharacters("Hello"));
		assertEquals(11,new UniqueCharacters().uniqueCharacters("We Shall Overcome"));
	}

}
