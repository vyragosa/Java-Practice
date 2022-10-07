package Ex2.Task4;

class PC {
	String name;

	PC(String name) {
		this.name = name;
	}

	public PC() {
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "PC{name: " + name + "}";
	}
}
