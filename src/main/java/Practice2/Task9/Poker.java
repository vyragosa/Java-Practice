package Practice2.Task9;

import java.util.Scanner;

class Poker {
	public static void main(String[] args) {
		String[] suits = {"Пик", "Бубен", "Червь", "Треф"};
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < 5; j++)
				System.out.print(rank[(int) (Math.random() * 12)] + " "
						+ suits[(int) (Math.random() * 3)] + " | ");
			System.out.println("\n");
		}

	}
}