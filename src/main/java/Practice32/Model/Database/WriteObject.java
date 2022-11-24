package Practice32.Model.Database;

import Practice32.Model.OrderManager.OrdersManager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void write(OrdersManager[] ordersManagers) throws IOException {
		FileOutputStream FileOutputStream = new FileOutputStream("src\\main\\java\\Practice32\\Model\\Database\\orders.bin");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(FileOutputStream);
		objectOutputStream.writeObject(ordersManagers);
		objectOutputStream.close();
	}
}
