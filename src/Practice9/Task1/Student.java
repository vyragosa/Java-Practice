package Practice9.Task1;

class Student {
	private final int IDNumber;

	public Student(int IDNumber) {
		this.IDNumber = IDNumber;
	}

	public int getIDNumber() {
		return IDNumber;
	}


	@Override
	public String toString() {
		return "Student{" +
				"IDNumber=" + IDNumber +
				'}';
	}
}
