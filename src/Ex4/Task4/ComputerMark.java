package Ex4.Task4;

public enum ComputerMark {
	MARK1("Memory1", "Monitor1", "Processor1"),
	MARK2("Memory2", "Monitor2", "Processor2"),
	MARK3("Memory3", "Monitor3", "Processor3");
	private final Computer computer;
	ComputerMark(String memory, String monitor, String processor) {
		this.computer = new Computer(memory, monitor, processor);
	}

	@Override
	public String toString() {
		return this.name() + "{" + computer + "}";
	}
}
