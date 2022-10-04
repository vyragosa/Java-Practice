package Ex3.Task4;

public class Employee {
	private String fullName;
	private double salary;

	public Employee(String fullName, double salary) {
		this.fullName = fullName;
		this.salary = salary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
