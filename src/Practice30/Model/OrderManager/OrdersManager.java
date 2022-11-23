package Practice30.Model.OrderManager;

import Practice30.Model.Menu.Item;
import Practice30.Model.Order.Order;

public interface OrdersManager {
	int itemsQuantity(String itemName);

	int itemsQuantity(Item item);

	Order[] getOrders();

	int ordersCostSummary();

	int ordersQuantity();
}
