package Ex3.Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Program4 {
	public static void main(String[] args) {
		final int fix_size = 100;
		int n, secondSize = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter size of array");
			n = scanner.nextInt();
		} while (n >= fix_size);
		Random random = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(n);
			if (arr[i] % 2 == 0) {
				secondSize++;
			}

		}
		System.out.println(Arrays.toString(arr));
		int j = 0;
		int[] newArr = new int[secondSize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(n);
			if (arr[i] % 2 == 0) {
				newArr[j++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
}
