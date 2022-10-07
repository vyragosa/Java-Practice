package Ex4.Task4;

public class Computer {
	private final Memory memory;
	private final Monitor monitor;
	private final Processor processor;

	public Computer(String memory, String monitor, String processor) {
		this.memory = new Memory(memory);
		this.monitor = new Monitor(monitor);
		this.processor = new Processor(processor);
	}

	@Override
	public String toString() {
		return "memory=" + memory +
				", monitor=" + monitor +
				", processor=" + processor;
	}
}
