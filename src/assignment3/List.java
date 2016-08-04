package session5.assignment3;

/**
 * 
 * @author Amit
 *
 */
public class List {

	Node head;

	/**
	 * 
	 * @param data
	 * inserts data into the list
	 */
	public void insert(int data) {

		if (head != null) {
			if (head.getData() > data) {
				head = new Node(data, head);
			} else {
				head = insert(head, data);
			}
		}
		// add first element in linked list
		else {
			head = insert(head, data);
		}
	}

	/**
	 * 
	 * @param node--a node of link list
	 * @param data--data to be insert
	 * @return return node address
	 */
	public Node insert(Node node, int data) {
		if (node == null) {
			Node temp = new Node(data);
			return temp;
		} else {
			if (node.getData() > data && node == head) {
				if (node.getNext() != null) {
					node.setNext(new Node(data, node.getNext()));
					return node;
				}
			}
			if (node.getNext() != null) {
				if (node.getNext().getData() > data) {
					node.setNext(new Node(data, node.getNext()));
					return node;
				}
			}
			node.setNext(insert(node.getNext(), data));
			return node;
		}

	}

	/**
	 * 
	 * @param node--a node of link list
	 */
	public void showList(Node node) {
		
		if (node == null) {
			return;
		} else {
			System.out.print(node.getData() + " ");
			showList(node.getNext());
		}
	}

	/**
	 * show link list
	 */
	public void showList() {
		showList(head);
	}
}