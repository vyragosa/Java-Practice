package Practice6.Task3;

class Car implements Nameable {
	private String name;

	public Car(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
