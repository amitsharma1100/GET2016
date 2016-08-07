package session7.assignment1;

/**
 * 
 * @author Amit
 * 
 */
public class BST {

	private Node root;

	public BST() {
		root = new Node();
		this.root.setLeft(null);
		this.root.setData(0);
		this.root.setRight(null);
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	/**
	 * searches the tree for the node containing the data item
	 * 
	 * @param node
	 *            --the current node to be searched
	 * @param data
	 *            --the data to be searched
	 * @return
	 */
	public Node search(Node node, int data) {
		if (node.getData() == data) {
			return node;
		} else if ((node.getData() >= data && node.getLeft() == null)
				|| (node.getData() <= data && node.getRight() == null)) {
			return node;
		} else if (node.getData() >= data && node.getLeft() != null) {
			return search(node.getLeft(), data);
		} else if (node.getData() <= data && node.getRight() != null) {
			return search(node.getRight(), data);
		} else {
			return null;
		}
	}

	/**
	 * inserts the data into the tree
	 * 
	 * @param data
	 *            --the value to be inserted
	 * @return-returns true if the data is successfully inserted
	 */
	public boolean insert(int data) {
		Node newNode = new Node();
		boolean status = false;
		newNode.setLeft(null);
		newNode.setData(data);
		newNode.setRight(null);
		if (root == null) {
			root = newNode;
			return true;
		}
		Node parent = search(root, data);
		if (parent.getData() >= data) {
			parent.setLeft(newNode);
			status = true;
		} else if (parent.getData() <= data) {
			parent.setRight(newNode);
			status = true;
		}
		return status;
	}
}
