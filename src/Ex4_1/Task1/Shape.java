package Ex4_1.Task1;

class Shape {
	public double perimeter;
	protected String type;
	protected double area;

	public String getType() {
		return type;
	}

	public void getArea() {

	}

	;

	public void getPerimeter() {

	}

	;

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{" +
				"type='" + type + '\'' +
				", area=" + area +
				", perimeter=" + perimeter +
				'}';
	}
}
