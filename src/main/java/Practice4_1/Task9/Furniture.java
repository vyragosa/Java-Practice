package Practice4_1.Task9;

abstract class Furniture {
	private final String name;

	public Furniture(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{" +
				"name='" + name + '\'' +
				'}';
	}
}
