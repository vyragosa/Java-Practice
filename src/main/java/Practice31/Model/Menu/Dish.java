package Practice31.Model.Menu;

public final class Dish extends MenuItem implements Item {

	public Dish(double price, String name, String description) {
		super(name, price, description);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
