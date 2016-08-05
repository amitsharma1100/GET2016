package session6.assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * 
 * @author Amit
 *
 */
public class TestNaturalSorter {
	List<Employee> empList;
	List<Employee> expected;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 empList= new ArrayList<Employee>();
         expected=new ArrayList<Employee>();
         
		Employee emp1 = new Employee(141, "Amit Sharma", "Jaipur");
		Employee emp2 = new Employee(162, "Avinash Chopra", "Bikaner");
		Employee emp3 = new Employee(541, "Ritesh Naik", "Lucknow");
		Employee emp4 = new Employee(137, "Vaibhavi Khanna", "Chandigarh");
		Employee emp5 = new Employee(937, "Minisha Rai", "Delhi");

		Employee emp6 = new Employee(141, "Amit Sharma", "Jaipur");
		Employee emp7 = new Employee(162, "Avinash Chopra", "Bikaner");
		Employee emp10 = new Employee(937,"Minisha Rai", "Delhi");
		Employee emp8 = new Employee(541, "Ritesh Naik", "Lucknow");
		Employee emp9 = new Employee(137, "Vaibhavi Khanna", "Chandigarh");
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		expected.add(emp6);
		expected.add(emp7);
		expected.add(emp10);
		expected.add(emp8);
		expected.add(emp9);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void test() {
		Collections.sort(empList, new EmployeeSorterName());
		assertEquals(expected,empList );
	}

}
