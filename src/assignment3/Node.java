package session5.assignment3;

/**
 * 
 * @author Amit
 *
 */
public class Node {

	private int data;
	 private Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public Node() {

	}

	public Node(int data, Node address) {
		this.data = data;
		this.next = address;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}