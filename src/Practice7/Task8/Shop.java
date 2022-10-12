package Practice7.Task8;

public class Shop {
	private static final Printable[] shopList = new Printable[]{
			new Book("Книга 1"),
			new Magazine("Журнал 1"),
			new Book("Книга 2"),
			new Book("Журнал 2")
	};
	;

	public static void print() {
		Book.print(shopList);
	}
}
