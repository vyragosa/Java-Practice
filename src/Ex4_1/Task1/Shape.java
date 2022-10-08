package Ex4_1.Task1;

abstract class Shape {
	protected double perimeter;
	protected String type;
	protected double area;

	public String getType() {
		return type;
	}

	abstract public void getArea();

	;

	abstract public void getPerimeter();

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
