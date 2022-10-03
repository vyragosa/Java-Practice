package Ex2.Task3;

public class Circle {
	private Point point;

	public Circle(double x, double y) {
		point = new Point(x, y);

	}

	public Circle() {
		point = new Point(0, 0);
	}

	public void setXY(double x, double y) {
		point.setX(x);
		point.setY(y);
	}

	public void move(double xDisp, double yDisp) {
		point.setX(point.getX() + xDisp);
		point.setY(point.getY() + yDisp);
	}

	@Override
	public String toString() {
		return "Circle{x: " + point.getX() + ", y: " + point.getY() + "}";
	}
}
