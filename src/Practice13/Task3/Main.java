package Practice13.Task3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		String address = new Scanner(System.in).nextLine();
		Address addressClass = new Address();
		addressClass.useSplit(address);
		System.out.println(addressClass);
		addressClass.useTokenizer(address);
		System.out.println(addressClass);
	}
}
