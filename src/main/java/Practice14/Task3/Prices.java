package Practice14.Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Prices {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\d+(.\\d+)*\\s(USD|RUB|EU)");
		Matcher matcher = pattern.matcher(new Scanner(System.in).nextLine());
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
