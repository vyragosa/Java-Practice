package Practice17.Task2;


import java.text.NumberFormat;
import java.util.Locale;

public class EmployeeView {
	public void displayDataEmployee(String name, double salary) {
		System.out.println("Имя: " + name + " Зарплата: " + NumberFormat.getCurrencyInstance(Locale.US).format(salary));
	}
}
