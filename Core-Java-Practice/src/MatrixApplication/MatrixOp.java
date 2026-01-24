package MatrixApplication;
import java.util.Scanner;

public class MatrixOp {
	Scanner sc = new Scanner(System.in);
	private int[][] matrix1;
	private int rows1, cols1;
	private boolean matrix1Created = false;

	private int[][] matrix2;
	private int rows2, cols2;

	public void createMatrix() {
		System.out.print("Rows: ");
		rows1 = sc.nextInt();
		System.out.print("Columns: ");
		cols1 = sc.nextInt();

		matrix1 = new int[rows1][cols1];
		System.out.println("Enter Matrix 1 (" + rows1 + "x" + cols1 + "):");

		for(int i = 0; i < rows1; i++) {
			for(int j = 0; j < cols1; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		matrix1Created = true;
		System.out.println("Matrix 1 Created!");
		printMatrix(matrix1, rows1, cols1);
	}
	
	private void printMatrix(int[][] mat, int r, int c) {
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.printf("%4d ", mat[i][j]);
			}
			System.out.println();
		}
	}

	public void displayMatrix() {
		if(!matrix1Created) {
			System.out.println("Create Matrix 1 first!");
			return;
		}
		System.out.println("\nMatrix (" + rows1 + "x" + cols1 + "):");
		printMatrix(matrix1, rows1, cols1);
	}

	public void addMatrices() {
		if(!matrix1Created) {
			System.out.println("Create Matrix 1 first!");
			return;
		}
		System.out.print("Rows: ");
		rows2 = sc.nextInt();
		System.out.print("Columns: ");
		cols2 = sc.nextInt();
		if(rows2==rows1 && cols2==cols1 )
		{
			matrix2 = new int[rows2][cols2];
			System.out.println("Enter Matrix 2 (" + rows2 + "x" + cols2 + "):");
			for(int i = 0; i < rows2; i++)
			{
				for(int j = 0; j < cols2; j++)
				{
					matrix2[i][j] = sc.nextInt();
				}
			}
			System.out.println("\nMATRIX ADDITION:");
			printResultMatrix(matrix1, matrix2, rows1, cols1, rows2, cols2, "+");
		}
		else 
		{
			System.out.println("Addition Not Possible Check The Matrix.");
			return;
		}
	}
	
	public void subMatrices() {
		if(!matrix1Created) {
			System.out.println("❌ Create Matrix 1 first!");
			return;
		}
		System.out.print("Rows: ");
		rows2 = sc.nextInt();
		System.out.print("Columns: ");
		cols2 = sc.nextInt();
		if(rows2==rows1 && cols2==cols1 )
		{
			matrix2 = new int[rows2][cols2];
			System.out.println("Enter Matrix 2 (" + rows2 + "x" + cols2 + "):");
			for(int i = 0; i < rows2; i++)
			{
				for(int j = 0; j < cols2; j++)
				{
					matrix2[i][j] = sc.nextInt();
				}
			}
			System.out.println("\nMATRIX SUBSTRACTION:");
			printResultMatrix(matrix1, matrix2, rows1, cols1, rows2, cols2, "-");
		}
		else 
		{
			System.out.println("Substraction Not Possible Check The Matrix.");
			return;
		}
	}
	
	public void multiplyMatrices() {
		if(!matrix1Created) {
			System.out.println("❌ Create Matrix 1 first!");
			return;
		}
		System.out.print("Rows: ");
		rows2 = sc.nextInt();
		System.out.print("Columns: ");
		cols2 = sc.nextInt();
		if(cols1 != rows2) { 
	        System.out.println("Multiplication Not Possible! cols1(" + cols1 + ") != rows2(" + rows2 + ")");
	        return;
	    }
		else 
		{
			matrix2 = new int[rows2][cols2];
			System.out.println("Enter Matrix 2 (" + rows2 + "x" + cols2 + "):");
			for(int i = 0; i < rows2; i++)
			{
				for(int j = 0; j < cols2; j++)
				{
					matrix2[i][j] = sc.nextInt();
				}
			}
			System.out.println("\nMATRIX Multiplication:");
			printResultMatrix(matrix1, matrix2, rows1, cols1, rows2, cols2, "*");
		}
	}
	
	private void printResultMatrix(int[][] m1, int[][] m2, int r1, int c1, int r2, int c2, String op)
	{
		switch(op)
		{
		case "+":
			// Addition
			for(int i = 0; i < r1; i++) {
				for(int j = 0; j < c1; j++) {
					System.out.printf("%4d ", m1[i][j] + m2[i][j]);
				}
				System.out.println();
			}
			break;
			
		case "-":
			// Subtraction
			for(int i = 0; i < r1; i++) {
				for(int j = 0; j < c1; j++) {
					System.out.printf("%4d ", m1[i][j] - m2[i][j]);
				}
				System.out.println();
			}
			break;
			
		case "*":
			// Multiplication
			int[][] result = new int[r1][c2];
			for(int i = 0; i < r1; i++) {
				for(int j = 0; j < c2; j++)
				{
					for(int k = 0; k < c1; k++)
					{
						result[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}
			printMatrix(result, r1, c2);
			break;
		default:
			System.out.println("Invalid Operator Passed!");
			break;
		}
	}

	public void transposeMatrix() {
		if(!matrix1Created) {
			System.out.println("Create matrix first!");
			return;
		}
		int[][] transpose = new int[cols1][rows1];
	    for(int i = 0; i < rows1; i++)
	        for(int j = 0; j < cols1; j++)
	            transpose[j][i] = matrix1[i][j];
	    System.out.println("\nTRANSPOSE:");
	    printMatrix(transpose, cols1, rows1);
	}
	
	public void sortMatrixElements() {
		if(!matrix1Created) {
			System.out.println("❌ Create matrix first!");
			return;
		}

		int[] flat = new int[rows1 * cols1];
		int idx = 0;
		for(int i = 0; i < rows1; i++) {
			for(int j = 0; j < cols1; j++) {
				flat[idx++] = matrix1[i][j];
			}
		}

		// Bubble sort
		for(int i = 0; i < flat.length - 1; i++) {
			for(int j = 0; j < flat.length - 1 - i; j++) {
				if(flat[j] > flat[j + 1]) {
					int temp = flat[j];
					flat[j] = flat[j + 1];
					flat[j + 1] = temp;
				}
			}
		}

		System.out.println("\nMatrix 1 Elements Sorted:");
		System.out.println("Sorted: ");
		for(int i = 0; i < flat.length; i++) {
			System.out.printf("%4d ", flat[i]);
			if((i + 1) % 10 == 0)
				System.out.println();
		}
		System.out.println();
	}
}
