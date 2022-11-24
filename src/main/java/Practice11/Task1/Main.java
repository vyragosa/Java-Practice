package Practice11.Task1;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter developer name");
		Developer developer = new Developer(scanner.next());
		System.out.println("Enter any symbol to create start date");
		developer.setStartDate(scanner.next());

		System.out.println("Enter any symbol to create end date");
		developer.setEndDate(scanner.next());
		developer.print();
	}
}
