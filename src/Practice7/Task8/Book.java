package Practice7.Task8;

class Book implements Printable {
	private final String name;

	Book(String name) {
		this.name = name;
	}


	public static void print(Printable[] printables) {
		for (Printable printable : printables) {
			if (printable instanceof Book) {
				System.out.println(printable);
			}
		}
	}

	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				'}';
	}
}
