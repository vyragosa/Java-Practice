package Practice13.Task6;

import java.util.ArrayList;
import java.util.Arrays;

class StringFormatter {
	public static String getLine(String str) {
		ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(str.split(" ")));
		String temp = stringArrayList.get(0);
		StringBuilder result = new StringBuilder(temp).append(" ");
		for (int i = 0; i < stringArrayList.size(); i++) {
			if (temp.toLowerCase().charAt(temp.length() - 1) == stringArrayList.get(i).toLowerCase().charAt(0)) {
				result.append(temp = stringArrayList.get(i)).append(" ");
				stringArrayList.remove(i);
				i = 0;
			}
		}
		return result.toString();
	}
}
