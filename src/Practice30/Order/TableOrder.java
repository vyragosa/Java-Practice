package Practice30.Order;

import Practice30.CustomerInfo.Customer;
import Practice30.Expressions.IllegalTableNumber;
import Practice30.Menu.Item;

import java.util.Arrays;
import java.util.Comparator;

public class TableOrder implements Order {
	private Customer customer;
	private final Item[] items;
	private int size;

	public TableOrder(int size) {
		this.items = new Item[size];
		this.size = 0;
		customer = null;
	}
	@Override
	public boolean add(Item item) throws IllegalTableNumber {
		if(size == items.length) {
			throw new IllegalTableNumber();
		}
		items[size++] = item;
		return true;
	}

	@Override
	public String[] itemsNames() {
		String[] names = new String[size];
		for (int i = 0; i < size; i++) {
			names[i] = items[i].getName();
		}
		return names;
	}

	@Override
	public int itemsQuantity() {
		return size;
	}

	@Override
	public int itemQuantity(String name) {
		int quantity = 0;
		for (int i = 0; i < size; i++) {
			if (items[i].getName().equals(name)) {
				quantity++;
			}
		}
		return quantity;
	}

	@Override
	public Item[] getItems() {
		return Arrays.copyOf(this.items, size);
	}

	@Override
	public boolean remove(String name) throws IllegalTableNumber {
		for (int i = 0; i < size; i++) {
			if (items[i].getName().equals(name)) {
				for (int j = i; j < size - 1; j++) {
					items[j] = items[j + 1];
				}
				if(--size < 0) {
					throw new IllegalTableNumber();
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean remove(Item item) throws IllegalTableNumber {
		for (int i = 0; i < size; i++) {
			if (items[i].equals(item)) {
				for (int j = i; j < size - 1; j++) {
					items[j] = items[j + 1];
				}
				if(--size < 0) {
					throw new IllegalTableNumber();
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean removeAll(String name) throws IllegalTableNumber {
		for (int i = 0; i < size; i++) {
			if (items[i].getName().equals(name)) {
				for (int j = i; j < size - 1; j++) {
					items[j] = items[j + 1];
				}
				if(--size < 0) {
					throw new IllegalTableNumber();
				}
			}
		}
		return true;
	}

	@Override
	public boolean removeAll(Item item) throws IllegalTableNumber {
		for (int i = 0; i < size; i++) {
			if (items[i].equals(item)) {
				for (int j = i; j < size - 1; j++) {
					items[j] = items[j + 1];
				}
				if(--size < 0) {
					throw new IllegalTableNumber();
				}
			}
		}
		return true;
	}

	@Override
	public double costTotal() {
		double total = 0;
		for (int i = 0; i < size; i++) {
			total += items[i].getPrice();
		}
		return total;
	}

	@Override
	public Item[] sortedItemsByCostDesc() {
		Item[] items = new Item[size];
		System.arraycopy(this.items, 0, items, 0, size);
		Arrays.sort(items, Comparator.reverseOrder());
		return items;
	}

	@Override
	public Customer getCustomer() {
		if(customer == null) {
			return Customer.getNotMatureUnknownCustomer();
		}
		return customer;
	}

	@Override
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
