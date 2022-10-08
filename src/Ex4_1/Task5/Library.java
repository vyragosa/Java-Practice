package Ex4_1.Task5;

public class Library {
	private Reader[] reader;
	private Book[] book;

	public Library() {
		this.reader = new Reader[]{
				new Reader("Иванов"),
				new Reader("Петров"),
				new Reader("Сидоров")
		};
		this.book = new Book[]{
				new Book("Приключения"),
				new Book("Словарь"),
				new Book("Энциклопедия")
		};
	}

	public void build() {
		reader[0].takeBook(3);
		reader[1].takeBook("Приключения", "Словарь", "Энциклопедия");
		reader[2].takeBook(book[0], book[1], book[2]);
		reader[0].returnBook(3);
		reader[1].returnBook("Приключения", "Словарь", "Энциклопедия");
		reader[2].returnBook(book[0], book[1], book[2]);
	}
}
