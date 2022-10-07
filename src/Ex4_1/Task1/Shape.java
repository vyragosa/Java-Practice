package Ex4_1.Task1;

class Shape {
	protected String type;
	protected double area;
	public double perimeter;
	public String getType() {
		return type;
	}
	public void getArea() {

	};
	public void  getPerimeter() {

	};

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{" +
				"type='" + type + '\'' +
				", area=" + area +
				", perimeter=" + perimeter +
				'}';
	}
}
