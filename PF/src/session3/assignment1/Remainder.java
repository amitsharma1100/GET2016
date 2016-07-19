package session3.assignment1;

public class Remainder {

	public static void main(String[] args) {
		int x = 2;
		int y = 0;
		Remainder remainder = new Remainder();
		int result = (x > y) ? remainder.rem(x, y) : remainder.rem(y, x);
		System.out.println("remainder:" + result);
	}

	int rem(int x, int y) {
		if(y==0)
		{
			return -1;
		}
		if (x < y) {
			return x;
		} else {
			return rem(x - y, y);
		}

	}
}
