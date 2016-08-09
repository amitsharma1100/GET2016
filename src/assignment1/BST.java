package session8.assignment1;

/**
 * 
 * @author Amit
 *
 */
public class BST {

	private Node root;

	/**
	 * searches for a data item in node This is a recursive call
	 * 
	 * @param node
	 * @param data
	 * @return
	 */
	public Node search(Node node, int data) {
		if (node == null) {
			return null;
		} else if (node.getData() == data) {
			return node;
		} else if ((node.getData() > data && node.getLeft() == null)
				|| (node.getData() < data && node.getRight() == null)) {
			return node;
		} else if (node.getData() > data && node.getLeft() != null) {
			return search(node.getLeft(), data);
		} else if (node.getData() < data && node.getRight() != null) {
			return search(node.getRight(), data);
		} else {
			return null;
		}
	}

	/**
	 * Inserts a data item at a a particular proper position Items greater than
	 * the parent are inserted in the right subtree and items smaller than the
	 * parent are inserted in the left subtree
	 * 
	 * @param data
	 * @return
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
		} else if (parent.getData() < data) {
			parent.setRight(newNode);
			status = true;
		}
		return status;

	}

	/**
	 * getter for root of the tree
	 * 
	 * @return
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * setter for the root of the tree
	 * 
	 * @param root
	 */
	public void setRoot(Node root) {
		this.root = root;
	}

	/**
	 * prints the inorder traversal of the tree
	 * 
	 * @param node
	 */
	public void inOrder(Node node) {
		if (node != null) {
			if (node.getLeft() != null) {
				inOrder(node.getLeft());
			}
			System.out.print(node.getData() + "-->");
			if (node.getRight() != null) {
				inOrder(node.getRight());
			}
		}
	}
}
