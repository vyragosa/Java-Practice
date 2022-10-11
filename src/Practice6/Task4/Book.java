package Practice6.Task4;

import java.text.NumberFormat;
import java.util.Locale;

class Book implements Priceable {
	double price;

	public Book(double price) {
		this.price = price;
	}

	@Override
	public String getPrice() {
		return NumberFormat.getCurrencyInstance(Locale.US).format(price);
	}
}
