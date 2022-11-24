package Practice6.Task5;

class MovablePoint extends Point implements Movable {
	protected int xSpeed;
	protected int ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	@Override
	public void moveUp() {
		x += xSpeed;
	}

	@Override
	public void moveDown() {
		x -= xSpeed;
	}

	@Override
	public void moveLeft() {
		y -= ySpeed;
	}

	@Override
	public void moveRight() {
		y += ySpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint{" +
				"xSpeed=" + xSpeed +
				", ySpeed=" + ySpeed +
				", x=" + x +
				", y=" + y +
				'}';
	}
}
