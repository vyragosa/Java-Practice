package Practice21.Task2;

import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		AnyArrayType<Long> storage = new AnyArrayType<>();
		storage.setArray(new Long[]{1L, 2L, 3L});
		System.out.println(Arrays.toString(storage.getArray()));
	}
}
