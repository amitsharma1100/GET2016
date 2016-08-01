package session2.assignment1;

/**
 * 
 * @author Amit
 *
 * @param <E>
 */
class LinkedList<E> {
	protected Node start;
	protected Node end;

	public Node getStart() {
		return start;
	}

	public void setStart(Node start) {
		this.start = start;
	}

	public Node getEnd() {
		return end;
	}

	public void setEnd(Node end) {
		this.end = end;
	}

	public int size;

	public LinkedList() {
		start = null;
		end = null;
		size = 0;
	}

	/**
	 * checks if the list is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return start == null;
	}

	/**
	 * returns the size of the list
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * inserts an element at begining
	 * 
	 * @param value
	 */
	public void insertAtStart(E value) {
		Node nptr = new Node(value, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			nptr.setLink(start);
			start = nptr;
		}
	}

	/**
	 * inserts a value at the end of the list
	 * 
	 * @param val
	 */
	public void insertAtEnd(E val) {
		@SuppressWarnings("unchecked")
		Node nptr = new Node(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			end.setLink(nptr);
			end = nptr;
		}
	}

	/**
	 * inserts the value at a particular index
	 * 
	 * @param val
	 * @param pos
	 */
	public void insertAtPos(E val, int pos) {
		Node nptr = new Node(val, null);
		Node ptr = start;
		pos = pos - 1;
		if (pos > size) {
			return;
		}
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				Node tmp = ptr.getLink();
				ptr.setLink(nptr);
				nptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size++;
	}

	/**
	 * searches at a particular index for the node and returns the node if found
	 * else returns null
	 * 
	 * @param pos
	 * @return
	 */
	public E searchAtIndex(int pos) {
		Node ptr = start;
		pos = pos - 1;
		E value = null;
		if (pos > size) {
			return value;
		}
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				value = (E) ptr.getData();
				break;
			}
			ptr = ptr.getLink();
		}
		return value;

	}

	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.getLink();
			current.setLink(prev);
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	/**
	 * deletes the node containing the data value equal to the parameter 'E
	 * value'
	 * 
	 * @param value
	 * @return
	 */
	public boolean deleteOnValue(E value) {
		boolean status = false;
		Node current = start;
		Node previous = start;
		for (int i = 1; i < size; i++) {
			current = previous.getLink();
			if (current.data.equals(value)) {
				previous.setLink(current.getLink());
				current.setLink(null);
				status = true;
				break;
			}
			previous = previous.getLink();
		}
		return status;
	}

	/**
	 * deletes the node from a particular position
	 * 
	 * @param pos
	 * @return
	 */
	public E deleteAtPos(int pos) {
		if (pos == 1 && start != null) {
			E value = (E) start.getData();
			start = start.getLink();
			size--;
			return value;
		}
		if (pos == size) {
			Node s = start;
			Node t = start;
			while (s != end) {
				t = s;
				s = s.getLink();
			}
			end = t;
			end.setLink(null);
			size--;

		}
		Node ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				Node tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				size--;
				break;
			}
			ptr = ptr.getLink();
		}

		return null;
	}

	/**
	 * displays the whole list
	 */
	public void display() {
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getLink() == null) {
			System.out.println(start.getData());
			return;
		}
		Node ptr = start;
		System.out.print(start.getData() + "->");
		ptr = start.getLink();
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData() + "\n");
	}

	/**
	 * returns the first element
	 * 
	 * @return
	 */
	public E getFirstElement() {
		if (start == null) {
			return null;
		} else {
			return (E) start.getData();
		}
	}
}
