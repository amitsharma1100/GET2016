package session4.assignment2;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
/**
 * @author Avinash Chopra
 * @Date 18 july 2016 
 */

public class TestStringPermutation {

	StringPermutation stringPermutation;
	List<String> inputList ;
	List<String> outputList ;
	

	
	@Before
	public void setUp() throws Exception {
		stringPermutation = new StringPermutation();
		inputList = new ArrayList<String>();
		outputList = new ArrayList<String>();                              
		outputList.add("ABC");
		outputList.add("ACB");
		outputList.add("BAC");
		outputList.add("BCA");
		outputList.add("CBA");
		outputList.add("CAB");
		
		
	}

	@Test
	public void testGetPermutations() {
		//stringPermutation.getPermutations("ABC", output);
		assertEquals(outputList, stringPermutation.getPermutations("ABC", inputList));
		
	}

}