package Practice17.Task2;

public class Employee {
	private String name;
	private int workHours;
	private double coefficient;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public double getSalary() {
		return coefficient * workHours;
	}
}
