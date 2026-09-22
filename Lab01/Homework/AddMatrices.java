package Lab01.Homework;

import java.util.Scanner;

public class AddMatrices {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int rows = keyboard.nextInt();
		System.out.print("Enter the number of columns: ");
		int columns = keyboard.nextInt();

		if (rows <= 0 || columns <= 0) {
			System.out.println("Matrix dimensions must be positive.");
			keyboard.close();
			return;
		}

		int[][] firstMatrix = readMatrix(keyboard, rows, columns, "first");
		int[][] secondMatrix = readMatrix(keyboard, rows, columns, "second");
		int[][] sumMatrix = addMatrices(firstMatrix, secondMatrix);

		System.out.println("Sum of the matrices:");
		printMatrix(sumMatrix);

		keyboard.close();
	}

	private static int[][] readMatrix(Scanner keyboard, int rows, int columns, String name) {
		int[][] matrix = new int[rows][columns];
		System.out.println("Enter the " + name + " matrix:");

		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				System.out.print("Element [" + row + "][" + column + "]: ");
				matrix[row][column] = keyboard.nextInt();
			}
		}
		return matrix;
	}

	private static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
		int rows = firstMatrix.length;
		int columns = firstMatrix[0].length;
		int[][] sumMatrix = new int[rows][columns];

		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				sumMatrix[row][column] = firstMatrix[row][column] + secondMatrix[row][column];
			}
		}
		return sumMatrix;
	}

	private static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int value : row) {
				System.out.printf("%6d", value);
			}
			System.out.println();
		}
	}
}
