package Ex3.Task3.Program1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale[] locales = Locale.getAvailableLocales();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your value:");
		double value = scanner.nextDouble();
		CurrencyConverter currencyConverter = new CurrencyConverter();
		for (Locale locale : locales) {
			System.out.printf("%1$s\t%2$s%n", locale.toString(), currencyConverter.convertToLocale(value, locale));
		}
	}
}



