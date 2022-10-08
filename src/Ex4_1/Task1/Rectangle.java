package Ex4_1.Task1;

class Rectangle extends Shape {
	private final double width;
	private final double height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.type = "Прямоугольник";
	}


	@Override
	public void getArea() {
		this.area = height * width;
	}

	@Override
	public void getPerimeter() {
		this.perimeter = height * 2 + width * 2;
	}
}
