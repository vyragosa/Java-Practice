package Practice23.Task2;


class ArrayQueueTest {

	public static void main(String[] args) {
		Queue queue = new ArrayQueue();
		fill(queue);
		getArray(queue);
		dump(queue);
		clear(queue);
	}

	public static void fill(Queue queue) {
		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
	}

	public static void getArray(Queue queue) {
		Object[] arr = queue.toArray();
		for (Object o : arr) {
			System.out.print(o + " ");
		}
	}

	public static void dump(Queue queue) {
		while (!queue.isEmpty()) {
			System.out.println(
					queue.size() + " " + queue.element() + " " + queue.dequeue());
		}
	}

	public static void clear(Queue queue) {
		queue.clear();
		System.out.println(queue.isEmpty());
	}

}
