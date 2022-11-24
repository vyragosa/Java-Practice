package Practice6.Task8;

class Shop implements Printable {
	private final String name;

	Shop(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println(name);
	}
}
