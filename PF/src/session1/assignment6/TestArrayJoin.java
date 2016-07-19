package session1.assignment6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestArrayJoin {
	ArrayJoin sampleObject;
	int a[];
	int aSize;
	int b[];
	int bSize;
	int c[];
	int d[];
	int dSize;
	int e[];
	int eSize;
	int f[];

	@Before
	public void setUp() throws Exception {
		sampleObject = new ArrayJoin();
		int totalSize1,totalSize2 ;
		a =  new int[] {2,4,8};
		aSize = 3;
		b = new int[] {1,4,7,9,78};
		bSize = 5;
		totalSize1 = aSize + bSize ;
		c = new int[totalSize1] ;
		
		d =  new int[] {2,4,8};
		dSize = 3;
		e = new int[] {1,4,7,9,78};
		eSize = 5;
		totalSize2 = dSize + eSize ;
		f = new int[totalSize2] ;
	}

	@Test
	public void testJoin() {
		assertArrayEquals(new int[]{1,2,4,4,7,8,9,78},sampleObject.join(a,
				aSize, b, bSize, c));
		assertArrayEquals(new int[]{1,4,7,4,2,8,9,78},sampleObject.join(d,
				dSize, e, eSize, f));
	}

}