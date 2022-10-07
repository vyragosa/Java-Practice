package Ex3.Task2;

import java.util.Scanner;

class Program1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer value = scanner.nextInt();
		Double x = Double.valueOf(value);
		Double y = Double.valueOf(value.toString());

		System.out.println(x);
		System.out.println(y);

	}
}
