package Practice26;

class Test {
	public static void main(String[] args) {
		HashTable<String, Double> hashTable = new HashTable<>();
		hashTable.init(15);
		for (int i = 0; i < 30; i++) {
			hashTable.add(String.valueOf(i), (double) i);
		}
		System.out.println(hashTable);
		System.out.println(hashTable.get("5"));
		hashTable.erase("5");
		System.out.println(hashTable);
	}
}
