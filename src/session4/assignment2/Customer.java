package session4.assignment2;

/**
 * 
 * @author Amit
 *
 */
public class Customer {
	
	private String customerName;
	private int age;
	private String nationality;
	
	//default constructor
	public Customer() {
		
	}
	
	//overloaded constructor
	public Customer(String customerName, int age, String nationality) {
		this.customerName = customerName;
		this.age = age;
		this.nationality = nationality;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	


}
