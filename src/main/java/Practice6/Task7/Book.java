package Practice6.Task7;

class Book implements Printable {
	private final String name;

	Book(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println(name);
	}
}
