package Practice4_1.Task10;

import java.text.NumberFormat;
import java.util.Locale;

abstract class Vehicle {
	protected final double timeCoefficient;
	protected final double costCoefficient;

	public Vehicle(double timeCoefficient, double costCoefficient) {
		this.timeCoefficient = timeCoefficient;
		this.costCoefficient = costCoefficient;
	}

	public String getTime(double num) {
		return String.valueOf(num * timeCoefficient);
	}

	public String getCost(double num) {
		return NumberFormat.getCurrencyInstance(Locale.US).format(num * costCoefficient);
	}

	public void printSpec(int num) {
		System.out.println(getClass().getSimpleName() + ":");
		System.out.println("Time: " + getTime(num));
		System.out.println("Cost: " + getCost(num));

	}
}
