package session4.assignment2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 
 * @author Amit
 *
 */
public class TestRoomAlloter {
 Hashing hashing;
 Customer customer;
 RoomAlloter roomAlloter;
 int index;
 
	
 /**
  * setup the object creation before the test execution
  * @throws Exception
  */
	@Before
	public void setup() throws Exception
	{
		hashing=new Hashing();
		customer=new Customer();
		roomAlloter=new RoomAlloter();
		customer.setCustomerName("Amit");
		customer.setAge(21);
		customer.setNationality("Indian");
		index=Hashing.myHashCode(customer.getAge());
		
	}
	/**
	 * tests the class against the given inputs
	 */
	@Test
	public void testHash() {
		assertEquals(true,roomAlloter.alloteRoom(index, customer));
		assertEquals(false, roomAlloter.search(65));
		
	}

}
