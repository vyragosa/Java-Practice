package Practice20.Task6;

import java.util.ArrayList;
import java.util.Collections;

class Matrix<E> {
	ArrayList<ArrayList<E>> matrix;
	private int row;
	private int col;

	public void setMatrix(E[][] matrix) {
		this.matrix = new ArrayList<>();
		for (E[] e : matrix) {
			col++;
			ArrayList<E> temp = new ArrayList<>();
			Collections.addAll(temp, e);
			row++;
			this.matrix.add(temp);
		}
	}

	public void printMatrix() {
		System.out.println("Matrix:");
		for (ArrayList<E> ints : matrix) {
			for (E temp : ints) {
				System.out.print(temp + "\t");
			}
			System.out.println();
		}
	}

	public void transparentMatrix() {
		for (int i = 0; i < col; i++) {
			for (int j = i; j < row; j++) {
				E temp = matrix.get(j).get(i);
				matrix.get(j).set(i, matrix.get(i).get(j));
				matrix.get(i).set(j, temp);
			}
		}
	}
}
