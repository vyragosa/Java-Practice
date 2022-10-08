package Ex4_1.Task9;

abstract class Furniture {
	private String name;

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
