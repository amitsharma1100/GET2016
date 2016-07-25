package session1.assignment1;

import java.util.Scanner;

public class Matrix {

	int[][] matrixArray;
	int rows;
	int columns;

	/**
	 * 
	 * @param size
	 *            (int) denotes the size of the matrix
	 */
private	void initializeMatrixDimensions(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.matrixArray = new int[this.rows][this.columns];
	}

	/* adds the elements in the matrix */
private	boolean addELements(int input, int rowIndex, int columnIndex) {
		// null matrix check
		if (this.matrixArray == null || rowIndex > this.rows
				|| columnIndex > this.columns) {
			return false;
		} else {
			this.matrixArray[rowIndex][columnIndex] = input;
			return true;
		}

	}

private	int[][] show() {
		if (this.matrixArray == null) {
			return null;
		} else {
			return this.matrixArray;
		}
	}

	/* performs the transpose of the matrix */
private	int[][] transpose() {
		int transpose[][] = new int[this.columns][this.rows];
		if (this.matrixArray == null) {
			return null;
		} else {
			for (int rowIndex = 0; rowIndex < this.rows; rowIndex++) {
				for (int columnIndex = 0; columnIndex < this.columns; columnIndex++) {
					transpose[columnIndex][rowIndex] = this.matrixArray[rowIndex][columnIndex];
				}
			}
			int temp = this.rows;
			this.rows = this.columns;
			this.columns = temp;
			this.matrixArray = new int[this.rows][this.columns];
			this.matrixArray = transpose;
		}
		return transpose;
	}

private	int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
		int matrix1Rows = matrix1.length;
		int matrix1Columns = matrix1[0].length;
		int matrix2Rows = matrix2.length;
		int matrix2Columns = matrix2[0].length;
		if (matrix1Columns != matrix2Rows) {
			return null;
		}
		int multiplicationResult[][] = new int[matrix1Rows][matrix2Columns];

		int sum = 0;
		for (int rowIndex = 0; rowIndex < matrix1Rows; rowIndex++) {
			for (int columnIndex = 0; columnIndex < matrix2Rows; columnIndex++) {
				for (int thirdIndex = 0; thirdIndex < matrix2Columns; thirdIndex++) {
					sum = sum + matrix1[rowIndex][thirdIndex]
							* matrix2[thirdIndex][columnIndex];
				}

				multiplicationResult[rowIndex][columnIndex] = sum;
				sum = 0;
			}
		}

		return multiplicationResult;

	}

	public static void main(String[] args) {
		// create a matrix object
		Matrix matrix = new Matrix();

		// initialize the size of the class
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the rows for the matrix");
		int rows = scanner.nextInt();

		System.out.println("Enter the columns for the matrix");
		int columns = scanner.nextInt();
		
		matrix.initializeMatrixDimensions(rows, columns);

		System.out.println("Enter the elements of the array");
		outerLoop:for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
			for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
				boolean status=matrix.addELements(scanner.nextInt(), rowIndex, columnIndex);
				if(!status)
				{
					break outerLoop;
				}
			}
		}

		scanner.close();

	

		// display the matrix contents
		int temp[][] = matrix.show();
		for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
			for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
				System.out.print(temp[rowIndex][columnIndex] + " ");
			}
			System.out.println("");
		}

		// transpose the contents of the matrix
		matrix.transpose();

		temp = matrix.show();
		for (int rowIndex = 0; rowIndex < columns; rowIndex++) {
			for (int columnIndex = 0; columnIndex < rows; columnIndex++) {
				System.out.print(temp[rowIndex][columnIndex] + " ");
			}
			System.out.println("");
		}
		int[][] matrix1 = { { 1, 2 }, { 3, 7 } };
		int[][] matrix2 = { { 6, 7 }, { 9, 1 } };
		temp = matrix.multiplyMatrix(matrix1, matrix2);
		if(temp==null)
		{
			System.out.println("Multiplication is not possible");
		}
		else{
		for (int rowIndex = 0; rowIndex < temp.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex <  temp[0].length; columnIndex++) {
				System.out.print(temp[rowIndex][columnIndex] + " ");
			}
			System.out.println("");
		}
		}
	}
}
