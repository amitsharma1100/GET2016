package session8.assignment2;
/**
 * 
 * @author Amit
 *
 */
public class BubbleSort {

	/**
	 * returns the output in sorted form
	 * @param inputArray--the array to be sorted
	 * @return
	 */
	public int[] bubbleSort(int[] inputArray) {
		int indexOfLastUnsortedElement = inputArray.length - 1;
		boolean swapped = false;
		do {
			swapped = false;
			for (int index = 0; index < indexOfLastUnsortedElement; index++) {
				if (inputArray[index] > inputArray[index + 1]) {
					int temp = inputArray[index];
					inputArray[index] = inputArray[index + 1];
					inputArray[index + 1] = temp;
					swapped = true;
				}
			}
			indexOfLastUnsortedElement--;
		} while (swapped);
		return inputArray;
	}
}
