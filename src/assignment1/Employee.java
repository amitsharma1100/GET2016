package session6.assignment1;

/**
 * 
 * @author Amit
 *This class implements the comparable interface for
 *implementing  natural sorting  
 */
@SuppressWarnings("rawtypes")
public class Employee implements Comparable {

	private int empId;
	private String empName;
	private String empAddress;

	public Employee() {

	}

	public Employee(int empId, String empName, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	/**
	 * Compares the employee on the basis of name for natural sorting
	 */
	@Override
	public int compareTo(Object o) {
		return this.getEmpName().compareTo(((Employee) o).getEmpName());
	}
	/**
	 * This is overRidden Method
	 * Displays all the attributes of the object 
	 */
	 @Override
	    public String toString() {
	        return "EmpId : "+this.getEmpId()+" EmpName : "+this.getEmpName()+" EmpAddress : "+this.getEmpAddress();
	    }
}
