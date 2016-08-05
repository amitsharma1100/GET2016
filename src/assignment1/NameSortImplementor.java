package session6.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Amit
 * 
 */
public class NameSortImplementor {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		Employee emp1 = new Employee(141, "Amit Sharma", "Jaipur");
		Employee emp2 = new Employee(162, "Avinash Chopra", "Bikaner");
		Employee emp3 = new Employee(541, "Ritesh Naik", "Lucknow");
		Employee emp4 = new Employee(137, "Vaibhavi Khanna", "Chandigarh");
		Employee emp5 = new Employee(937, "Minisha Rai", "Delhi");

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		Collections.sort(empList, new EmployeeSorterName());
		System.out.println("Sorting based on name");
		for (Employee employee1 : empList) {
			System.out.println(employee1.toString());
		}
	}

}
