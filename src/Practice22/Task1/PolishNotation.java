package Practice22.Task1;

import java.util.EmptyStackException;
import java.util.Stack;

public class PolishNotation {
	public static double calculate(String str) throws ArithmeticException, EmptyStackException {
		Stack<Double> stack = new Stack<>();
		for (String element : str.split("\\s+")) {
			switch (element) {
				case "+" -> stack.push(stack.pop() + stack.pop());
				case "-" -> stack.push(-1 * stack.pop() + stack.pop());
				case "*" -> stack.push(stack.pop() * stack.pop());
				case "/" -> {
					double temp = stack.pop();
					stack.push(stack.pop() / temp);
				}
				case "^" -> {
					double temp = stack.pop();
					stack.push(Math.pow(stack.pop(), temp));
				}
				default -> stack.push(Double.parseDouble(element));
			}
		}
		Double temp = stack.pop();
		if (!stack.empty())
			throw new EmptyStackException();
		return temp;
	}
}