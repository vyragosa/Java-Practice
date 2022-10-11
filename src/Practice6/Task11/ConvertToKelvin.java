package Practice6.Task11;

class ConvertToKelvin implements Convertable {

	@Override
	public void convert(double value) {
		System.out.printf("Температура в Кельвинах %.2fK\n", value + 273.15);
	}
}
