package session4.assignment1;

/**
 * 
 * @author Amit
 *
 */
public class Heap {

	private static int[] heap;
	private int heapSize;
	private int nextIndex;

	public Heap() {
		this.heapSize = 10;
		Heap.heap = new int[heapSize];
		this.nextIndex = 0;
	}

	public int getHeapSize() {
		return heapSize;
	}

	public void setHeapSize(int heapSize) {
		this.heapSize = heapSize;
	}

	/**
	 * inserts a new element at the end of the array
	 * @param data-the data to be inserted
	 */
	public boolean insert(int data) {
		Heap.heap[nextIndex] = data;
		this.nextIndex++;
		if (this.nextIndex >= this.getHeapSize()) {
			increaseSize();
		}
		for (int index = nextIndex / 2; index >= 0; index--) {
			heapify(index);
		}
		return true;
	}

	/**
	 * builds a max heap
	 * swaps the parent with the left or right child(whichever is greater)
	 * @param indexOfNonLeafNode-denotes the index of the parent which is to be heapified
	 */
	public void heapify(int indexOfNonLeafNode) {
		int left = indexOfNonLeafNode * 2 + 1;
		int right = indexOfNonLeafNode * 2 + 2;
		int largest = indexOfNonLeafNode;
		if (Heap.heap[indexOfNonLeafNode] < Heap.heap[left]) {
			if (Heap.heap[left] > Heap.heap[right]) {
				largest = left;
			} else {
				largest = right;
			}
		} else if (Heap.heap[indexOfNonLeafNode] > Heap.heap[right]) {
			largest = indexOfNonLeafNode;
		} else {
			largest = right;
		}
		if (largest != indexOfNonLeafNode) {
			swap(indexOfNonLeafNode, largest);
		}
	}

	/**
	 * if the array is about to be exhausted then this increases the size by a factor of 3/2
	 */
	public void increaseSize() {
		int oldHeapSize = this.getHeapSize();
		this.setHeapSize((3 * this.getHeapSize()) / 2);
		int temp[] = new int[this.getHeapSize()];
		for (int index = 0; index < oldHeapSize; index++) {
			temp[index] = Heap.heap[index];
		}
		Heap.heap = temp;
	}

	/**
	 * swaps the two index values
	 * @param index1-index of the first number
	 * @param index2-index of the second number
	 */
	public void swap(int index1, int index2) {
		int temp = Heap.heap[index1];
		Heap.heap[index1] = Heap.heap[index2];
		Heap.heap[index2] = temp;
	}

	/**
	 * displays the queue at a given time
	 */
	public void display() {
		for (int index = 0; index < nextIndex; index++) {
			System.out.print(Heap.heap[index] + "  ");
		}
	}

	/**
	 * deletes the max number from the heap
	 * @return -the max fom the heap
	 */
	public int delete() {
		int deleted = -111;
		if (nextIndex > 0) {
			deleted = Heap.heap[0];
			Heap.heap[0] = Heap.heap[nextIndex - 1];
			nextIndex -= 1;
			for (int index = nextIndex / 2; index >= 0; index--) {
				heapify(index);
			}
		}
		return deleted;
	}

}
