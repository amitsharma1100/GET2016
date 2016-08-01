package session2.assignment1;

/**
 * 
 * @author Amit
 *
 * @param <E>
 */
class Node<E> {
	protected E data;
	protected Node link;

	public Node() {
		link = null;
		data = null;
	}

	public Node(E d, Node n) {
		data = d;
		link = n;
	}

	public void setLink(Node n) {
		link = n;
	}

	public void setData(E d) {
		data = d;
	}

	public Node getLink() {
		return link;
	}

	public E getData() {
		return data;
	}
}
