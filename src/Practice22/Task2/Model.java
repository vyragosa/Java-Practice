package Practice22.Task2;

import java.util.EmptyStackException;
import java.util.Stack;

public class Model {

    private String temp;

    public Model() {
        temp = "";
    }

    public String getTemp() {
        return temp;
    }

    public void doAction(String command) throws Exception {
        switch (command) {
            case "One":
                temp += "1";
                break;
            case "Two":
                temp += "2";
                break;
            case "Three":
                temp += "3";
                break;
            case "Four":
                temp += "4";
                break;
            case "Five":
                temp += "5";
                break;
            case "Six":
                temp += "6";
                break;
            case "Seven":
                temp += "7";
                break;
            case "Eight":
                temp += "8";
                break;
            case "Nine":
                temp += "9";
                break;
            case "Zero":
                temp += "0";
                break;
            case "Multiply":
                temp += " * ";
                break;
            case "Divide":
                temp += " / ";
                break;
            case "Add":
                temp += " + ";
                break;
            case "Subtract":
                temp += " - ";
                break;
            case "Degree":
                temp += " ^ ";
                break;
            case "Space":
                temp += " ";
                break;
            case "Dot":
                temp += ".";
                break;
            case "DeleteAll":
                temp = "";
                break;
            case "Equal":
                try {
                    temp = calculate(temp) + " ";
                    System.out.println(temp);
                } catch (Exception e) {
                    temp = "";
                    throw new Exception("Что-то пошло не так...");
                }
        }

    }

    public double calculate(String str) throws ArithmeticException, EmptyStackException {
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


