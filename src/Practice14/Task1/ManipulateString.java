package Practice14.Task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ManipulateString {
	public static void main(String[] args) {
		String[] words;
		System.out.println(Arrays.toString(words = Pattern.compile("\\s+").split(new Scanner(System.in).nextLine())));
	}
}