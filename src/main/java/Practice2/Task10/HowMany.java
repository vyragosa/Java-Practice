package Practice2.Task10;

import java.util.Scanner;

class HowMany {
	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextLine().split("\\s+").length);
	}
}
