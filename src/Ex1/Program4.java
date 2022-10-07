package Ex1;

class Program4 {
	public static void main(String[] args) {
		double res = 1, sum = 0;
		for (int i = 0; i < 10; i++) {
			System.out.printf("%.2f", res);
			System.out.print("\t");
			res = 1. / (i + 2);
		}
	}
}