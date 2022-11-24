package Practice9.Task2;


import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Student[] arr = SortingStudentsByGPA.createArray(10);
		System.out.println(Arrays.toString(arr));
		SortingStudentsByGPA.quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
