package Practice2.Task2;

import java.util.Scanner;

class TestBall {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter initial x and y:");
		Ball ball = new Ball(scanner.nextInt(), scanner.nextInt());
		System.out.println(ball);
		System.out.println("Enter values you want to move the ball:");
		ball.move(scanner.nextInt(), scanner.nextInt());
		System.out.println(ball);
	}
}