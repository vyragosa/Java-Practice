package Practice4.Task3;

interface OutputDevice {
	default void outputSpec() {
		System.out.println("Устройство вывода");
	}
}
