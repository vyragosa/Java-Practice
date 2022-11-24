package Practice3.Task3.Program2;

import java.text.NumberFormat;
import java.util.Locale;

class CurrencyConverter {
	final double rublesInDollar = 59.;
	final double rublesInEuro = 58.;
	final double rublesInYuan = 8.;
	private double value;

	public String convertToRubble() {
		return convertToLocale(value, new Locale("ru"));
	}

	public String convertToUSDollar() {
		return convertToLocale(value / rublesInDollar, Locale.US);
	}

	public String convertToEuro() {
		return convertToLocale(value / rublesInEuro, Locale.GERMANY);
	}

	public String convertToYuan() {
		return convertToLocale(value / rublesInYuan, Locale.CHINA);
	}

	public String convertToLocale(double value, Locale locale) {
		return NumberFormat.getCurrencyInstance(locale).format(value);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
