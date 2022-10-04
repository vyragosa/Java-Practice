package Ex3.Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10, 100);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				System.out.println("Sequence is not ascending");
				return;
			}
			System.out.println("Sequence is ascending");
		}


	}
}
