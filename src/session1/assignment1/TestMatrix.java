package session1.assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestMatrix {

	Matrix matrix;
	int matrix1[][];
	int matrix2[][];
	int matrixTranspose[][];
	int matrixMultiplyResult[][];

	@Before
	public void setUp() throws Exception {
		matrix=new Matrix();
		matrix1=new int[2][2];
		matrix2=new int[2][2];
		matrixTranspose=new int[2][2];
		matrixMultiplyResult=new int[2][2];
		matrix.initializeMatrixDimensions(2,2);
		matrix.addELements(2, 0, 0);
		matrix.addELements(5, 0, 1);
		matrix.addELements(3, 1, 0);
		matrix.addELements(4, 1, 1);
	
		matrixTranspose[0][0]=2;matrixTranspose[0][1]=3;
		matrixTranspose[1][0]=5;matrixTranspose[1][1]=4;
		
		matrix1[0][0]=1;matrix1[0][1]=2;
		matrix1[1][0]=4;matrix1[1][1]=5;
		
		matrixMultiplyResult[0][0]=12;matrixMultiplyResult[0][1]=11;
		matrixMultiplyResult[1][0]=33;matrixMultiplyResult[1][1]=32;
		
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testMatrix() {
		
		assertEquals(true,matrix.addELements(2, 1, 0));
		assertEquals(matrixTranspose,matrix.transpose());
		assertEquals(matrixMultiplyResult,matrix.multiplyMatrix(matrix1,matrixTranspose));
		
		
	}

}