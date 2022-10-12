package Practice9.Task1;

import java.util.Random;

class SortByID {

	static Student[] createArray(int size) {
		Random random = new Random();
		Student[] IDnumber = new Student[size];
		for (int i = 0; i < IDnumber.length; i++) {
			IDnumber[i] = new Student(random.nextInt(0, 100));
		}
		return IDnumber;
	}

	static Student[] insertionSort(Student[] IDnumber) {
		int n = IDnumber.length;
		for (int i = 1; i < n; ++i) {
			Student key = IDnumber[i];
			int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
			while (j >= 0 && IDnumber[j].getIDNumber() > key.getIDNumber()) {
				IDnumber[j + 1] = IDnumber[j];
				j = j - 1;
			}
			IDnumber[j + 1] = key;
		}
		return IDnumber;
	}
}
