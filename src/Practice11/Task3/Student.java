package Practice11.Task3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Student implements Comparable<Student> {
	private final String firstName;
	private final String lastName;
	private final int specialty;
	private final int group;
	private final int GPA;
	Date date;

	public Student(String firstName, String lastName, int specialty, int group, int gpa, String date) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialty = specialty;
		this.group = group;
		GPA = gpa;
		DateFormat formatter = new SimpleDateFormat("hh:mm:ss.dd/MM/yy");
		try {
			this.date = formatter.parse(date);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSpecialty() {
		return specialty;
	}

	public int getGroup() {
		return group;
	}

	@Override
	public String toString() {
		return "Student{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", specialty=" + specialty +
				", group=" + group +
				", GPA=" + GPA +
				", date=" + DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(date) +
				'}';
	}

	public int getGPA() {
		return GPA;
	}

	@Override
	public int compareTo(Student o) {
		return this.group - o.group;
	}
}
