package Practice32.Model.Database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	public static Object read() throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("src\\main\\java\\Practice32\\Model\\Database\\orders.bin");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		return objectInputStream.readObject();
	}
}
