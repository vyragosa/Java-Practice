package Ex4_1.Task8;

class Rectangle extends Shape {
	private final double width;
	protected double length;

	Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle() {
		super();
		width = 10;
		length = 5;
	}

	public Rectangle(String color, Boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	@Override
	public double getArea() {
		return width * length;
	}

	@Override
	public double getPerimeter() {
		return width * 2 + length * 2;
	}

	@Override
	public String toString() {
		return "Rectangle{" +
				"width=" + width +
				", length=" + length +
				", color='" + color + '\'' +
				", filled=" + filled +
				", perimeter=" + getPerimeter() +
				", area=" + getArea() +
				'}';
	}
}
