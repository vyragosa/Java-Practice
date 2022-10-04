package Ex2.Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter r of the first circle");
        Scanner scanner = new Scanner(System.in);
        Circle circle1 = new Circle(scanner.nextInt());
        System.out.println(circle1.toString());
        System.out.println("Enter r of the first circle");
        Circle circle2 = new Circle(scanner.nextInt());
        System.out.println(circle2.toString());
        circle1.compareCircle(circle2);
    }
}
