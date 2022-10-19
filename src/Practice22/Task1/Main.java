package Practice22.Task1;

class Main {
	public static void main(String[] args) {
		try {
			System.out.println(PolishNotation.calculate("1 3 +"));
			System.out.println(PolishNotation.calculate("2 3 * 4 5 * +"));
			System.out.println(PolishNotation.calculate("2 3 4 5 6 * + - /"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

