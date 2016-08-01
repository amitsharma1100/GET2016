package session2.assignment1;

/**
 * 
 * @author Amit
 *
 * @param <E>
 */
public class Stack<E> {

	private LinkedList<E> stack;

	public Stack() {
		this.stack = new LinkedList<E>();
	}

	/**
	 * inserts the element at the top of the stack
	 * @param value
	 * @return
	 */
	public boolean push(E value) {
		stack.insertAtStart(value);
		return true;
	}
	
	/**
	 * removes the element at the top of the stack and returns the element
	 * @return
	 */
	public E pop()
	{
		E temp=(E) stack.deleteAtPos(1);
		if(temp==null)
		{
			return null;
		}
		else
		{
			return temp;
		}
		
	}
	
	/**
	 * returns the element at the top of the stack
	 * @return
	 */
	public E peek()
	{
		return (E) stack.getFirstElement();
	}
	
	/**
	 * returns the total elements in the stack
	 * @return
	 */
	public int sizeOfStack()
	{
		return stack.size;
	}
	/**
	 * checks if the size of the 
	 * @return
	 */
	public boolean isEmpty()
	{
		if(stack.size==0)
			return true;
		else
			return false;
	}
}
