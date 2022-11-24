package Practice31.Model.OrderManager;

import Practice31.Model.Menu.Item;
import Practice31.Model.Order.Order;

public interface OrdersManager {
	int itemsQuantity(String itemName);

	int itemsQuantity(Item item);

	Order[] getOrders();

	int ordersCostSummary();

	int ordersQuantity();
}
