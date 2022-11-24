package Practice6.Task5;

class Main {
	public static void main(String[] args) {
		Movable shape;
		System.out.println(shape = new MovableCircle(1, 3, 13, 2, 3));
		shape.moveUp();
		System.out.println(shape);
	}
}
