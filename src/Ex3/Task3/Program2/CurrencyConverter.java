package Ex3.Task3.Program2;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {
    final double rublesInDollar = 59.;
    final double rublesInEuro = 58.;
    final double rublesInYuan = 8.;

    public String ConvertToUSDollar(double value) {
        return convertToLocale(value / rublesInDollar, Locale.US);
    }

    public String ConvertToEuro(double value) {
        return convertToLocale(value / rublesInEuro, Locale.US);
    }

    public String ConvertToYuan(double value) {
        return convertToLocale(value / rublesInYuan, Locale.US);
    }
    public String convertToLocale(double value, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(value);
    }

}
