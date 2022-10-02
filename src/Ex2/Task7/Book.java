package Ex2.Task7;

public class Book {
	private String name;
	private int year;
	public Book(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Book{name: " + name + ", year: " + year + "}";
	}
}
