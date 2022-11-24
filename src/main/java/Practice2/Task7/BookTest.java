package Practice2.Task7;

class BookTest {
	public static void main(String[] args) {
		Bookshelf bookshelf = new Bookshelf();
		System.out.println(bookshelf);
		System.out.println("Min element:" + bookshelf.getMin());
		System.out.println("Max element:" + bookshelf.getMax());
		bookshelf.sort();
		System.out.println("Sorted: " + bookshelf);
	}
}
