package Practice10.Task1;

class Student {
	private final String firstName;
	private final String lastName;
	private final int specialty;
	private final int group;

	public Student(String firstName, String lastName, int specialty, int group, int gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialty = specialty;
		this.group = group;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSpecialty() {
		return specialty;
	}

	public int getGroup() {
		return group;
	}

	@Override
	public String toString() {
		return "Student{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", specialty=" + specialty +
				", group=" + group +
				'}';
	}

}
