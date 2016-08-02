package session3.assignment1;

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
		if (parent.getData() > data) {
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
	 * prints the preorder traversal of the tree it first prints root then the
	 * left subtree and then prints the right subtree
	 * 
	 * @param node
	 */
	public void preOrder(Node node) {
		if (node != null) {
			System.out.print("-->" + node.getData());
			Preorder.preorder += node.getData() + ",";
			if (node.getLeft() != null) {
				preOrder(node.getLeft());
			}
			if (node.getRight() != null) {
				preOrder(node.getRight());
			}
		}

	}

	/**
	 * prints the postorder traversal of the tree it first prints the left
	 * subtree then prints the right subtree and prints the root at the end
	 * 
	 * @param node
	 */
	public void postOrder(Node node) {
		if (node != null) {
			if (node.getLeft() != null) {
				preOrder(node.getLeft());
			}
			if (node.getRight() != null) {
				preOrder(node.getRight());
			}
			System.out.print("-->" + node.getData());
		}
	}

	/**
	 * creates the mirror of the tree
	 * 
	 * @param data
	 * @return
	 */
	public boolean createMirror(int data) {
		Node newNode = new Node();
		boolean status = false;
		newNode.setLeft(null);
		newNode.setData(data);
		newNode.setRight(null);
		if (root == null) {
			root = newNode;
			return true;
		}
		Node parent = searchMirror(root, data);
		if (parent.getData() > data) {
			parent.setRight(newNode);
			status = true;
		} else if (parent.getData() < data) {
			parent.setLeft(newNode);
			status = true;
		}
		return status;
	}

	/**
	 * performs a search for the mirror creation process
	 * @param node
	 * @param data
	 * @return
	 */
	public Node searchMirror(Node node, int data) {
		if (node == null) {
			return null;
		} else if (node.getData() == data) {
			return node;
		} else if ((node.getData() < data && node.getLeft() == null)
				|| (node.getData() > data && node.getRight() == null)) {
			return node;
		} else if (node.getData() < data && node.getRight() != null) {
			return search(node.getRight(), data);
		} else if (node.getData() > data && node.getLeft() != null) {
			return search(node.getLeft(), data);
		} else {
			return null;
		}
	}

}
