package Practice1;

import java.util.Scanner;

class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int l = 0; l < n; l++) {
			arr[l] = scanner.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for (int k : arr) {
			if (k > max)
				max = k;
			if (k < min)
				min = k;
		}
		System.out.println("max: " + max + " min: " + min);

		min = arr[0];
		max = arr[0];
		int i = 0;
		while (i < arr.length) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
			i++;
		}
		System.out.println("max: " + max + " min: " + min);
		min = arr[0];
		max = arr[0];
		i = 0;
		do {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
			i++;
		} while (arr.length != i);
		System.out.println("max: " + max + " min: " + min);
	}
}