package Practice25.Task2;

import java.util.regex.Pattern;

public class IPAddressChecker {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("(((\\d{1,2})|([01]\\d{2})|(2[0-4]\\d)|25[0-5])(\\.|$)){4}");
		System.out.println(pattern.matcher("192.0.2.135").matches());
		System.out.println(pattern.matcher("1300.6.7.81300.6.7.8").matches());
		System.out.println(pattern.matcher("0300.0000.0002.0353").matches());
	}
}
