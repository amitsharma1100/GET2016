package session3.assignment2;

public class RecursiveLinearSearch {
	
	public static void main(String[] args)
	{
		int input[]={2,5,8,9,10, 77, 55};
		boolean found=new RecursiveLinearSearch().search(input,77);
		System.out.println("Result:"+found);
	}
	
	boolean search(int[] input,int key)
	{
		if(input.length==0)
		{
			return false;
		}
		//check if the first element is equal to the key
		if(input[0]==key)
		{
			return true;
		}
		//if not then call the same function with input starting from the next index
		else
		{
			int inputLength=input.length;
			int[] nextArray=new int[inputLength-1];
			for(int index=1;index<inputLength;index++)
			{
				nextArray[index-1]=input[index];
			}
			return search(nextArray,key);
		}
	}

}
