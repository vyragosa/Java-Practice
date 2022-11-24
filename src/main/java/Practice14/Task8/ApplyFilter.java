package Practice14.Task8;

import java.util.Arrays;

class ApplyFilter {
	public static Object[] filter(Object[] array, Filter filter) {
		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
			if (!filter.apply(array[i])) {
				cnt++;
			} else {
				array[i - cnt] = array[i];
			}
		}
		return Arrays.copyOf(array, array.length - cnt);
	}
}
