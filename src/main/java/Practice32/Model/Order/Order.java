package Practice32.Model.Order;

import Practice32.Model.CustomerInfo.Customer;
import Practice32.Model.Expressions.IllegalTableNumber;
import Practice32.Model.Menu.Item;

import java.io.Serializable;

public interface Order extends Serializable {
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
