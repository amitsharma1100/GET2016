package session6.assignment2;

import java.util.Scanner;

/**
 * 
 * @author Amit
 * 
 */
public class UniqueCharactersImplementor {

	public static void main(String[] args) {

		UniqueCharacters uniqueCharacters = new UniqueCharacters();
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				int choice = 0;
				System.out
						.println("Enter the choice\n1. Enter a string\n2. Exit");
				String temp = scanner.next();
				if (!temp.equalsIgnoreCase("1") && !temp.equalsIgnoreCase("2")) {
					choice = 5;
				} else {
					choice = Integer.parseInt(temp);
				}
				switch (choice) {
				case 1:
					System.out.println("Enter a string ");
					String input = scanner.next();
					int totalChar = uniqueCharacters.uniqueCharacters(input);
					System.out.println("Total unique characters in : " + input+ " are " + totalChar);
					break;
				case 2:
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
