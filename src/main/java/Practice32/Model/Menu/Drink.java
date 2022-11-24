package Practice32.Model.Menu;

import java.io.Serializable;

public final class Drink extends MenuItem implements Item, Alcoholable, Serializable {
	private final double alcoholVol;
	private final DrinkTypeEnum type;

	public Drink(double price, String name, String description, DrinkTypeEnum type, double alcoholVol) {
		super(name, price, description);
		this.alcoholVol = alcoholVol;
		this.type = type;
	}

	public Drink(String name, double price, String description, DrinkTypeEnum type) {
		this(price, name, description, type, type.getDefaultAlcoholVol());
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

	@Override
	public String toString() {
		return super.toString() + (isAlcoholicDrink() ? ", Крепость='" + alcoholVol + '\'' : "") + ", Тип='" + type.getName() + '\'';
	}
}
