package Ex4_1.Task1;

class Square extends Shape {
	private final double side;

	Square(double side) {
		this.side = side;
		this.type = "Квадрат";
	}

	@Override
	public void getArea() {
		this.area = side * side;
	}

	@Override
	public void getPerimeter() {
		this.perimeter = side * 4.;
	}
}
