package Practice17.Task1;

class MVCPatternDemo {
	public static void main(String[] args) {
		StudentController controller = new StudentController(retreiveStudentFromDatabase());
		controller.updateView();
	}

	public static Student retreiveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Иван");
		student.setRollNo("???");
		return student;
	}
}
