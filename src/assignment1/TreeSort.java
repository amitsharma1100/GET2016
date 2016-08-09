package session8.assignment1;

import java.util.Scanner;

/**
 * 
 * @author Amit
 *
 */
public class TreeSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BST bst = new BST();
		try {
			while (true) {
				System.out.println("\n*****Please choose*****\n\n1. Enter the student roll numbers\n2. Sort the roll numbers\n3. Exit");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the element to be inserted");
					int data = scanner.nextInt();
					if (bst.insert(data)) {
						System.out.println("Successfully inserted");
					} else {
						System.out.println("Can't insert ");
					}
					break;
				case 2:
					if (bst.getRoot() == null) {
						System.out.println("Can't sort empty tree");
					} else {
						System.out.println("The sorted order is :");
						bst.inOrder(bst.getRoot());
					}
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
