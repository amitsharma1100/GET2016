package session2.assignment2;

import java.util.Scanner;

/**
 * 
 * @author Amit
 *
 */
public class QueueImplementor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			Queue<Integer> queue = new Queue<Integer>();
			while (true) {
				System.out.println("***Please choose***");
				System.out.println("1. Enqueue into queue");
				System.out.println("2. Dequeue from queue");
				System.out.println("3. Size of queue");
				System.out.println("4. Exit");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the value to be queue");
					int value = scanner.nextInt();
					queue.enqueue(value);
					break;
				case 2:
					Object temp = queue.dequeue();
					if (temp != null)
						System.out.println("Value dequeued :" + (int) temp);
					else
						System.out.println("can't dequeue from empty queue");
					break;
				case 3:
					System.out.println("Size of stack : " + queue.size());
					break;
				case 4:
					System.exit(-1);
				default:
					break;
				}
			}
		} catch (Exception exception) {
			System.out
					.println("Something went wrong " + exception.getMessage());
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

	}

}
