package Practice7.Task8;

class Magazine implements Printable {
	private final String name;

	Magazine(String name) {
		this.name = name;
	}


	public static void print(Printable[] printables) {
		for (Printable printable : printables) {
			if (printable instanceof Magazine) {
				System.out.println(printable);
			}
		}
	}

	@Override
	public String toString() {
		return "Magazine{" +
				"name='" + name + '\'' +
				'}';
	}
}
