package Practice18.Task1;

class Exception1 {
	public void exceptionDemo() {
		//System.out.println(2 / 0);
		System.out.println(2 / 0.);
		try {
			System.out.println(2 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Attempted division by zero");
		}
	}

}
