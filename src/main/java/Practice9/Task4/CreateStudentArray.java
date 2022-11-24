package Practice9.Task4;


import java.util.Random;

class CreateStudentArray {
	public static Student[] createArray(int size) {
		Random random = new Random();
		Student[] arr = new Student[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student(random.nextInt(0, 100), random.nextInt(0, 10));
		}
		return arr;
	}
}
