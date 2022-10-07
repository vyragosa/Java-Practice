package Ex4_1.Task1;

class Circle extends Shape {
	private final double radius;

	Circle(double radius) {
		this.radius = radius;
		this.type = "окружность";
	}

	@Override
	public void getArea() {
		this.area = Math.PI * radius * radius;
	}

	@Override
	public void getPerimeter() {
		this.perimeter = 2 * Math.PI * radius;
	}
}
