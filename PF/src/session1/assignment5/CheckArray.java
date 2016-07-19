package session1.assignment5;

public class CheckArray {

	public static void main(String args[]) {
		int[] array = {1,1,1,1,1 };
		
		//call method to check
		int result = new CheckArray().check(array);
		System.out.println("Result:" + result);

	}

	public int check(int[] input) {
		int status = 3;

		//check if the array is in ascending order
		if (checkAscending(input)) {
			return 1;
		}
		//check if the array is in descending order
		if (checkDescending(input)) {
			return 2;
		}
		//return result
		return status;
	}

	public static boolean checkAscending(int[] input) {
		int inputLength = input.length;
		int loopVariable = 0;
		boolean isAscending = true;
		for (; loopVariable < inputLength - 1; loopVariable++) {
			if (input[loopVariable] > input[loopVariable + 1]) {
				isAscending = false;
				break;
			}
		}
		return isAscending;

	}

	public static boolean checkDescending(int[] input) {
		int inputLength = input.length;
		int loopVariable = 0;
		boolean isDescending = true;
		for (; loopVariable < inputLength - 1; loopVariable++) {
			if (input[loopVariable] < input[loopVariable + 1]) {
				isDescending = false;
				break;
			}
		}
		return isDescending;

	}

}