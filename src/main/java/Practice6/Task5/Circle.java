package Practice6.Task5;

class Circle extends Shape {
	protected final double radius;


	Circle() {
		super();
		radius = 5;
	}

	Circle(double radius, String color, Boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle{" +
				"radius=" + radius +
				", color='" + color + '\'' +
				", filled=" + filled +
				'}';
	}
}
