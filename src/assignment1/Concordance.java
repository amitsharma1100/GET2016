package session5.assignment1;

/**
 * @author Amit
 * This class creates the objects of other classes 
 * and calls appropriate methods
 */
import java.util.Scanner;

public class Concordance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MyMap map = new MyMap();
		try {
			Display display = new Display();
			System.out.println("Enter the string");
			String input = scanner.nextLine();
			map.process(input);
			display.display(map);
		} catch (Exception exception) {
			System.out.println("Something went wrong : "+ exception.getMessage());
		} finally {
			scanner.close();
		}
	}

}
