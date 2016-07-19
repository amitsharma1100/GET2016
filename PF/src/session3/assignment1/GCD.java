package session3.assignment1;

public class GCD {
	static GCD gcdObject;

	public static void main(String[] args) {
		int x = 100;
		int y = 3;
		gcdObject = new GCD();
		int result = (x > y) ? gcdObject.gcd(x, y) : gcdObject.gcd(y, x);
		System.out.println("GCD:" + result);
	}

	int gcd(int x, int y) {
		
		//check for greater number
		if(y>x)
		{
			int temp=x;
			x=y;
			y=temp;
		}
		try {
			//check if the divisor is zero
			if (y == 0) {
				throw new ArithmeticException();
			}
			
			//if y is a multiple of x return y
			if ((x % y) == 0) {
				return y;
			} else {
				return gcd(y, (x % y));
			}
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Cannot divide by zero");
			return -1;
		}

	}
}