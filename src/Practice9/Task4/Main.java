package Practice9.Task4;


import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Student[] arr = CreateStudentArray.createArray(10);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
