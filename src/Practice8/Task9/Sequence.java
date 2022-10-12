package Practice8.Task9;

import java.util.Scanner;

class Sequence {
	public static int countSequence(int a, int b) {
		if (a > b + 1)
			return 0;
		if (a == 0 || b == 0)
			return 1;
		return countSequence(a, b - 1) + countSequence(a - 1, b - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(countSequence(scanner.nextInt(), scanner.nextInt()));
	}
}
