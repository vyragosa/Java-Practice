package Practice17.Task1;

class StudentController {
	private final Student model;
	private final StudentView view;

	StudentController(Student student) {
		model = student;
		view = new StudentView();
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getStudentRollNo(String rollNo) {
		return model.getRollNo();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
