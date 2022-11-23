package Practice30.Controller;


import Practice30.Model.Database.RestaurantInfo;
import Practice30.Model.OrderManager.InternetOrdersManager;
import Practice30.Model.OrderManager.TableOrdersManager;
import Practice30.Viewer.CustomerFillGUI;

public class Controller {
	public Controller() {
		TableOrdersManager tableManager = new TableOrdersManager(RestaurantInfo.tablesCount);
		InternetOrdersManager internetManager = new InternetOrdersManager();
		new CustomerFillGUI(tableManager, internetManager).setVisible(true);
	}
}
