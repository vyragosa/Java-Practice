package Practice13.Task2;

public class Person {
	private final String firstName;
	private final String secondName;
	private final String patronymic;

	public Person(String firstName, String secondName, String patronymic) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.patronymic = patronymic;
	}

	String getName() {
		return String.join(" ", firstName , secondName, patronymic);
	}
}
