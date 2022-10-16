package Practice14.Task5;

import java.util.regex.Pattern;

public class DateChecker {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^([0-2]\\d|3[0-1])/(0\\d|1[0-2])/(19\\d{2}|[2-9]\\d{3})$");
		System.out.println(pattern.matcher("29/02/2000").matches());
		System.out.println(pattern.matcher("12/12/1980").matches());
		System.out.println(pattern.matcher("31-04-2003").matches());
		System.out.println(pattern.matcher("1/1/1899").matches());
	}
}
