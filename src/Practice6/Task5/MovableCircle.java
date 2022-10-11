package Practice6.Task5;

class MovableCircle extends Circle implements Movable {
	MovablePoint center;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		super(radius);
		center = new MovablePoint(1, 2, 5, 6);
	}

	@Override
	public void moveUp() {
		this.center.moveUp();
	}

	@Override
	public void moveDown() {
		this.center.moveDown();
	}

	@Override
	public void moveLeft() {
		this.center.moveLeft();
	}

	@Override
	public void moveRight() {
		this.center.moveRight();
	}

	@Override
	public String toString() {
		return "MovableCircle{" +
				"center=" + center +
				", radius=" + radius +
				", color='" + color + '\'' +
				", filled=" + filled +
				'}';
	}
}
