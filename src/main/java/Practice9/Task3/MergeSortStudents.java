package Practice9.Task3;


import java.util.Comparator;
import java.util.Random;

class MergeSortStudents implements Comparator<Student> {

	public static Student[] createArray(int size) {
		Random random = new Random();
		Student[] arr = new Student[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student(random.nextInt(0, 100), random.nextInt(0, 10));
		}
		return arr;
	}

	public static Student[] mergeSort(Student[] l, Student[] r) {
		mergeSort(l, l.length);
		mergeSort(r, r.length);
		Student[] a = new Student[l.length + r.length];
		merge(a, l, r, l.length, r.length);
		return a;
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
		Comparator<Student> comparator = new MergeSortStudents();
		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (comparator.compare(l[i], r[j]) <= 0) {
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
		return o1.getIDNumber() - o2.getIDNumber();
	}

}
