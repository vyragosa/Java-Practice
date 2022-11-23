package Practice30.Menu;

import Practice30.Expressions.IllegalAlcoholicVol;

public final class Drink extends MenuItem implements Item, Alcoholable {
	private final double alcoholVol;
	private final DrinkTypeEnum type;

	public Drink(String name, double price, String description, DrinkTypeEnum type, double alcoholVol) throws IllegalAlcoholicVol {
		super(name, price, description);
		if (alcoholVol < 0) {
			throw new IllegalAlcoholicVol("Alcohol volume cannot be negative");
		}
		this.alcoholVol = alcoholVol;
		this.type = type;
	}

	public Drink(String name, double price, String description, DrinkTypeEnum type) throws IllegalAlcoholicVol {
		this(name, price, description, type, type.getDefaultAlcoholVol());
	}

	@Override
	public boolean isAlcoholicDrink() {
		return alcoholVol > 0;
	}

	@Override
	public double getAlcoholVol() {
		return alcoholVol;
	}

	public DrinkTypeEnum getType() {
		return type;
	}
}
