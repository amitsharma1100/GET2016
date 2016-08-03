package session4.assignment2;

import java.util.Scanner;

/**
 * This class allocates rooms to customer based on age
 * It uses a hash function that uses age of the customer and the total rooms
 * @author Amit
 *
 */
public class RoomAlloter {

	// total rooms available
	//as per the problem statement it is a prime number
	private static final int totalRooms = 7;

	public static int getTotalrooms() {
		return totalRooms;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
		Hashing hashing = new Hashing();
		RoomAlloter roomAlloter = new RoomAlloter();
		while (true) {
			System.out.println("****Please choose****\n1. Allot a room\n2. Search a customer\n3. Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the customer name");
				String customerName = scanner.next();
				System.out.println("Enter the age");
				int age = scanner.nextInt();
				System.out.println("Enter the nationality");
				String nationality = scanner.next();
				Customer customer = new Customer(customerName, age, nationality);
				int index = Hashing.myHashCode(age);
				if (roomAlloter.alloteRoom(index, customer)) {
					System.out.println("Successfully inserted");
				} else {
					System.out.println("Can't insert");
				}
				break;
			case 2:
				System.out.println("Enter the age of the customer to be searched");
				age = scanner.nextInt();
				roomAlloter.search(age);
				break;
			case 3:
				System.exit(-1);
			default:System.out.println("Enter a valid value");
				break;
			}
	}
		}
		catch (Exception e) {
			System.out.println("Exception caught "+e.getMessage());
		}
	}

	/**
	 * allocates the room to a customer
	 * @param index-the index returned by the hash function based on age
	 * @param customer-the customer object to be inserted into the hash table
	 * @return-returns true if the object is successfully inserted else returns false
	 */
	public boolean alloteRoom(int index, Customer customer) {
		boolean status = false;
		if (Hashing.getHashTable()[index] == null) {
			Hashing.getHashTable()[index] = customer;
			status = true;
		} else {
			for (int index2 = index + 1; index2 < getTotalrooms(); index2++) {
				if (Hashing.getHashTable()[index2] == null) {
					Hashing.getHashTable()[index2] = customer;
					return true;
				}
				for (index2 =0; index2 <index; index2++) {
					if (Hashing.getHashTable()[index2] == null) {
						Hashing.getHashTable()[index2] = customer;
						return true;
					}
			}
		}
		}
		return status;
	}

	public boolean search(int age)
	{
		int index = Hashing.myHashCode(age);
		Customer customer = Hashing.getHashTable()[index];
		if(customer==null)
		{
			System.out.println("Not found");
			return false;
		}
		else
		{
			System.out.println("Customer name  :  "	+ customer.getCustomerName());
			System.out.println("Customer age  :  " + customer.getAge());
			System.out.println("Customer nationality  :  "+ customer.getNationality());	
			return true;
		}
	}
	

}
