package Practice19.Task1;

import java.util.regex.Pattern;

class INNChecker {

	public static void checkINN(String INN) {
		if (!Pattern.compile("\\d+").matcher(INN).matches()
				|| INN.length() != 11) try {
			throw new INNException();
		} catch (INNException e) {
			throw new RuntimeException(e);
		} finally {
			System.out.println("ИНН правильный");
		}
	}
}