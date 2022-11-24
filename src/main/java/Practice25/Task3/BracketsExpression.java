package Practice25.Task3;

import java.util.regex.Pattern;

public class BracketsExpression {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^\\(([^(].+|\\(.+\\))\\).+");
		System.out.println(pattern.matcher("(3*+*5)*–*9*×*4").matches());
		System.out.println(pattern.matcher("((3*+*5)*–*9*×*4").matches());
	}
}
