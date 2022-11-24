package Practice6.Task10;

enum ComputerMark {
	MARK1("Mark1"),
	MARK2("Mark2"),
	MARK3("Mark3");

	private final String name;

	ComputerMark(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "ComputerMark{" +
				"name='" + name + '\'' +
				'}';
	}
}
