package Practice11.Task2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class DateCompare {
	public static void main(String[] args) {
		System.out.println("Input date to compare (Pattern hh:mm:ss dd/MM/yy)");
		Scanner scanner = new Scanner(System.in);
		DateFormat formatter = new SimpleDateFormat("hh:mm:ss dd/MM/yy");
		Date newDate;
		try {
			newDate = formatter.parse(scanner.nextLine());
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		Date currDate = new Date();
		System.out.println("YourTime:" + newDate);
		System.out.println("Current time:" + currDate);
		if (currDate.before(newDate))
			System.out.println("current time <= your time");
		else
			System.out.println("current time > your time");
	}
}
