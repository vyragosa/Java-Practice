package Practice26;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

class HashTable<K, V> {
	private Queue<Node>[] table;
	private int capacity;

	private static class Node<K, V> {
		private K key;
		private V data;

		public Node(K key, V data) {
			this.key = key;
			this.data = data;
		}

		@Override
		public String toString() {
			return "[" +
					key + ',' +
					data +
					']';
		}

	}

	public void init(int size) {
		table = new Queue[size];
	}

	private int hash(K key) {
		return key.hashCode() % table.length;
	}

	public void add(K key, V value) {
		if (++capacity / (double) table.length > 0.75)
			rehash();
		int index = hash(key);
		if (table[index] == null) {
			table[index] = new LinkedList<>();
		}
		table[index].add(new Node<>(key, value));
	}

	private void rehash() {
		Queue<Node>[] oldTable = table;
		table = new Queue[table.length * 2];
		capacity = 0;
		for (Queue<Node> nodes : oldTable) {
			if (nodes != null) {
				for (Node node : nodes) {
					add((K) node.key, (V) node.data);
				}
			}
		}
	}

	public String get(K key) {
		return table[hash(key)].stream()
				.filter(node -> Objects.equals(node.key, key))
				.findFirst()
				.map(node -> node.data.toString())
				.orElse(null);
	}

	public void erase(K key) {
		table[hash(key)].stream()
				.filter(node -> Objects.equals(node.key, key))
				.findFirst()
				.ifPresent(node -> table[hash(key)].remove(node));
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null)
				stringBuilder.append(i).append(" : ").append(table[i]).append('\n');
		}
		return stringBuilder.toString();
	}
}