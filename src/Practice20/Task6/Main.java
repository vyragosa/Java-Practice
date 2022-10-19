package Practice20.Task6;

class Main {
	public static void main(String[] args) {
		Matrix<Integer> integerMatrix = new Matrix<>();
		integerMatrix.setMatrix(new Integer[][]{{1, 2}, {3, 4}});
		integerMatrix.printMatrix();
		integerMatrix.transparentMatrix();
		integerMatrix.printMatrix();
	}
}
