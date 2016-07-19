package session1.assignment6;

public class ArrayJoin {

	public static void main(String[] args) {
		int a[] = { 1, 5, 9 };
		int b[] = { 3, 5, 6, 7, 9 };
		int c[] = new int[a.length + b.length];
		
		//call the method to join
		int output[] = new ArrayJoin().join(a, a.length, b, b.length, c);
		for (int i = 0; i < output.length; i++)
			System.out.print(output[i] + "  ");
	}

	int[] join(int a[], int asize, int b[], int bsize, int c[]) {
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		int aSize = a.length;
		int bSize = b.length;

		//merge until anyone of the input arrays get exhausted
		while (aIndex < aSize && bIndex < bSize) {
			if (a[aIndex] <= b[bIndex]) {
				c[cIndex++] = a[aIndex++];
			} else if (a[aIndex] > b[bIndex]) {
				c[cIndex++] = b[bIndex++];
			}
		}

		//copy the remaining contents of array A in the output array
		if (aIndex > aSize) {

			while (aIndex < aSize) {
				c[cIndex++] = a[aIndex++];
			}
		} else {//copy the remaining contents of array B in the output array

			while (bIndex < bSize) {
				c[cIndex++] = b[bIndex++];
			}
		}

		return c;
	}

}