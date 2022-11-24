package Practice32.Model.Menu;

import java.io.Serializable;

public final class Dish extends MenuItem implements Item, Serializable {

	public Dish(double price, String name, String description) {
		super(name, price, description);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
