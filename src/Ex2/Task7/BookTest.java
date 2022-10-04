package Ex2.Task7;

public class BookTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        System.out.println(bookshelf.toString());
        System.out.println("Min element:" + bookshelf.getMin());
        System.out.println("Max element:" + bookshelf.getMax());
        bookshelf.sort();
        System.out.println("Sorted: " + bookshelf.toString());
    }
}
