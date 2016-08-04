package session5.assignment1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Amit
 *
 */
public class TestConcordance {

	MyMap myMap;
	MyMap myMap2;
	Map<Character, List<Integer>> actualMap;
	List<Integer> list1;
	List<Integer> list2;
	List<Integer> list3;
	List<Integer> list4;

	@Before
	public void setUp() throws Exception {

		myMap = new MyMap();
		myMap2 = new MyMap();
		
		myMap2.process("HELLO");
		actualMap=myMap2.getConcordanceMap(); 
		
		list1 = new ArrayList<Integer>();
		list2 = new ArrayList<Integer>();
		list3 = new ArrayList<Integer>();
		list4 = new ArrayList<Integer>();

		list1.add(0);
		list2.add(1);
		list3.add(2);
		list3.add(3);
		list4.add(4);

		myMap.getConcordanceMap().put('H', list1);
		myMap.getConcordanceMap().put('E', list2);
		myMap.getConcordanceMap().put('L', list3);
		myMap.getConcordanceMap().put('O', list4);
		
	}

	@Test
	public void testConcordance() {
		assertEquals(myMap.getConcordanceMap(),actualMap );
	}

}
