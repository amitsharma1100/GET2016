package session6.assignment1;

import java.util.Scanner;

/**
 * 
 * @author Amit
 * 
 */
public class UniqueEmployeeImplementor {

	public static void main(String[] args) {
		UniqueEmployees uniqueEmployees = new UniqueEmployees();
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("****Please choose****");
				System.out.println("1. Create an employee");
				System.out.println("2. Display All Employees");
				System.out.println("3. Exit");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					boolean toContinue = true;
					int empId = 0;
					String input = "";
					while (toContinue) {
						System.out.println("Enter the employee ID");
						input = scanner.next();
						if (!UniqueEmployeeImplementor.validateInput(input)) {
							System.out.println("Enter a valid id number");
						} else {
							empId = Integer.parseInt(input);
							toContinue = false;
						}
					}
					System.out.println("Enter the employee name");
					String empName = scanner.next();
					System.out.println("Enter the employee address");
					String empAddress = scanner.next();
					Employee employee = new Employee(empId, empName, empAddress);
					if (uniqueEmployees.insert(employee)) {
						System.out.println("Successfully inserted");
					} else {
						System.out.println("Duplicate can't be inserted");
					}
					break;
				case 2:
					uniqueEmployees.display();
					break;
				case 3:
					System.exit(-1);
				default:
					System.out.println("Enter a valid choice");
					break;
				}
			}
		} catch (Exception exception) {
			System.out.println("Something went wrong : "
					+ exception.getMessage());
		} finally {
			scanner.close();
		}
	}

	/**
	 * validates if the input is valid
	 * 
	 * @param input
	 * @return
	 */
	public static boolean validateInput(String input) {
		int totalChar = input.length();
		for (int index = 0; index < totalChar; index++) {
			if (input.codePointAt(index) < "0".codePointAt(0)
					|| input.codePointAt(index) > "9".codePointAt(0)) {
				return false;
			}
		}
		return true;
	}

}
