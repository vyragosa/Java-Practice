package Practice32.Controller;


import Practice32.Model.Database.ReadObject;
import Practice32.Model.Database.RestaurantInfo;
import Practice32.Model.OrderManager.InternetOrdersManager;
import Practice32.Model.OrderManager.OrdersManager;
import Practice32.Model.OrderManager.TableOrdersManager;
import Practice32.Viewer.CustomerFillGUI;

import java.io.IOException;

public class Controller {
	public Controller() {
		OrdersManager[] ordersManagers;
		try {
			ordersManagers = (OrdersManager[]) ReadObject.read();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			ordersManagers = new OrdersManager[]{
					new TableOrdersManager(RestaurantInfo.tablesCount),
					new InternetOrdersManager(),
			};
		}
		new CustomerFillGUI((TableOrdersManager) ordersManagers[0], (InternetOrdersManager) ordersManagers[1]).setVisible(true);
	}
}
