package Practice8.Task8;

import java.util.Scanner;

class Palindrome {
	public static String isPalindrome(String s) {
		if (s.length() <= 1)
			return "YES";
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPalindrome(s.substring(1, s.length() - 1));
		return "NO";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(isPalindrome(scanner.next()));
	}
}
