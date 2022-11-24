package Practice9.Task2;

class Student {
	private final int IDNumber;
	private final int GBA;

	public Student(int IDNumber, int GBA) {
		this.IDNumber = IDNumber;
		this.GBA = GBA;
	}

	public int getIDNumber() {
		return IDNumber;
	}

	public int getGBA() {
		return GBA;
	}

	@Override
	public String toString() {
		return "Student{" +
				"IDNumber=" + IDNumber +
				", GBA=" + GBA +
				'}';
	}


}
