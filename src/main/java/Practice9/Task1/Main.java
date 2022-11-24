package Practice9.Task1;

import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Student[] arr = SortByID.createArray(10);
		System.out.println(Arrays.toString(arr));
		SortByID.insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
