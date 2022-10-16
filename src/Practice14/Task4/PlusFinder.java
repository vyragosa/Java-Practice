package Practice14.Task4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PlusFinder {
	public static void main(String[] args) {
		System.out.println(Pattern.compile("\\d+\\s*\\+").matcher(new Scanner(System.in).nextLine()).matches());
	}
}
