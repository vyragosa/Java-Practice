package Practice7.Task6;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		StringOperations stringOperations = new ProcessStrings();
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(stringOperations.getOddString(str));
		System.out.println(stringOperations.reverse(str));
		System.out.println(stringOperations.getLength(str));

	}
}
