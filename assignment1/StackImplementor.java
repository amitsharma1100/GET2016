package session2.assignment1;

import java.util.Scanner;

public class StackImplementor {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("***Please choose***");
			System.out.println("1. Push into stack");
			System.out.println("2. Pop from stack");
			System.out.println("3. Size of stack");
			System.out.println("4. Exit");
			System.out.println("5. IsEmpty");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the value to be pushed");
				int value = scanner.nextInt();
				stack.push(value);
				break;
			case 2: 
				Object temp=stack.pop();
				if(temp!=null)
				System.out.println("Value popped :"+(int)temp);
				else 
					System.out.println("can't pop from empty stack");
				break;
			case 3:System.out.println("Size of stack : "+stack.sizeOfStack());
			     break;
			case 4:System.exit(-1);
			case 5:System.out.println("ISEMPTY : "+stack.isEmpty());
			default:
				break;
			}
		}

	}

}
