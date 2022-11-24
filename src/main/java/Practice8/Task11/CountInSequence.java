package Practice8.Task11;

import java.util.Scanner;

class CountInSequence {

	public static int recursion(int p) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n == 0 && p == 0)
			return 0;
		return recursion(n) + ((n == 1) ? 1 : 0);
	}

	public static void main(String[] args) {
		System.out.println(recursion(1));
	}
}
