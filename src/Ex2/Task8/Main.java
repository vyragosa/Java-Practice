package Ex2.Task8;
import java.util.Arrays;
import java.util.Collections;

import java.util.Scanner;

public class Main {
	public static String reverse(String[] arr) {
		for(int i = 0; i < arr.length / 2; i++)
		{
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return Arrays.toString(arr);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		String[] arr = new String[scanner.nextInt()];
		for(int i = 0; i < arr.length; i++)
			arr[i] = scanner.next();
		System.out.println(Arrays.toString(arr));

		//Collections.reverse(Arrays.asList(arr));
		System.out.println(reverse(arr));
	}
}
