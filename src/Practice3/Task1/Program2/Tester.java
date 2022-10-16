package Practice3.Task1.Program2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Tester {
	private final Circle[] arr;
	private final int size;

	public Tester() {
		System.out.println("Enter size of array");
		Scanner scanner = new Scanner(System.in);
		this.size = scanner.nextInt();
		arr = new Circle[size];

		System.out.println("Enter x and y:");
		for (int i = 0; i < size; i++) {
			arr[i] = new Circle(scanner.nextInt(), scanner.nextInt());
		}
	}

	String getMinCircle() {
		return Arrays.stream(arr).min(Comparator.comparing(Circle::getL)).toString();
	}

	String getMaxCircle() {
		return Arrays.stream(arr).max(Comparator.comparing(Circle::getL)).toString();
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
}
