package Practice7.Task8;

interface Printable {
	static void print(Printable[] printables) {
		for (Printable printable : printables) {
			System.out.println(printable);
		}
	}
}
