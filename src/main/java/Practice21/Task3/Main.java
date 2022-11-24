package Practice21.Task3;

import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		AnyArrayType<Long> array = new AnyArrayType<>();
		array.setArray(new Long[]{1L, 2L, 3L});
		System.out.println(Arrays.toString(array.getArray()));
		System.out.println(array.get(2));
	}
}
