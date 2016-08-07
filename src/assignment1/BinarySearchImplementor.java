package session7.assignment1;

import java.util.Scanner;
/**
 * 
 * @author Amit
 *
 */
public class BinarySearchImplementor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinaryTree binaryTree = new BinaryTree();
		try {
			while (true) {
				System.out.println("*****Please Choose*****");
				System.out.println("1. Insert ");
				System.out.println("2. Search");
				System.out.println("3. Exit ");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					//to insert an item 
					System.out.print("Enter the number to be inserted ");
					int value = scanner.nextInt();
					if (binaryTree.getBst().insert(value)) {
						System.out.println("Successfully inserted");
					}
					break;
				case 2:
					// to search an item 
					System.out.println("Enter the item to be searched");
					int key = scanner.nextInt();
					Node node = binaryTree.getBst().search(
							binaryTree.getBst().getRoot(), key);
					if (node != null && node.getData() == key) {
						System.out.println("Item found " + node.getData());
					} else {
						System.out.println("Not found");
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
