package Practice6.Task2;

class MovableRectangle implements Movable {

	private final MovablePoint topLeft;
	private final MovablePoint topRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		this.topRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	private boolean isMovable() {
		return topLeft.getxSpeed() == topRight.getxSpeed() && topLeft.getySpeed() == topRight.getySpeed();
	}

	@Override
	public void moveUp() {
		if (!isMovable())
			return;
		this.topLeft.moveUp();
		this.topRight.moveUp();
	}

	@Override
	public void moveDown() {
		if (!isMovable())
			return;
		this.topLeft.moveDown();
		this.topRight.moveDown();
	}

	@Override
	public void moveLeft() {
		if (!isMovable())
			return;
		this.topLeft.moveLeft();
		this.topRight.moveLeft();
	}

	@Override
	public void moveRight() {
		if (!isMovable())
			return;
		this.topLeft.moveRight();
		this.topRight.moveRight();
	}

	@Override
	public String toString() {
		return "MovableRectangle{" +
				"a=" + topLeft +
				", b=" + topRight +
				'}';
	}
}
