package Practice31.Model.Order;

import Practice31.Model.CustomerInfo.Customer;
import Practice31.Model.Expressions.IllegalTableNumber;
import Practice31.Model.Menu.Item;

public interface Order {
	boolean add(Item item) throws IllegalTableNumber;

	String[] itemsNames();

	int itemsQuantity();

	int itemQuantity(String name);

	Item[] getItems();

	boolean remove(String name) throws IllegalTableNumber;

	boolean remove(Item item) throws IllegalTableNumber;

	boolean removeAll(String name) throws IllegalTableNumber;

	boolean removeAll(Item item) throws IllegalTableNumber;

	double costTotal();

	Item[] sortedItemsByCostDesc();

	Customer getCustomer();

	void setCustomer(Customer customer);

	void clear();
}
