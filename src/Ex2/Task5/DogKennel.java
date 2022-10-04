package Ex2.Task5;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
	private ArrayList<Dog> listDogs = new ArrayList<Dog>();

	public void addDog() {
		System.out.println("Enter dog name and dog age");
		Scanner scanner = new Scanner(System.in);
		listDogs.add(new Dog(scanner.next(), scanner.nextInt()));
	}

	@Override
	public String toString() {
		return listDogs.toString().toString();
	}

}
