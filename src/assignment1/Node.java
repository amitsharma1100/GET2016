package session7.assignment1;

/**
 * 
 * @author Amit
 *
 */
public class Node {

	private Node left;
	private int data;
	@SuppressWarnings("rawtypes")
	private Node right;

	public Node() {
		this.left = null;
        this.data=0;
        this.right=null;
	}
	
	public Node(int data)
	{
		this.left = null;
        this.data=data;
        this.right=null;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}
