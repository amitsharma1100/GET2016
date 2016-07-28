package session1.assignment1;

import java.util.Scanner;

public class SinglyLinkedList
{    
    public static void main(String[] args)
    {             
        Scanner scanner = new Scanner(System.in);
        /* Creating object of class linkedList */
        LinkedList list = new LinkedList();        
       
        /*  Perform list operations  */
        while(true)
        {
            System.out.println("\n*****Please Choose*****\n");
            System.out.println("1. Insert");
            System.out.println("2. Insert at a particular location");
            System.out.println("3. Delete from a position");
            System.out.println("4. Delete based on value");
            System.out.println("5. Retrieve an item from a particular index");
            System.out.println("6. Reverse the list" );
            System.out.println("7. Exit");
                     
            int choice = scanner.nextInt();            
            switch (choice)
            {
            case 1 : 
            	 System.out.println("Enter integer element to insert");
                 list.insertAtEnd( scanner.nextInt() );                     
                 break;   
            case 2 : 
                System.out.println("Enter integer element to insert");
                int num = scanner.nextInt() ;
                System.out.println("Enter position");
                int pos = scanner.nextInt() ;
                if (pos <= 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPos(num, pos);
                break;   
            case 3 : 
                System.out.println("Enter integer element to insert");
                list.insertAtEnd( scanner.nextInt() );                     
                break;   
            case 4: System.out.println("Enter the value to be deleted");
                 int value=scanner.nextInt();
                 boolean status=list.deleteOnValue(value);
                if(status)
                {
            	 System.out.println("Successfully deleted");
                }
                else
               {
            	 System.out.println("Can't find value");
               }
              break;
            case 5 : 
                System.out.println("Enter the index");
                int index=scanner.nextInt();
                int val=list.searchAtIndex(index);
                if(val!=-111)
                {
                	System.out.println("Value at "+index+" is "+val);
                }
                else
                {
                	System.out.println("Could not find the requested index");
                }
                break; 
            case 7 : 
                System.out.println("Enter position");
                int p = scanner.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPos(p);
                break;
                              
            case 6 : 
                    Node temp=list.reverse(list.getStart());
                   list.setEnd(list.getStart());
                   list.setStart(temp);
                break;
            
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list.display();
                               
        }               
    }
}