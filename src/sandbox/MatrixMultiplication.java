package sandbox;

public class MatrixMultiplication {

	static int myFirst2DArray[][] = { { 1, 2, 3 }, { 2, 5, 6 }, { 4, 5, 8 } };
	static int mySecond2DArray[][] = { { 1, 2 }, { 3, 6 }, { 5, 1 } };
	static int myThird2DArray[][];
	static int mupltipliedValue1;
	static int mupltipliedValue2;

	public static void main(String[] args) {
		System.out.println("Rows: " + mySecond2DArray.length);
		System.out.println("Cols: " + mySecond2DArray[0].length);
		System.out.println("**********");
		printYourArray(myFirst2DArray);
		System.out.println("**********");
		printYourArray(mySecond2DArray);
		System.out.println("**********");
		int o[][] = matrixMul(myFirst2DArray, mySecond2DArray);
		printYourArray(o);

	}

	private static void printYourArray(int myArray[][]) {
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[0].length; j++) {
				System.out.print(myArray[i][j] + " ");

			}
			System.out.println();

		}

	}

	private static int[][] matrixMul(int arr1[][], int arr2[][]) {
		int rows = arr1.length;
		int cols = arr2[0].length;
		int commonDim = arr2.length;

		int output[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				output[i][j] = 0;
				for (int k = 0; k < commonDim; k++) {
					output[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}

		// printYourArray(output);
		return output;
	}

}
