package Practice31.Model.OrderManager;

import Practice31.Model.Expressions.IllegalTableNumber;
import Practice31.Model.Menu.Item;
import Practice31.Model.Order.Order;

import java.util.Arrays;

public class TableOrdersManager implements OrdersManager {
	Order[] orders;
	int size;

	public TableOrdersManager(int size) {
		orders = new Order[size];
		this.size = size;
	}

	public void add(Order order, int tableNumber) throws IllegalTableNumber {
		if (tableNumber > size) {
			throw new IllegalTableNumber();
		}
		orders[tableNumber] = order;
	}

	public void addItem(Item item, int tableNumber) throws IllegalTableNumber {
		if (tableNumber > size) {
			throw new IllegalTableNumber();
		}
		orders[tableNumber].add(item);
	}

	public int freeTableNumber() {
		for (int i = 0; i < size; i++) {
			if (orders[i] == null) {
				return i;
			}
		}
		return -1;
	}

	public int[] freeTableNumbers() {
		int[] freeTables = new int[size];
		int freeTablesSize = 0;
		for (int i = 0; i < size; i++) {
			if (orders[i] == null) {
				freeTables[freeTablesSize++] = i;
			}
		}
		return Arrays.copyOf(freeTables, freeTablesSize);
	}

	public Order getOrder(int tableNumber) throws IllegalTableNumber {
		if (tableNumber > size) {
			throw new IllegalTableNumber();
		}
		return orders[tableNumber];
	}

	public void remove(int tableNumber) throws IllegalTableNumber {
		if (tableNumber > size) {
			throw new IllegalTableNumber();
		}
		orders[tableNumber] = null;
	}

	public int remove(Order order) {
		for (int i = 0; i < size; i++) {
			if (orders[i] == order) {
				orders[i] = null;
				return i;
			}
		}
		return -1;
	}

	public int removeAll(Order order) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (orders[i] == order) {
				orders[i] = null;
				count++;
			}
		}
		return count;
	}

	@Override
	public int itemsQuantity(String itemName) {
		int quantity = 0;
		for (int i = 0; i < size; i++) {
			quantity += orders[i].itemQuantity(itemName);
		}
		return quantity;
	}

	@Override
	public int itemsQuantity(Item item) {
		int quantity = 0;
		for (int i = 0; i < size; i++) {
			quantity += orders[i].itemQuantity(item.getName());
		}
		return quantity;
	}

	@Override
	public Order[] getOrders() {
		return orders;
	}

	@Override
	public int ordersCostSummary() {
		int summary = 0;
		for (int i = 0; i < size; i++) {
			summary += orders[i].costTotal();
		}
		return summary;
	}

	@Override
	public int ordersQuantity() {
		return size;
	}

	@Override
	public String toString() {
		return "TableOrdersManager{" +
				"orders=" + Arrays.toString(orders) +
				", size=" + size +
				'}';
	}
}
