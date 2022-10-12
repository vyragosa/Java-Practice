package Practice9.Task4;

class Student implements Comparable<Student> {
	private final int IDNumber;
	private final int GBA;

	public Student(int IDNumber, int GBA) {
		this.IDNumber = IDNumber;
		this.GBA = GBA;
	}

	@Override
	public int compareTo(Student o) {
		return this.IDNumber - o.IDNumber;
	}

	@Override
	public String toString() {
		return "Student{" +
				"IDNumber=" + IDNumber +
				", GBA=" + GBA +
				'}';
	}
}
