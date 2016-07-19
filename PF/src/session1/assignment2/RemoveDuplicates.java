package session1.assignment2;

import java.util.Scanner;

public class RemoveDuplicates {
	static int[] inputArray;

	public static void main(String[] args) {
		//take user input for total Numbers
		System.out.println("Enter the numbers you want to enter");
		Scanner scanner = new Scanner(System.in);
		int totalNoOfInputs = scanner.nextInt();
		inputArray = new int[totalNoOfInputs];
		
		//take the numbers of the input
		System.out.println("Enter the " + totalNoOfInputs + " numbers");
		for (int indexOfArray = 0; indexOfArray < totalNoOfInputs; indexOfArray++) {
			inputArray[indexOfArray] = scanner.nextInt();
		}

		//call method for removing duplicates
		int arr[]=new RemoveDuplicates().removeDuplicate(inputArray);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		scanner.close();

	}

	public int[] removeDuplicate(int input[]) {

		String output = "";//used to store temporary output
		int outputArray[];//used to store the output
		for (int index = 0; index < input.length; index++) {
			int stringLength = output.length();
			boolean found = false;

			for (int indexForOutputString = 0; indexForOutputString < stringLength; indexForOutputString++) {
				if (input[index] == Integer.parseInt(output
						.charAt(indexForOutputString) + "")) {
					found = true;
				}
			}
			if (!found) {
				output += input[index];
			}
		}
		outputArray = new int[output.length()];
		int length = output.length();
		for (int loopVariable = 0; loopVariable < length; loopVariable++) {
			outputArray[loopVariable] = Integer.parseInt(output
					.charAt(loopVariable) + "");
		}
		
		return outputArray;

	}

}