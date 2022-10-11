package Practice6.Task10;

class Computer {
	private final String name;
	private final Memory memory;
	private final Monitor monitor;
	private final Processor processor;
	private final ComputerMark computerMark;

	public Computer(String name, String memory, String monitor, String processor, ComputerMark computerMark) {
		this.name = name;
		this.memory = new Memory(memory);
		this.monitor = new Monitor(monitor);
		this.processor = new Processor(processor);
		this.computerMark = computerMark;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Computer{" +
				"name='" + name + '\'' +
				", memory=" + memory +
				", monitor=" + monitor +
				", processor=" + processor +
				", computerMark=" + computerMark +
				'}';
	}
}
