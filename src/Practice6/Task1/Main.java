package Practice6.Task1;

class Main {
	public static void main(String[] args) {
		Movable figure = new MovablePoint(4, 3, 5, 6);
		figure.moveRight();
		figure.moveUp();
		System.out.println(figure);
		figure = new MovableCircle(1, 2, 15, 15, 6);
		figure.moveRight();
		figure.moveRight();
		figure.moveLeft();
		figure.moveDown();
		System.out.println(figure);
	}
}
