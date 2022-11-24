package Practice19.Task2;

class Student {

	private final String firstName;
	private final String secondName;
	private final String speciality;
	private final int course;
	private final String group;
	private final int GPAScore;


	public Student(String firstName, String secondName, String speciality, Integer course, String group, Integer GPAScore) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.speciality = speciality;
		this.course = course;
		this.group = group;
		this.GPAScore = GPAScore;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public int getCourse() {
		return course;
	}

	public String getGroup() {
		return group;
	}

	public int getGPAScore() {
		return GPAScore;
	}

	@Override
	public String toString() {
		return String.join(", ", firstName, secondName, speciality, String.valueOf(course), group, String.valueOf(GPAScore));
	}
}
