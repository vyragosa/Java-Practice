package Practice32.Model.Menu;

import java.io.Serializable;

public interface Item extends Comparable<Item>, Serializable {
	public String getName();

	public double getPrice();

	public String getDescription();
}
