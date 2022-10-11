package Practice6.Task3;

class Animal implements Nameable {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
