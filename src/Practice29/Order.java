package Practice29;

interface Order {
	boolean add(Item item) throws IllegalTableNumber;
	boolean remove(String name) throws IllegalTableNumber;
	boolean removeAll();
	int getQuantity();
	Item[] getItems();
	double getCostTotal();
	int getQuantity(String name);
	Item[] getNoRepeatsItems(String name);
	Item[] getSortedItemsByCost();
}
