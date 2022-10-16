package Practice14.Task9;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Dictionary {
	public static void MakeDictionary(String str) {
		Map<Character, Long> dictionary = new HashMap<>();
		for (Character i = 'A'; i <= 'Z'; i++)
			dictionary.put(i, Pattern.compile(String.valueOf(i)).matcher(str.toUpperCase()).results().count());
		System.out.println(dictionary);
	}

	public static void main(String[] args) {
		MakeDictionary("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut" +
				" labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi" +
				" ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse " +
				"cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa" +
				" qui officia deserunt mollit anim id est laborum.");
	}
}
