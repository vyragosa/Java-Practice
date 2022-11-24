package Practice3.Task2;

import java.util.Scanner;

class Program3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double value = scanner.nextDouble();
		byte a = value.byteValue();
		short b = value.shortValue();
		int c = value.intValue();
		long d = value.longValue();
		float e = value.floatValue();
		double f = value.doubleValue();
		boolean g = Boolean.parseBoolean(value.toString());
		char h = (char) (value.intValue());
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}
