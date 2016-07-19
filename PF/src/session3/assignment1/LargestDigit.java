package session3.assignment1;

public class LargestDigit {

	public static void main(String[] args) {
		System.out.println("result:" + new LargestDigit().largestdigit(253));
	}

	int largestdigit(int x) {
		// base case: to return 0 if input is zero
		if (x == 0)
			return 0;
		//recursive call determing largest digit 
		//by comparing current and previous digit
		else {
			int temp1 = x % 10;
			int temp2 = largestdigit(x / 10);
			return temp1 > temp2 ? temp1 : temp2;
		}

	}

}
