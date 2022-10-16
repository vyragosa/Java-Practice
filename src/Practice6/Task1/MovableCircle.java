package Practice6.Task1;

class MovableCircle implements Movable {
	private final int radius;
	private final MovablePoint center;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
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
				"radius=" + radius +
				", center=" + center +
				'}';
	}
}
