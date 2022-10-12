package Practice8.Task10;

import java.util.Scanner;

class NumberReverse {
	public static int reverse(int number, int i) {
		if (number == 0)
			return i;
		else
			return reverse(number / 10, i * 10 + number % 10);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(reverse(scanner.nextInt(), 0));
	}
}
