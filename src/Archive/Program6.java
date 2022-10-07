package Archive;

import java.util.Scanner;

class Program6 {
	public static void main(String[] args) {
		int n0 = 0;
		int n1 = 1, n2 = 1;
		Scanner scanner = new Scanner(System.in);
		int index0 = scanner.nextInt();
		int index1 = scanner.nextInt();
		for (int i = 2; i < index0; i++) {
			n2 = n0 + n1;
			n0 = n1;
			n1 = n2;
		}
		for (int i = 0; i < index1; i++) {
			System.out.print((n2) + "\t");
			n2 = n0 + n1;
			n0 = n1;
			n1 = n2;
		}
	}
}
