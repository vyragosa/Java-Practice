package Practice2.Task1;

import java.util.Scanner;

class TestAuthor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter author name: ");
		String name = scanner.nextLine();
		if (name.isEmpty()) {
			System.out.println("Empty name!");
			return;
		}

		System.out.print("Enter author email: ");
		String email = scanner.nextLine();
		if (email.isEmpty()) {
			System.out.println("Empty email!");
			return;
		}

		System.out.print("And gender (M/F): ");
		char gender = scanner.nextLine().charAt(0);
		if (gender != 'M' && gender != 'F') {
			System.out.println("Wrong gender!");
			return;
		}

		Author author = new Author(name, email, gender);

		System.out.println("Your newly created author: " + author);
	}
}