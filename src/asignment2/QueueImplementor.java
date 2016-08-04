package session5.assignment2;

import java.util.Scanner;

/**
 * 
 * @author Amit
 *
 */
public class QueueImplementor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MyQueue myQueue = new MyQueue();
		try {
			while (true) {
				System.out.println("****Please choose****");
				System.out.println("1. Enqueue");
				System.out.println("2. Dequeue");
				System.out.println("3. Display");
				System.out.println("4. Exit");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the element to be inserted");
					int data = scanner.nextInt();
					myQueue.enqueue(data);
					break;
				case 2:
					int valueDeleted = myQueue.dequeue();
					if (valueDeleted == -111) {
						System.out.println("Can't dequeue from empty queue");
					} else {
						System.out.println(valueDeleted + " removed ");
					}
					break;
				case 3:
					System.out.println("Queue is:");
					myQueue.display();
					break;
				case 4:
					System.exit(-1);
				default:
					System.out.println("Enter a valid choice");
					break;
				}

			}
		} catch (Exception exception) {
			System.out.println("Something went wrong : "+ exception.getMessage());
		} finally {
			scanner.close();
		}

	}

}
