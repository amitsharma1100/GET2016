package session4.assignment1;

import java.util.Scanner;

/**
 * 
 * @author Amit
 * 
 */
public class PrintHandler {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Heap heap = new Heap();
		try {
			while (true) {
				System.out
						.println("*****Please choose*****\n1. Add a job into queue\n2. Serve \n3. Display the queue\n4. Exit");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the priority\n4. Admin\n3. Professor\n2. Graduate\n1. UnderGraduate");
					int priority = scanner.nextInt();
					heap.insert(priority);
					break;
				case 2:
					int served = heap.delete();
					if (served != -111) {
						System.out.println(served + " is served");
					} else {
						System.out.println("Can't serve");
					}
					break;
				case 3:
					System.out.print("Printing queue---------->");
					heap.display();
					System.out.println();
					break;
				case 4:
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
			if (scanner != null) {
				// scanner.close();
			}

		}

	}
}