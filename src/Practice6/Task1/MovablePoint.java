package Practice6.Task1;

class MovablePoint implements Movable {
	private int x;
    private int y;
	private final int xSpeed;
	private final int ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
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
				"x=" + x +
				", y=" + y +
				", xSpeed=" + xSpeed +
				", ySpeed=" + ySpeed +
				'}';
	}
}
