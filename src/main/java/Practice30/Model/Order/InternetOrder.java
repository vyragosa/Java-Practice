package Practice30.Model.Order;

import Practice30.Model.CustomerInfo.Customer;
import Practice30.Model.Expressions.IllegalTableNumber;
import Practice30.Model.Menu.Item;

import java.util.Arrays;
import java.util.Comparator;

public class InternetOrder implements Order {
	private Customer customer;
	private ListNode head;
	private ListNode tail;
	private int size;
	public InternetOrder() {
		this.head = null;
		this.tail = null;
		this.size = 0;
		this.customer = null;
	}

	@Override
	public boolean add(Item item) throws IllegalTableNumber {
		ListNode node = new ListNode();
		node.value = item;
		if (head == null) {
			head = node;
			tail = node;
			node.next = head;
		} else {
			tail.next = node;
			tail = node;
			tail.next = head;
		}
		size++;
		return true;
	}

	@Override
	public String[] itemsNames() {
		String[] names = new String[size];
		ListNode node = head;
		for (int i = 0; i < size; i++) {
			names[i] = node.value.getName();
			node = node.next;
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
		ListNode node = head;
		for (int i = 0; i < size; i++) {
			if (node.value.getName().equals(name)) {
				quantity++;
			}
			node = node.next;
		}
		return quantity;
	}

	@Override
	public Item[] getItems() {
		Item[] items = new Item[size];
		ListNode node = head;
		for (int i = 0; i < size; i++) {
			items[i] = node.value;
			node = node.next;
		}
		return items;
	}

	@Override
	public boolean remove(String name) throws IllegalTableNumber {
		ListNode node = head;
		ListNode prev = null;
		for (int i = 0; i < size; i++) {
			if (node.value.getName().equals(name)) {
				return deleteNode(node, prev);
			}
			prev = node;
			node = node.next;
		}
		return false;
	}

	@Override
	public boolean remove(Item item) throws IllegalTableNumber {
		ListNode node = head;
		ListNode prev = null;
		for (int i = 0; i < size; i++) {
			if (node.value.getName().equals(item.getName())) {
				return deleteNode(node, prev);
			}
			prev = node;
			node = node.next;
		}
		return false;
	}

	private boolean deleteNode(ListNode node, ListNode prev) {
		if (size == 1) {
			head = null;
			tail = null;
		} else if (prev == null) {
			head = node.next;
			tail.next = head;
		} else if (node == tail) {
			tail = prev;
			tail.next = head;
		} else if (node == head) {
			head = node.next;
			tail.next = head;
		} else {
			prev.next = node.next;
		}
		size--;
		return true;
	}

	@Override
	public boolean removeAll(String name) throws IllegalTableNumber {
		ListNode node = head;
		ListNode prev = null;
		boolean removed = false;
		for (int i = 0; i < size; i++) {
			if (node.value.getName().equals(name)) {
				removed = deleteNode(node, prev);
			}
			prev = node;
			node = node.next;
		}
		return removed;
	}

	@Override
	public boolean removeAll(Item item) throws IllegalTableNumber {
		ListNode node = head;
		ListNode prev = null;
		boolean removed = false;
		for (int i = 0; i < size; i++) {
			if (node.value.getName().equals(item.getName())) {
				removed = deleteNode(node, prev);
			}
			prev = node;
			node = node.next;
		}
		return removed;
	}

	@Override
	public double costTotal() {
		double total = 0;
		ListNode node = head;
		for (int i = 0; i < size; i++) {
			total += node.value.getPrice();
			node = node.next;
		}
		return total;
	}

	@Override
	public Item[] sortedItemsByCostDesc() {
		Item[] items = getItems();
		Arrays.sort(items, Comparator.reverseOrder());
		return items;
	}

	@Override
	public Customer getCustomer() {
		if (customer == null) {
			return Customer.getNotMatureUnknownCustomer();
		}
		return customer;
	}

	@Override
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	@Override
	public String toString() {
		return "InternetOrder{" +
				"customer=" + customer +
				", head=" + head +
				", tail=" + tail +
				", size=" + size +
				'}';
	}

	private class ListNode {
		ListNode next;
		Item value;
	}
}