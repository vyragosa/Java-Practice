package Practice31.Controller;


import Practice31.Model.Database.RestaurantInfo;
import Practice31.Model.OrderManager.InternetOrdersManager;
import Practice31.Model.OrderManager.TableOrdersManager;
import Practice31.Viewer.CustomerFillGUI;

public class Controller {
	public Controller() {
		new CustomerFillGUI(new TableOrdersManager(RestaurantInfo.tablesCount), new InternetOrdersManager()).setVisible(true);
	}
}
