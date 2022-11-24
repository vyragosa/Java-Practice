package Practice31.Model.Menu;

public interface Item extends Comparable<Item> {
	public String getName();

	public double getPrice();

	public String getDescription();
}
