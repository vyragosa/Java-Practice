package Practice25.Task1;

import java.util.regex.Pattern;

public class IPv4matcher {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("(((\\d{1,2})|([01]\\d{2})|(2[0-4]\\d)|25[0-5]|0x[0-9a-fA-F][0-9a-fA-F]" +
				"?|0[0-3][0-7][0-7])(\\.|$)){4}");
		System.out.println(pattern.matcher("192.0.2.235").matches());
		System.out.println(pattern.matcher("0xC0.0x00.0x02.0xEB").matches());
		System.out.println(pattern.matcher("0300.0000.0002.0353").matches());
	}
}
