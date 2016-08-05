package session6.assignment1;

import java.util.Comparator;

/**
 * 
 * @author Amit
 * 
 */
@SuppressWarnings("rawtypes")
public class EmployeeSorterName implements Comparator {

	/**
	 * implements sort based on name
	 */
	@Override
	public int compare(Object o1, Object o2) {
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}

}
