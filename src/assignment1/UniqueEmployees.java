package session6.assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Amit
 * 
 */
public class UniqueEmployees {

	// list to hold the employees
	private static List<Employee> empList;

	public UniqueEmployees() {
		UniqueEmployees.empList = new ArrayList<Employee>();
	}

	/**
	 * inserts a unique employee based on employee Id
	 * 
	 * @param employee
	 *            --employee to be inserted
	 * @return true if the employee is successfully inserted else returns false
	 */
	public boolean insert(Employee employee) {
		boolean status = false;
		if (!UniqueEmployees.myConatins(employee)) {
			empList.add(employee);
			status = true;
		}
		return status;
	}

	/**
	 * displays the employee in the list
	 */
	public void display() {
		int totalEmployees = empList.size();
		if (totalEmployees == 0) {
			System.out.println("Nothing to show");
		} else {
			for (Employee employee : empList) {
				System.out.println(employee.toString());
			}
		}
	}

	/**
	 * checks if the employee to be inserted is already present in the list
	 * 
	 * @param employee
	 * @return
	 */
	public static boolean myConatins(Employee employee) {
		boolean status = false;
		for (Employee employee2 : empList) {
			if (employee2.getEmpId() == employee.getEmpId()) {
				status = true;
				break;
			}
		}
		return status;
	}
}
