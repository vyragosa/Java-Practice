package Ex4_1.Task1;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side(radius):");
		double num = scanner.nextDouble();
		Circle circle = new Circle(num);
		Rectangle rectangle = new Rectangle(num);
		Square square = new Square(num);
		circle.getArea();
		circle.getPerimeter();
		System.out.println(circle);
		rectangle.getArea();
		rectangle.getPerimeter();
		System.out.println(rectangle);
		square.getArea();
		square.getPerimeter();
		System.out.println(square);
	}
}
