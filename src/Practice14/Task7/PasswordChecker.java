package Practice14.Task7;

import java.util.regex.Pattern;

public class PasswordChecker {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)\\w{8,}$");
		System.out.println(pattern.matcher("F032_assword").matches());
		System.out.println(pattern.matcher("TrySpydas_12").matches());
		System.out.println(pattern.matcher("smart_pass").matches());
		System.out.println(pattern.matcher("A007").matches());
	}
}
