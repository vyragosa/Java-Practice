package Practice32.Model.Database;

import java.io.*;

public class ReadObject {
	public static Object read() throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("src\\main\\java\\Practice32\\Model\\Database\\orders.bin");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		return objectInputStream.readObject();
	}
}
