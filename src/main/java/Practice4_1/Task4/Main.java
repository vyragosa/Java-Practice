package Practice4_1.Task4;

class Main {
	public static void main(String[] args) {
		Matrix matrix1 = new Matrix(3, 3);
		matrix1.printMatrix();
		Matrix matrix2 = new Matrix(3, 3);
		matrix2.printMatrix();
		matrix1.addMatrix(matrix2);
		matrix1.printMatrix();
		matrix1.mulToNumMatrix(3);
		matrix1.printMatrix();
		matrix1.mulMatrix(matrix2);
		matrix1.printMatrix();
	}
}
