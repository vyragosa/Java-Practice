package Practice17.Task2;

class EmployeeController {
	private final Employee model;
	private final EmployeeView view;

	public EmployeeController() {
		this.model = new Employee();
		view = new EmployeeView();
	}

	public String getName() {
		return model.getName();
	}

	public void setName(String name) {
		this.model.setName(name);
	}

	public int getWorkHours() {
		return model.getWorkHours();
	}

	public void setWorkHours(int workHours) {
		this.model.setWorkHours(workHours);
	}

	public double getCoefficient() {
		return model.getCoefficient();
	}

	public void setCoefficient(double coefficient) {
		this.model.setCoefficient(coefficient);
	}

	public void updateView() {
		view.displayDataEmployee(model.getName(), model.getSalary());
	}
}
