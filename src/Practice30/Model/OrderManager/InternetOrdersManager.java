package Practice30.Model.OrderManager;

import Practice30.Model.Menu.Item;
import Practice30.Model.Order.Order;

public class InternetOrdersManager implements OrdersManager {
	private class QueueNode {
		Order order;
		QueueNode next;
		QueueNode prev;

		public QueueNode(Order order) {
			this.order = order;
		}
	}

	private QueueNode head;
	private QueueNode tail;
	private int size;

	public InternetOrdersManager() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public boolean add(Order order) {
		QueueNode node = new QueueNode(order);
		if (head == null) {
			head = node;
			tail = node;
			node.next = head;
			node.prev = tail;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
			tail.next = head;
			head.prev = tail;
		}
		size++;
		return true;
	}

	public Order remove() {
		if (head == null) {
			return null;
		}
		QueueNode node = head;
		head = head.next;
		head.prev = tail;
		tail.next = head;
		size--;
		return node.order;
	}

	@Override
	public int itemsQuantity(String itemName) {
		int quantity = 0;
		QueueNode node = head;
		for (int i = 0; i < size; i++) {
			quantity += node.order.itemQuantity(itemName);
			node = node.next;
		}
		return quantity;
	}

	@Override
	public int itemsQuantity(Item item) {
		int quantity = 0;
		QueueNode node = head;
		for (int i = 0; i < size; i++) {
			quantity += node.order.itemQuantity(item.getName());
			node = node.next;
		}
		return quantity;
	}

	@Override
	public Order[] getOrders() {
		Order[] orders = new Order[size];
		QueueNode node = head;
		for (int i = 0; i < size; i++) {
			orders[i] = node.order;
			node = node.next;
		}
		return orders;
	}

	@Override
	public int ordersCostSummary() {
		int cost = 0;
		QueueNode node = head;
		for (int i = 0; i < size; i++) {
			cost += node.order.costTotal();
			node = node.next;
		}
		return cost;
	}

	@Override
	public int ordersQuantity() {
		return size;
	}

	@Override
	public String toString() {
		return "InternetOrdersManager{" +
				"head=" + head +
				", tail=" + tail +
				", size=" + size +
				'}';
	}
}
