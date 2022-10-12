package Practice8.Task7;

import java.util.Scanner;

class FactorsOfNumber {
	public static void factors(int num, int i) {
		if (i > num / 2) {
			System.out.println(num);
			return;
		}

		if ((num % i) == 0) {
			System.out.print(i + "*");
			factors(num / i, i);
		} else
			factors(num, i + 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FactorsOfNumber.factors(scanner.nextInt(), 2);
	}
}
