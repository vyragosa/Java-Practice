package Practice17.Task1;

public class StudentController {
	private Student model;
	private StudentView view;

	StudentController(Student student){
		model = student;
		view = new StudentView();
	}

	public void setStudentName(String name){
		model.setName(name);
	}

	public String getStudentName(){
		return model.getName();
	}

	public void setStudentRollNo(String rollNo){
		model.setRollNo(rollNo);
	}

	public String getStudentRollNo(String rollNo){
		return model.getRollNo();
	}

	public void updateView(){
		view.printStudentDetails(model.getName(),model.getRollNo());
	}
}
