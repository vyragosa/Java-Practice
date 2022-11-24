package Practice11.Task1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Developer {
	private final String name;
	Date startDate;
	Date endDate;

	public Developer(String name) {
		this.name = name;
	}

	public void setStartDate(String date) {
		DateFormat formatter = new SimpleDateFormat("hh:mm:ss.dd/MM/yy");
		try {
			this.startDate = formatter.parse(date);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}


	public void setEndDate(String date) {
		DateFormat formatter = new SimpleDateFormat("hh:mm:ss.dd/MM/yy");
		try {
			this.endDate = formatter.parse(date);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		if (startDate.after(endDate))
			throw new RuntimeException("End date is wrong!");
	}

	void print() {
		System.out.println(name);
		System.out.println(startDate);
		System.out.println(endDate);
	}
}
