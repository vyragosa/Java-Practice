package Ex2.Task3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		Tester tester = new Tester(scanner.nextInt());
	}
}
