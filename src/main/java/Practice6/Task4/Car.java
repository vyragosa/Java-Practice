package Practice6.Task4;

import java.text.NumberFormat;
import java.util.Locale;

class Car implements Priceable {
	double price;

	public Car(double price) {
		this.price = price;
	}

	@Override
	public String getPrice() {
		return NumberFormat.getCurrencyInstance(Locale.US).format(price);
	}
}
