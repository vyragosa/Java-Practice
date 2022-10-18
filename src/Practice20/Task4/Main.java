package Practice20.Task4;

class Main {
	public static void main(String[] args) {
		MinMax<Integer> integerMinMax = new MinMax<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
		System.out.println(integerMinMax.min());
		System.out.println(integerMinMax.max());

		MinMax<Double> doubleMinMax = new MinMax<>(new Double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8});
		System.out.println(doubleMinMax.min());
		System.out.println(doubleMinMax.max());

	}
}
