package Practice21.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
	public static <T> ArrayList<T> newArrayList(T... elements) {
		return new ArrayList<>(Arrays.asList(elements));
	}

	public static <T> HashSet<T> newHashSet(T... elements) {
		return new HashSet<>(Arrays.asList(elements));
	}

	public static <K, V> HashMap<K, V> newHashMap(K[] keys, V[] vars) {
		if (vars.length != keys.length)
			throw new IllegalArgumentException("Несоответсвие размеров массивов!");
		HashMap<K, V> map = new HashMap<>();
		for (int i = 0; i < keys.length; i++) {
			map.put(keys[i], vars[i]);
		}
		return map;
	}
}
