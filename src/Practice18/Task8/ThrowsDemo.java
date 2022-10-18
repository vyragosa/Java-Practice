package Practice18.Task8;

import java.util.Scanner;

class ThrowsDemo {
	public void getKey() {
		Scanner myScanner = new Scanner(System.in);
		try {
			String key = myScanner.next();
			if (key.equals("")) throw new Exception("Key set to empty string");
			printDetails(key);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			String key = myScanner.next();
			printDetails(key);
		}
	}

	public void printDetails(String key) {
		String message = getDetails(key);
		System.out.println(message);
	}

	private String getDetails(String key) {
		try {
			if (key.equals("")) {
				throw new Exception("Key set to empty string");
			}
			return "data for " + key;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "";
		}
	}
}

