package Practice27.Task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Converter {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			set.add(i);
		}
		System.out.println(set.getClass().getSimpleName());
		System.out.println(set);
		set = new TreeSet<>(set);
		System.out.println(set.getClass().getSimpleName());
		System.out.println(set);
	}
}
