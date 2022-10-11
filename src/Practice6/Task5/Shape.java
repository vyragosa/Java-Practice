package Practice6.Task5;

abstract class Shape {
	protected String color;
	protected Boolean filled;

	public Shape() {
		this.color = "красный";
		this.filled = true;
	}

	public Shape(String color, Boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean ifFilled() {
		return filled;
	}

	public void setFilled(Boolean filled) {
		this.filled = filled;
	}

	abstract public double getArea();

	abstract public double getPerimeter();

	@Override
	public String toString() {
		return "Shape{" +
				"color='" + color + '\'' +
				", filled=" + filled +
				'}';
	}
}
