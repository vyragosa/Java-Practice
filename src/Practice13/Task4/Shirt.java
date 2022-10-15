package Practice13.Task4;

class Shirt {
	private final String id;
	private final String name;
	private final String color;
	private final String size;

	public Shirt(String values) {
		String[] array = values.split(",");
		this.id = array[0];
		this.name = array[1];
		this.color = array[2];
		this.size = array[3];
	}

	@Override
	public String toString() {
		return "Shirt{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", color='" + color + '\'' +
				", size='" + size + '\'' +
				'}';
	}
}
