package session4.assignment2;

/**
 * 
 * @author Amit
 * 
 */
public class Hashing {

	// the hash table that contains the customer objects
	private static Customer[] hashTable;

	public Hashing() {
		int totalRooms = RoomAlloter.getTotalrooms();
		Hashing.hashTable = new Customer[totalRooms];
	}

	//return the hash code for a particular age
	public static int myHashCode(int age) {
		return (age % RoomAlloter.getTotalrooms());

	}

	public static Customer[] getHashTable() {
		return hashTable;
	}

	public void setHashTable(Customer[] hashTable) {
		Hashing.hashTable = hashTable;
	}

}
