package Practice4_1.Task5;

class Reader {
	private final String name;
	private int readerID;
	private String faculty;
	private String dateOfBirth;
	private int phoneNumber;

	public Reader(String name) {
		this.name = name;
	}

	public void takeBook(int numberOfBooks) {
		System.out.println(name + " взял " + numberOfBooks + " книгу(и)");
	}

	public void takeBook(String... nameOfBooks) {
		System.out.println(name + " взял книгу(и):");
		for (String nameOfBook : nameOfBooks) {
			System.out.println(nameOfBook + ",");
		}
	}

	public void takeBook(Book... books) {
		System.out.println(name + " взял книгу(и):");
		for (Book book : books) {
			System.out.println(book.getName() + ",");
		}
	}

	public void returnBook(int numberOfBooks) {
		System.out.println(name + " вернул " + numberOfBooks + " книгу(и)");
	}

	public void returnBook(String... nameOfBooks) {
		System.out.println(name + " вернул книгу(и):");
		for (String nameOfBook : nameOfBooks) {
			System.out.println(nameOfBook + ",");
		}
	}

	public void returnBook(Book... books) {
		System.out.println(name + " вернул книгу(и):");
		for (Book book : books) {
			System.out.println(book.getName() + ",");
		}
	}
}
