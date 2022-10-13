package Practice10.Task2;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

class SortingStudentsByGPA implements Comparator<Student> {
	static private Student[] iDNumber;

	public static void main(String[] args) {
		iDNumber = setArray(5);
		outArray(iDNumber);
		System.out.println("*************************************");
		quickSort(iDNumber, 0, iDNumber.length - 1);
		outArray(iDNumber);
		System.out.println("*************************************");
		mergeSort(iDNumber, iDNumber.length);
		outArray(iDNumber);
	}

	public static Student[] setArray(int size) {
		Student[] iDNumber = new Student[size];
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Enter firstName, lastName of " + size + " students");
		for (int i = 0; i < size; i++) {
			iDNumber[i] = new Student(scanner.next(), scanner.next(), random.nextInt(0, 100),
					random.nextInt(0, 100), random.nextInt(0, 10));
		}
		return iDNumber;
	}

	public static void outArray(Student[] arr) {
		for (Student student : arr) {
			System.out.println(student);
		}
	}


	public static Student[] quickSort(Student[] arr, int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);

			quickSort(arr, begin, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);

		}
		return arr;
	}

	private static int partition(Student[] arr, int begin, int end) {
		Comparator<Student> comparator = new SortingStudentsByGPA();
		Student pivot = arr[end];
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			if (comparator.compare(arr[j], pivot) <= 0) {
				i++;
				Student swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		Student swapTemp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swapTemp;
		return i + 1;
	}

	public static void mergeSort(Student[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		Student[] l = new Student[mid];
		Student[] r = new Student[n - mid];

		System.arraycopy(a, 0, l, 0, mid);
		System.arraycopy(a, mid, r, 0, n - mid);

		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

	public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i].compareTo(r[j]) <= 0) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getGPA() - o1.getGPA();
	}

}
