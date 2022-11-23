package Practice30.Controller;


import Practice30.Model.Database.RestaurantInfo;
import Practice30.Model.OrderManager.InternetOrdersManager;
import Practice30.Model.OrderManager.TableOrdersManager;
import Practice30.Viewer.CustomerFillGUI;

public class Controller {
	public Controller() {
		new CustomerFillGUI(new TableOrdersManager(RestaurantInfo.tablesCount), new InternetOrdersManager()).setVisible(true);
	}
}
