package session3.assignment1;

import java.util.Scanner;

/**
 * 
 * @author Amit
 *
 */
public class TreeCreator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BST bst = new BST();
		try {
			while (true) {
				System.out
						.println("*****Please choose*****\n\n1. Insert\n2. Search\n3. Preorder\n4. Postorder\n5. Compare Mirror\n6. Exit");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the element to be inserted");
					int data = scanner.nextInt();
					if (bst.insert(data)) {
						System.out.println("Successfully inserted");
					} else {
						System.out.println("Can't insert ");
					}
					break;
				case 2:
					System.out.println("Enter the element to be searched");
					int key = scanner.nextInt();
					Node node = bst.search(bst.getRoot(), key);
					if (node == null || (node != null && node.getData() != key)) {
						System.out.println("Can't find " + key + " in the tree");
					}

					else {
						System.out.println(key + " found in the tree");
					}

					break;
				case 3: System.out.println("Preorder traversal is :");
						bst.preOrder(bst.getRoot());
						System.out.println();
						break;
				case 4:System.out.println("Postorder traversal is :");
						bst.postOrder(bst.getRoot());
						System.out.println();
						break;
				case 5:System.out.println("Enter the values for the first tree");
				       BST tree1=TreeCreator.createMirrorTree();
				       Preorder.preorder="";
				       tree1.preOrder(tree1.getRoot());
				       System.out.println("\nEnter the preorder of the tree you want to check for mirror image");
				       String preorder=TreeCreator.getPreOrder();
				       if(Preorder.preorder.equalsIgnoreCase(preorder))
				       {
				    	   System.out.println("The trees are mirror similiar");
				       }
				       else
				       {
				    	   System.out.println("The trees are not similiar");
				       }
				        break;
				case 6:
					System.exit(-1);
				default:
					System.out.println("Enter a valid choice");
					break;
				}
			}

		} catch (Exception exception) {
			System.out.println("Something went wrong : "+ exception.getMessage());
		} finally {
			if (scanner != null) {
				//scanner.close();
			}
		}
	}
	
	/**
	 * creates the mirror tree
	 * @return
	 */
	public static BST createMirrorTree()
	{
		BST bst=new BST();
		Scanner scanner=new Scanner(System.in);
		try{
		boolean isContinue=true;
		while(isContinue)
		{
			System.out.println("Enter the value");
			int value=scanner.nextInt();
			bst.createMirror(value);
			System.out.println("Do you want to continue\nPress 1 if yes else type 2");
			int choice=scanner.nextInt();
			if(choice!=1)
			{
				isContinue=false;
			}
		}
		return bst;
		}
		catch(Exception exception)
		{
			System.out.println("Something went wrong : "+exception.getMessage());
		}
		finally{
			//scanner.close();
		}
		return bst;
	}
	/**
	 * returns the preorder of the mirror
	 * @return
	 */
	 public static String getPreOrder()
	 {
		 Scanner scanner=new Scanner(System.in);
			try{
				String preorder="";
			boolean isContinue=true;
			while(isContinue)
			{
				System.out.println("Enter the value");
				preorder+=scanner.nextInt()+",";
				System.out.println("Do you want to continue\nPress 1 if yes else type 2");
				int choice=scanner.nextInt();
				if(choice!=1)
				{
					isContinue=false;
				}
			}
			return preorder;
			}
			catch(Exception exception)
			{
				System.out.println("Something went wrong : "+exception.getMessage());
			}
			finally{
				//scanner.close();
			}
			return null;
	 }

}
