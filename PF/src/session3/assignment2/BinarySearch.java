package session3.assignment2;

public class BinarySearch {

	public static void main(String[] args) {
		int input[] = {2,5,8,9,10,77,55 };
		System.out.println("result:" + binarySearch(input,0,input.length,6));
	}

	
	 static int binarySearch(int[] input, int low, int high, int key) {
        
        if (low < high) {
        	
        	//find middle 
            int mid = (high + low) / 2; 
            
            //if key lies on left then call the method
            //recursively to search in the left part
            if (key < input[mid]) {
                return binarySearch(input, low, mid, key);
                 
            } 
            
          //if key lies on right then call the method
            //recursively to search in the left part
            else if (key > input[mid]) {
                return binarySearch(input, mid+1, high , key);
                 
            } else {
                return mid;  
            }
        }
        return -1; 
    }
}
