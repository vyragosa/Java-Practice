package Practice29;

public class CircularLinkedList<T> {
	private static class Node<T> {
		private Node<T> next;
		private T item;
	}

	int size;
	private Node<T> head;
	private Node<T> tail;

	public CircularLinkedList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	public void add(T element) {
		Node<T> node = new Node<>();
		node.item = element;
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
	}

	public T get(int index) {
		Node<T> node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node.item;
	}

	public boolean remove(String name) {
		Node<T> node = head;
		for (int i = 0; i < size; i++) {
			if (node.item.equals(name)) {
				node = node.next;
				size--;
				return true;
			}
		}
		return false;
	}

	public void remove(int index) {
		Node<T> node = head;
		for (int i = 0; i < index - 1; i++) {
			node = node.next;
		}
		node.next = node.next.next;
	}

	public void print() {
		Node<T> node = head;
		for (int i = 0; i < size; i++) {
			System.out.println(node.item);
			node = node.next;
		}
	}

	public T[] toArray() {
		T[] array = (T[]) new Object[size];
		Node<T> node = head;
		for (int i = 0; i < size; i++) {
			array[i] = node.item;
			node = node.next;
		}
		return array;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<T> node = head;
		for (int i = 0; i < size; i++) {
			sb.append(node.item).append(", ");
			node = node.next;
		}
		return String.valueOf(sb);
	}
}
