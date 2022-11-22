package Practice27.Task3;

import java.util.Hashtable;

public class HashTableRealization {
	public static void main(String[] args) {
		Hashtable<Double, String> hashTable = new Hashtable<>();
		hashTable.put(1.0, "1");
		hashTable.put(2.0, "2");
		hashTable.put(3.0, "3");
		hashTable.put(4.0, "4");
		hashTable.put(5.0, "5");
		System.out.println(hashTable);
	}
}