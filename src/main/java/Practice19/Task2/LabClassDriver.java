package Practice19.Task2;

import java.util.ArrayList;

class LabClassDriver {
	public static void main(String[] args) {
		new LabClassUI(getStudentList());
	}

	public static ArrayList<Student> getStudentList() {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Иван", "Иванов", "09.03.04", 1, "ИКБО-02-22", 4));
		students.add(new Student("Смирнов", "Никита", "09.03.03", 2, "ИНБО-07-21", 5));
		return students;
	}
}
