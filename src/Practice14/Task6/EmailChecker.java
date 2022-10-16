package Practice14.Task6;

import java.util.regex.Pattern;

public class EmailChecker {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^\\w+@\\w+(\\.\\w+)?$");
		System.out.println(pattern.matcher("root@localhost").matches());
		System.out.println(pattern.matcher("user@example.com").matches());
		System.out.println(pattern.matcher("Julia String").matches());
		System.out.println(pattern.matcher("@my.ru").matches());
		System.out.println(pattern.matcher("myhost@@@com.ru").matches());
	}
}
