package session8.assignment2;

/**
 * 
 * @author Amit
 *
 */
public class QuickSort {

	// holds the output
	private int[] output;

	/**
	 * returns the sorted array
	 * 
	 * @param numbers
	 * @return
	 */
	int[] sort(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return null;
		}
		this.output = numbers;
		int length = numbers.length;
		quickSort(0, length - 1);
		return output;
	}

	/**
	 * sorts the array
	 * 
	 * @param low
	 *            --denotes the lower index
	 * @param high
	 *            --denotes the higher index
	 */
	private void quickSort(int low, int high) {
		int i = low;
		int j = high;
		int pivot = output[low + (high - low) / 2];
		// Divide into two arrays
		while (i <= j) {
			while (output[i] < pivot) {
				i++;
			}
			while (output[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(low, j);
		}
		if (i < high) {
			quickSort(i, high);
		}
	}

	/**
	 * swap two numbers
	 * 
	 * @param i
	 * @param j
	 */
	private void swap(int i, int j) {
		int temp = output[i];
		output[i] = output[j];
		output[j] = temp;
	}
}
