package Practice7.Task7;

interface Printable {
	static void print(Printable[] printables) {
		for (Printable printable : printables) {
			System.out.println(printable);
		}
	}
}
