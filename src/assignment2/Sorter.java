package session8.assignment2;

import java.util.Scanner;
/**
 * 
 * @author Amit
 *
 */
public class Sorter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input;
		int totalElements = 0;
		String userInput = "";
		boolean check = true;
		try {
			while (check) {
				System.out.println("Please enter the total number of elements");
				userInput = scanner.next();
				if (Sorter.isInputValid(userInput, 1)) {
					check = false;
				} else {
					System.out.println("Enter a valid input");
				}
			}
			totalElements = Integer.parseInt(userInput);
			input = new int[totalElements];
			for (int index = 0; index < totalElements; index++) {
				check=true;
				while(check){
					System.out.println("Enter the " + (index + 1) + " elememt");
					userInput = scanner.next();
					if (Sorter.isInputValid(userInput, 1)) {
						check = false;
					} else {
						System.out.println("Enter only integers");
					}
				}
				
				input[index] = Integer.parseInt(userInput);
			}
			check=true;
			while(check){
				System.out.println("Please choose the type of sort to be used\n1. Comparison sorting\n2. Linear Sorting");
				userInput = scanner.next();
				if (Sorter.isInputValid(userInput, 2)) {
					check = false;
				} else {
					System.out.println("Choose only 1 or 2");
				}
			}
			int choiceForSort = Integer.parseInt(userInput);
			int sortingToBeUsed = 0;
			int output[];
			if (choiceForSort == 1) {
				if (totalElements >= 10) {
					sortingToBeUsed = 1;
				} else {
					sortingToBeUsed = 2;
				}
			} else {
				if (Sorter.isRadixToBeUsed(input)) {
					sortingToBeUsed = 4;
				} else {
					sortingToBeUsed = 3;
				}
			}

			switch (sortingToBeUsed) {
			case 1:
				QuickSort quickSort = new QuickSort();
				output = quickSort.sort(input);
				Sorter.display(output);
				break;
			case 2:
				BubbleSort bubbleSort = new BubbleSort();
				output = bubbleSort.bubbleSort(input);
				Sorter.display(output);
				break;
			case 3:
				CountingSort countingSort = new CountingSort();
				output = countingSort.countSort(input);
				Sorter.display(output);
				break;
			case 4:
				RadixSort radixSort = new RadixSort();
				output = radixSort.sort(input);
				Sorter.display(output);
				break;
			}
		} catch (Exception exception) {
			System.out.println("Something went wrong "+ exception.getLocalizedMessage());
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

	}

	/**
	 * returns true if the input array contains any element of 3 or more digits
	 * @param input
	 * @return
	 */
	public static boolean isRadixToBeUsed(int[] input) {
		boolean status=false;
		for (int value : input) {
			if ((value + "").length() > 2) {
				status=true;
				break;
			}
		}
		return status;
	}

	/**
	 * displays the array passed as an argument
	 * @param array
	 */
	public static void display(int[] array) {
		for (int value : array) {
			System.out.print(value + "  ");
		}
	}

	/**
	 * returns true if the input entered by the user is valid or not
	 * @param input
	 * @param validationFor
	 * @return
	 */
	public static boolean isInputValid(String input, int validationFor) {
		boolean status = true;
		int totalCharacters = input.length();
		if (totalCharacters == 0) {
			status = false;
		}
		 else if (validationFor == 1) {
			for (int index = 0; index < totalCharacters; index++) {
				if (input.codePointAt(index) < "1".codePointAt(0)
						|| input.codePointAt(index) > "9".codePointAt(0)) {
					status = false;
					break;
				}
			}
		} else if (validationFor == 2) {
			if (!input.equalsIgnoreCase("1") && !input.equalsIgnoreCase("2")) {
				status = false;
			}
		}
		return status;

	}

}
