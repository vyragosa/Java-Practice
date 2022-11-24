package Practice4_1.Task6;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

class Employer {
	private final String firstName;
	private final String lastName;
	private final double income;

	public Employer(String firstName, String lastName, double income) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.income = income;
	}

	public double getIncome() {
		Random random = new Random();
		return random.nextInt(0, 32) >= 12 ? income * 12 : income;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", income=" + NumberFormat.getCurrencyInstance(Locale.US).format(getIncome()) +
				'}';
	}
}
