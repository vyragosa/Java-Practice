package Practice6.Task9;

class Magazine implements Printable {
	private final String name;

	Magazine(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println(name);
	}
}
