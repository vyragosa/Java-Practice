package Practice29;

import java.util.Arrays;
import java.util.Comparator;

public class RestaurantOrder implements Order {
	int size;
	private Item[] items;

	RestaurantOrder(int size) {
		items = new Item[size];
		this.size = 0;
	}

	RestaurantOrder(Item[] items) {
		this.items = items;
		this.size = items.length;
	}

	@Override
	public boolean add(Item item) throws IllegalTableNumber {
		if (size == items.length) {
			throw new IllegalTableNumber();
		}
		items[size++] = item;
		return true;
	}

	@Override
	public boolean remove(String name) throws IllegalTableNumber {
		for (int i = 0; i < size; i++) {
			if (items[i].getName().equals(name)) {
				for (int j = i; j < size - 1; j++) {
					items[j] = items[j + 1];
				}
				if (--size < 0) {
					throw new IllegalTableNumber();
				}
			}
		}
		return true;
	}

	@Override
	public boolean removeAll() {
		size = 0;
		return true;
	}

	@Override
	public int getQuantity() {
		return size;
	}

	@Override
	public Item[] getItems() {
		return Arrays.copyOf(this.items, size);
	}

	@Override
	public double getCostTotal() {
		double total = 0;
		for (int i = 0; i < size; i++) {
			total += items[i].getPrice();
		}
		return total;
	}

	@Override
	public int getQuantity(String name) {
		int quantity = 0;
		for (int i = 0; i < size; i++) {
			if (items[i].getName().equals(name)) {
				quantity++;
			}
		}
		return quantity;
	}

	@Override
	public Item[] getNoRepeatsItems(String name) {
		Item[] items = new Item[size];
		System.arraycopy(this.items, 0, items, 0, size);
		return (Item[]) Arrays.stream(items).distinct().toArray();
	}

	@Override
	public Item[] getSortedItemsByCost() {
		Item[] items = new Item[size];
		System.arraycopy(this.items, 0, items, 0, size);
		Arrays.sort(items, Comparator.reverseOrder());
		return items;
	}

	@Override
	public String toString() {
		return "RestaurantOrder{" +
				"items=" + Arrays.toString(items) +
				", size=" + size +
				'}';
	}
}
