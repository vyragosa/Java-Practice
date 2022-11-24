package Practice2.Task3;

import java.util.Arrays;

class Tester {
	private final Circle[] arr;
	private final int size;

	public Tester(int size) {
		this.size = size;
		arr = new Circle[this.size];
	}

	@Override
	public String toString() {
		return "Tester{" +
				"arr=" + Arrays.toString(arr) +
				", size=" + size +
				'}';
	}
}
