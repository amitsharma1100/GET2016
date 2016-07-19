package session3.assignment3;

import java.util.Arrays;

class QuickSort {
	private int input[];
	private int length;

	public static void main(String args[]) {
		int[] unsorted = { 9, 8, 17, 6, 5, 11, 3, 2, 1 };
		System.out.println("Unsorted array :" + Arrays.toString(unsorted));
		QuickSort algorithm = new QuickSort();
		int arr[]=algorithm.sort(unsorted);
		System.out.println("Sorted array :" + Arrays.toString(arr));
	}
/*check input validations*/
	int[] sort(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return input;
		}
		this.input = numbers;
		length = numbers.length;
		quickSort(0, length - 1);
		return input;
	}
	
/*sorts the array */
	private void quickSort(int low, int high) {
		int i = low;
		int j = high;
		int pivot = input[low + (high - low) / 2];
		// Divide into two arrays
		while (i <= j) {
			while (input[i] < pivot) {
				i++;
			}
			while (input[j] > pivot) {
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

	/*swap two numbers*/
	private void swap(int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}
