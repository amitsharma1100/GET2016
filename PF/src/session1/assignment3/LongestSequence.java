package session1.assignment3;

import java.util.Scanner;

public class LongestSequence {
	static int index = 0;

	public static void main(String[] args) {
		int totalNumber = 0;
		int inputArray[];
		System.out.println("Enter the total numbers of the array");
		Scanner scanner = new Scanner(System.in);
		totalNumber = scanner.nextInt();
		inputArray = new int[totalNumber];
		System.out.println("Enter the " + totalNumber + " numbers");
		for (int index = 0; index < totalNumber; index++) {
			inputArray[index] = scanner.nextInt();
		}
		LongestSequence longestSequence = new LongestSequence();
		
		int[] output=longestSequence.longestSequence(inputArray);
		for(int i=0;i<output.length;i++)
			System.out.println(" "+output[i]);
		scanner.close();
	}

	public int[] longestSequence(int inputArray[]){
		int maxNumOfElement ; 	
		int lowerIndex ;		
		int higherIndex ;		 
		maxNumOfElement = 0;
		lowerIndex = 0;
		higherIndex = 0 ;
		for(int i = 1;i<inputArray.length ;i++){
			int tempMaxNumOfElement ;
			int tempLowerIndex ;
			int tempHigherIndex ;
			tempLowerIndex = i;
			
			//find the increasing sequence
			while( i < inputArray.length ){
				if(inputArray[i] > inputArray[i-1]){
					i++ ;
				}
				else{
					break ;
				}
			}
			tempHigherIndex = i;
			tempMaxNumOfElement = tempHigherIndex - tempLowerIndex + 1 ;
			if(maxNumOfElement < tempMaxNumOfElement){
				lowerIndex = tempLowerIndex ;
				higherIndex = tempHigherIndex ;
				maxNumOfElement = higherIndex - lowerIndex + 1 ; 
			}
		}
		int[] returnArray = new int [higherIndex-lowerIndex+1];
		int temp;
		temp = 0 ;
		for(int i=lowerIndex-1;i<higherIndex;i++){
			returnArray[temp] = inputArray[i];
			temp++;
		}
		return returnArray;
	}
	

}