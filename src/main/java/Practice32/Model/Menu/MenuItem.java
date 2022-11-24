package Practice32.Model.Menu;

import java.io.Serializable;

public abstract class MenuItem implements Item, Serializable {
	private final String name;
	private final double price;
	private final String description;

	public MenuItem(String name, double price, String description) {
		if(name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be null or empty");
		}
		if(price < 0) {
			throw new IllegalArgumentException("Price cannot be negative");
		}
		if(description == null || description.isEmpty()) {
			throw new IllegalArgumentException("Description cannot be null or empty");
		}
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Название='" + name + '\'' + ", Цена=" + price + "рублей, Доп. информация='" + description + '\'';
	}

	@Override
	public int compareTo(Item o) {
		return (int) (price - o.getPrice());
	}
}
