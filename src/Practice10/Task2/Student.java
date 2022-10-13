package Practice10.Task2;

class Student implements Comparable<Student> {
	private final String firstName;
	private final String lastName;
	private final int specialty;
	private final int group;
	private final int GPA;

	public Student(String firstName, String lastName, int specialty, int group, int gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialty = specialty;
		this.group = group;
		GPA = gpa;
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
				", GPA=" + GPA +
				'}';
	}

	public int getGPA() {
		return GPA;
	}

	@Override
	public int compareTo(Student o) {
		return this.group - o.group;
	}
}
