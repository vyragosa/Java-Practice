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
			while (j >= 0 && IDnumber[j].getIDNumber() > key.getIDNumber()) {
				IDnumber[j + 1] = IDnumber[j];
				j = j - 1;
			}
			IDnumber[j + 1] = key;
		}
		return IDnumber;
	}
}
