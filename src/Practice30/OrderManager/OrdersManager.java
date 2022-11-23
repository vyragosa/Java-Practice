package Practice30.OrderManager;

import Practice30.Menu.Item;
import Practice30.Order.Order;

public interface OrdersManager {
	int itemsQuantity(String itemName);

	int itemsQuantity(Item item);

	Order[] getOrders();

	int ordersCostSummary();

	int ordersQuantity();
}
