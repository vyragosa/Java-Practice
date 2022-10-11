package Practice6.Task11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите значение в Градусах по цельсию (℃)");
		double value = scanner.nextDouble();
		Convertable converter = new ConvertToFahrenheit();
		converter.convert(value);
		converter = new ConvertToKelvin();
		converter.convert(value);
	}
}
