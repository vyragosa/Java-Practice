package Ex4_1.Task1;

class Rectangle extends Shape {
	private final double side;

	Rectangle(double side) {
		this.side = side;
		this.type = "Треугольник";
	}


	@Override
	public void getArea() {
		this.area = (side * side * Math.sqrt(3.)) / 4.;
	}

	@Override
	public void getPerimeter() {
		this.perimeter = side * 3.;
	}
}
