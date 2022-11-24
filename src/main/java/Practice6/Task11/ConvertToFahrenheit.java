package Practice6.Task11;

class ConvertToFahrenheit implements Convertable {
	@Override
	public void convert(double value) {
		System.out.printf("Температура в Фаренгейтах %.2f℉\n", (value * 1.8) + 32.);
	}
}
