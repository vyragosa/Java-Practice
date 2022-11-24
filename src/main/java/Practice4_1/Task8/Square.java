package Practice4_1.Task8;

class Square extends Rectangle {
	Square(double length) {
		this.color = "Красный";
		this.filled = true;
		this.length = length;
	}

	Square() {
		this.color = "Красный";
		this.filled = true;
		this.length = 10;
	}

	Square(double length, String color, Boolean filled) {
		this.color = color;
		this.filled = filled;
		this.length = length;
	}

	@Override
	public double getArea() {
		return length * length;
	}

	@Override
	public double getPerimeter() {
		return length * 4;
	}

	@Override
	public String toString() {
		return "Square{" +
				"length=" + length +
				", color='" + color + '\'' +
				", filled=" + filled +
				", perimeter=" + getPerimeter() +
				", area=" + getArea() +
				'}';
	}
}
