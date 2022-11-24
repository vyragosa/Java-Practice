package Practice6.Task2;

class Main {
	public static void main(String[] args) {
		Movable figure = new MovableRectangle(4, 3, 5, 6, 11, 15);
		figure.moveRight();
		figure.moveRight();
		figure.moveLeft();
		figure.moveDown();
		System.out.println(figure);
	}
}
