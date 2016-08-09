package session8.assignment2;

import session2.assignment2.Queue;

/**
 * 
 * @author Amit
 *
 */
public class RadixSort {

	// an array to hold the queues for each index
	private Queue<Integer>[] arrayOfQueues;
	private int totalPasses;
	private int[] tempArray;

	public RadixSort() {
		arrayOfQueues = new Queue[10];
		for (int index = 0; index < 10; index++) {
			arrayOfQueues[index] = new Queue<Integer>();
		}
	}

	public Queue<Integer>[] getArrayOfQueues() {
		return arrayOfQueues;
	}

	public void setArrayOfQueues(Queue<Integer>[] arrayOfQueues) {
		this.arrayOfQueues = arrayOfQueues;
	}

	/**
	 * takes the input array in unsorted form and returns the sorted
	 * @param inputArray
	 * @return
	 */
	public int[] sort(int[] inputArray) {

		this.tempArray = inputArray;

		int max = 0;
		for (int value : inputArray) {
			if (max < value) {
				max = value;
			}
		}
		this.totalPasses = (max + "").length();
		for (int passNo = 1; passNo <= this.totalPasses; passNo++) {
			radixSort(passNo);
		}

		return tempArray;
	}

	/**
	 * 
	 * @param pass
	 *            -denotes the pass number currently executing
	 */
	public void radixSort(int pass) {
		resetAllQueues();
		int pos = 0;
		for (int value : tempArray) {
			if (pass > (value + "").length()) {
				pos = 0;
			} else {
				pos = Integer.parseInt((value + "").charAt(pass - 1) + "");
			}
			arrayOfQueues[pos].enqueue(value);
		}
		int tempArrayIndex = 0;
		for (int index = 0; index < 10; index++) {
			Queue<Integer> queue = arrayOfQueues[index];
			if (queue != null) {
				int queueSize = queue.size();
				int index2 = 0;
				while (index2 < queueSize) {
					tempArray[tempArrayIndex++] = (Integer) queue.dequeue();
					index2++;
				}
			} else {
				System.out.println("Null is received");
			}
		}
	}

	/**
	 * clears all the queues and resets them similiar to start
	 */
	public void resetAllQueues() {
		arrayOfQueues = new Queue[10];
		for (int index = 0; index < 10; index++) {
			arrayOfQueues[index] = new Queue<Integer>();
		}
	}
}
