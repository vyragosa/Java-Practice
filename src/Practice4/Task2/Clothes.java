package Practice4.Task2;

abstract class Clothes {
	private final ClothingSize size;
	private final int cost;
	private final String color;

	Clothes(ClothingSize size, int cost, String color) {
		this.size = size;
		this.cost = cost;
		this.color = color;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{size: " + size + ", cost: " + cost + ", color: " + color + "}";
	}
}
