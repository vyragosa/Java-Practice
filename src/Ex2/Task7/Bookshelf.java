package Ex2.Task7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bookshelf {
	Book[] arr;
	int bookSize;

	public Bookshelf() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		arr = new Book[bookSize = scanner.nextInt()];
		for (int i = 0; i < bookSize; i++) {
			System.out.println("Enter " + (i + 1) + " book:");
			arr[i] = new Book(scanner.next(), scanner.nextInt());
		}

	}

	public void sort() {
		Arrays.sort(arr, Comparator.comparing(Book::getYear));
	}

	public String getMax() {
		return Arrays.stream(arr).max(Comparator.comparing(Book::getYear)).toString();
	}

	public String getMin() {
		return Arrays.stream(arr).min(Comparator.comparing(Book::getYear)).toString();
	}

	@Override
	public String toString() {
		return Arrays.toString(arr).toString();
	}
}
