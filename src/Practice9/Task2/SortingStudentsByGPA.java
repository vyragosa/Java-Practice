package Practice9.Task2;

import java.util.Comparator;
import java.util.Random;

class SortingStudentsByGPA implements Comparator<Student> {

	public static Student[] createArray(int size) {
		Random random = new Random();
		Student[] IDnumber = new Student[size];
		for (int i = 0; i < IDnumber.length; i++) {
			IDnumber[i] = new Student(random.nextInt(0, 100), random.nextInt(0, 10));
		}
		return IDnumber;
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

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getGBA() - o2.getGBA();
	}

}
