package Practice29;

import java.util.Arrays;
import java.util.Comparator;

class InternetOrder implements Order {
	private CircularLinkedList<Item> items;

	InternetOrder() {
		items = new CircularLinkedList<>();
	}

	InternetOrder(Item[] item) {
		super();
		for (Item t : item) {
			items.add(t);
		}
	}


	@Override
	public boolean add(Item item) {
		items.add(item);
		return true;
	}

	@Override
	public boolean remove(String name) {
		return items.remove(name);
	}

	@Override
	public boolean removeAll() {
		items = new CircularLinkedList<>();
		return true;
	}

	@Override
	public int getQuantity() {
		return items.size;
	}

	@Override
	public Item[] getItems() {
		return items.toArray();
	}

	@Override
	public double getCostTotal() {
		double total = 0;
		for (int i = 0; i < items.size; i++) {
			total += items.get(i).getPrice();
		}
		return total;
	}

	@Override
	public int getQuantity(String name) {
		int count = 0;
		for (int i = 0; i < items.size; i++) {
			if (items.get(i).getName().equals(name)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public Item[] getNoRepeatsItems(String name) {
		return (Item[]) Arrays.stream(items.toArray()).distinct().toArray();
	}

	@Override
	public Item[] getSortedItemsByCost() {
		Item[] items = this.items.toArray();
		Arrays.sort(items, Comparator.reverseOrder());
		return items;
	}

	@Override
	public String toString() {
		return "InternetOrder{" +
				"items=" + items +
				'}';
	}
}