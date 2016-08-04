package session5.assignment3;

import java.util.Scanner;

/**
 * 
 * @author Amit
 */
public class SortedLinkList {

	/**
	 * This method give integer value if input is give wrong then again it run
	 * till a correct input is not given
	 * 
	 * @return //user input value
	 */
	

	public static void main(String[] args) {

		List list = new List();
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("1. Insert ");
				System.out.println("2. Display ");
				System.out.println("3. Exit ");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter the number to be inserted ");
					int value = scanner.nextInt();
					list.insert(value);
					break;
				case 2:
					System.out.print("Displaying List: ");
					list.showList();
					System.out.println();
					break;
				case 3:
					System.exit(-1);
				default:
					System.out.println("Enter a valid choice");
					break;
				}
			}
		} catch (Exception exception) {
			System.out.println("Something went wrong : "+ exception.getMessage());
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}