package session8.assignment2;
/**
 * 
 * @author Amit
 *
 */
public class CountingSort {

	/**
	 * returns the sorted output 
	 * @param inputArray--the array to be sorted
	 * @return
	 */
	public int[] countSort(int[] inputArray) {
		int inputLength = inputArray.length;
		int[] outputArray = new int[inputLength];

		int max = inputArray[0];
		int indexForIndicesArray = 0;
		for (int value : inputArray) {
			if (value > max) {
				max = value;
			}
		}
		int indicesMatrix[] = new int[max + 1];
		for (int value : inputArray) {
			indicesMatrix[value]++;
		}

		int outputLength = max + 1;
		for (int index = 0; index < outputLength; index++) {
			int totalRepetitions = indicesMatrix[index];
			while (totalRepetitions > 0) {
				outputArray[indexForIndicesArray++] = index;
				totalRepetitions--;
			}
		}
		return outputArray;
	}
}
