package session2.assignment2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		//define the total rows in the pattern
		int rows;
		System.out.println("Enter the no of rows");
		Scanner scanner = new Scanner(System.in);
		rows = scanner.nextInt();
		
		//call the printPattern method to return the required pattern
		String output = new Pattern2().printPattern(rows);
		System.out.println("Pattern:\n" + output);
		
		//close the resources
		scanner.close();
	}

	/*Returns the required pattern based on the number of rows*/
	public String printPattern(int rows) {
		String output = "";
		int loopVariable = 0;
		Pattern2 pattern2 = new Pattern2();
		for (; loopVariable < rows; loopVariable++) {
			output += pattern2.spaces(rows, loopVariable);
			output += pattern2.numbers(rows, loopVariable);
		}
		return output;
	}

	/* Returns the spaces string based on the number of rows and the row number*/
	public String spaces(int rows, int n) {
		String spacesString = "";
		int spacecount = 0;

		spacecount = n;
		int temp2 = 0;
		while (temp2 < spacecount) {
			spacesString += " ";
			temp2++;

		}

		return spacesString;
	}

	/* Returns the numbers string based on the number of rows and the row number*/
	public String numbers(int rows, int n) {
		String numbersString = "";
		int numberInARow = 0;

		numberInARow = rows - n;
		int temp = 0;
		while (temp < numberInARow) {
			numbersString += temp + 1;
			temp++;
		}

		numbersString += "\n";

		return numbersString;
	}

}