package Practice14.Task8;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] array = new String[]{"123", "asd", "qwe", null, null, "ewq"};
		System.out.println(Arrays.toString(ApplyFilter.filter(array, new Filter() {
			@Override
			public boolean apply(Object o) {
				return o != null;
			}
		})));
	}
}