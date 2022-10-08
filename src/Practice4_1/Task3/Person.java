package Practice4_1.Task3;

class Person {
	private String fullName;
	private int age;

	public Person(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public Person() {
		this.fullName = "Петя";
		this.age = 21;
	}

	public void move() {
		System.out.println(fullName + " идет");
	}

	public void talk() {
		System.out.println(fullName + " говорит");
	}
}
