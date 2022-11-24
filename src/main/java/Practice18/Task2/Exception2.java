package Practice18.Task2;

import java.util.Scanner;

class Exception2 {
	public void exceptionDemo() {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter an integer ");
		String intString = myScanner.next();
		//int i = Integer.parseInt(intString);
		//System.out.println(2 / i);
		try {
			int i = Integer.parseInt(intString);
			System.out.println(2 / i);
		} catch (ArithmeticException e) {
			System.out.println("Attempted division by zero");
		} catch (NumberFormatException e) {
			System.out.println("String does not have the appropriate format");
		}
	}
}
