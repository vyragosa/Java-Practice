package Archive;

class Program2 {
	public static void main(String[] args) {
		double res = 1, sum = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.round(res * 100) / 100.);
			sum += res;
			res = 1. / (i + 2);
		}
		System.out.println("\n" + sum);
	}
}