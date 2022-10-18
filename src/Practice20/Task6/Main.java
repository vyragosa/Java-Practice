package Practice20.Task6;

class Main {
	public static void main(String[] args) {
		Matrix<Integer> tmp = new Matrix<>();
		tmp.setMatrix(new Integer[][]{{1, 2}, {3, 4}});
		tmp.printMatrix();
		tmp.transparentMatrix();
		tmp.printMatrix();
	}
}
