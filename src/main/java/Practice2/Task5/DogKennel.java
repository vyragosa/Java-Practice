package Practice2.Task5;

import java.util.ArrayList;
import java.util.Scanner;

class DogKennel {
	private ArrayList<Dog> listDogs = new ArrayList<>();

	public void addDog() {
		System.out.println("Enter dog name and dog age");
		Scanner scanner = new Scanner(System.in);
		listDogs.add(new Dog(scanner.next(), scanner.nextInt()));
	}

	@Override
	public String toString() {
		return listDogs.toString();
	}

}
