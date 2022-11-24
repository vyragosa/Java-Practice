package Practice29;

import java.util.Arrays;
import java.util.HashMap;

public class OrderManager {
	private HashMap<String, Order> orders = new HashMap<>();

	public void add(String name, Order order) throws OrderAlreadyAddedException {
		if (orders.containsKey(name)) {
			throw new OrderAlreadyAddedException();
		}
		orders.put(name, order);
	}

	public void remove(String name) {
		orders.remove(name);
	}

	public void add(String name, Item item) throws OrderAlreadyAddedException, IllegalTableNumber {
		orders.get(name).add(item);
	}

	public void remove(String name, String itemName) throws IllegalTableNumber {
		orders.get(name).remove(itemName);
	}

	public Order getOrder(String name) {
		return orders.get(name);
	}

	Order[] getInternetOrders() {
		return Arrays.stream(orders.values().toArray())
				.filter(order -> order instanceof InternetOrder)
				.toArray(Order[]::new);
	}

	Order[] getRestaurantOrders() {
		return Arrays.stream(orders.values().toArray())
				.filter(order -> order instanceof RestaurantOrder)
				.toArray(Order[]::new);
	}

	public int internetQuantity(String itemName) {
		return orders.values().stream().filter(order -> order instanceof InternetOrder)
				.mapToInt(order -> order.getQuantity(itemName)).sum();
	}

	public int internetQuantity() {
		return orders.values().stream().filter(order -> order instanceof InternetOrder)
				.mapToInt(Order::getQuantity).sum();
	}

	public int restaurantQuantity(String itemName) {
		return orders.values().stream().filter(order -> order instanceof RestaurantOrder)
				.mapToInt(order -> order.getQuantity(itemName)).sum();
	}

	public int restaurantQuantity() {
		return orders.values().stream().filter(order -> order instanceof RestaurantOrder)
				.mapToInt(Order::getQuantity).sum();
	}
}
