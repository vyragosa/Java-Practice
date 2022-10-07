package Ex4_1.Task3;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("Ваня", 33);
		person1.move();
		person1.talk();
		person2.move();
		person2.talk();
	}
}
