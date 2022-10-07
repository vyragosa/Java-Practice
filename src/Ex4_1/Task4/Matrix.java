package Ex4_1.Task4;

import java.util.Random;

public class Matrix {
	private final int row;
	private final int col;
	private int[][] matrix;

	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		Random random = new Random();
		matrix = new int[row][col];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(0, 10);
			}
		}
	}

	public void printMatrix() {
		System.out.println("Matrix:");
		for (int[] ints : matrix) {
			for (int anInt : ints) {
				System.out.print(anInt + "\t");
			}
			System.out.println();
		}
	}

	void addMatrix(Matrix other) {
		if (!(row == other.row && col == other.col)) {
			System.out.println("Incompatible matrices");
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] += other.matrix[i][j];
			}
		}
		System.out.println("Addition done");

	}

	void mulToNumMatrix(int num) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] *= num;
			}
		}
		System.out.println("Multiplication to number done");
	}

	void mulMatrix(Matrix other) {

		if (col != other.row) {
			System.out.println("Incompatible matrices");
		}
		int[][] result = new int[row][other.col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < other.col; j++) {
				for (int k = 0; k < other.row; k++)
					result[i][j] += matrix[i][k] * other.matrix[k][j];
			}
		}
		System.out.println("Multiplication done");
		matrix = result;
	}
}
