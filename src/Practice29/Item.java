package Practice29;

import java.util.Comparator;

public interface Item extends Comparable<Item> {
	public String getName();

	public double getPrice();

	public String getDescription();
}
