package session2.assignment2;

/**
 * 
 * @author Amit
 *
 * @param <E>
 */
public class Queue<E> {

	private E[] array;
	private int FRONT;
	private int REAR;
	static int sizeOfArray = 10;

	@SuppressWarnings("unchecked")
	public Queue() {
		this.array = (E[]) new Object[Queue.sizeOfArray];
		FRONT = -1;
		REAR = -1;
	}

	public int getFRONT() {
		return FRONT;
	}

	public void setFRONT(int fRONT) {
		FRONT = fRONT;
	}

	public int getREAR() {
		return REAR;
	}

	public void setREAR(int rEAR) {
		REAR = rEAR;
	}

	public static int getSizeOfArray() {
		return sizeOfArray;
	}

	public static void setSizeOfArray(int sizeOfArray) {
		Queue.sizeOfArray = sizeOfArray;
	}

	public int size() {
		int size = 0;
		for (int i = 0; i < sizeOfArray; i++) {
			if (array[i] == null) {
				break;
			} else {
				size++;
			}
		}
		return size;
	}

	private void checkSize() {
		if (size() >= sizeOfArray) {
			copyToNew();
		}
	}

	@SuppressWarnings("unchecked")
	public void copyToNew() {
		int newSize = sizeOfArray + (sizeOfArray / 2);
		E[] temp = array;
		int oldSize = temp.length;
		array = (E[]) new Object[newSize];
		for (int index = 0; index < oldSize; index++) {
			array[index] = temp[index];
		}
		sizeOfArray = newSize;
	}

	public boolean enqueue(E e) {
		int nextIndex = size();
		checkSize();
		if (FRONT == -1) {
			FRONT = 0;
		}
		array[nextIndex] = e;
		REAR += 1;
		return true;
	}

	public E dequeue() {
		E value = null;
		if (FRONT == -1 || FRONT > REAR) {
			FRONT = -1;
			REAR = -1;
			return null;
		} else if (size() == 1) {
			value = array[FRONT];
			FRONT = -1;
			REAR = -1;
		} else {
			value = array[FRONT];
			FRONT += 1;
		}
		return value;

	}

	@SuppressWarnings("unchecked")
	public void makeEmpty() {
		array = (E[]) new Object[10];
		FRONT = -1;
		REAR = -1;
	}

	public Object getFront() {
		return array[FRONT];
	}

	public E getValueByIndex(int index) {
		E value = null;
		if (FRONT >= -1 && FRONT <= REAR) {
			value = array[index];
		}
		return value;
	}
}
