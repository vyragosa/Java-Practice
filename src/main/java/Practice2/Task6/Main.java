package Practice2.Task6;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		System.out.println("Enter r of the first circle");
		Scanner scanner = new Scanner(System.in);
		Circle circle1 = new Circle(scanner.nextInt());
		System.out.println(circle1);
		System.out.println("Enter r of the first circle");
		Circle circle2 = new Circle(scanner.nextInt());
		System.out.println(circle2);
		circle1.compareCircle(circle2);
	}
}
