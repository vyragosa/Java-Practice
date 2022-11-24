package Practice27.Task2;

public class Main {
	public static void main(String[] args) {
		People people = new People();
		people.setMap(People.createMap());
		System.out.println(people);
		System.out.println(people.getSameFirstNameCount("Name1"));
		System.out.println(people.getSameLastNameCount("Surname1"));
	}
}
