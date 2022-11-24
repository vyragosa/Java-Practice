package Practice32.Model.OrderManager;

import Practice32.Model.Menu.Item;
import Practice32.Model.Order.Order;

import java.io.Serializable;

public interface OrdersManager extends Serializable {
	int itemsQuantity(String itemName);

	int itemsQuantity(Item item);

	Order[] getOrders();

	int ordersCostSummary();

	int ordersQuantity();
}
