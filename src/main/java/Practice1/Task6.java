package Practice1;

import java.util.Scanner;

class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		System.out.println(res);
	}
}
