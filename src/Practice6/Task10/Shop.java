package Practice6.Task10;

import java.util.ArrayList;
import java.util.Scanner;


class Shop {
	private ArrayList<Computer> listComputer = new ArrayList<>();

	public void build() {
		int menu = 1;
		while (menu != 0) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("""
					Enter 1 to add new PC
					Enter 2 to delete PC
					Enter 3 to search PC in list
					Enter 4 to see list of PCs
					Enter 0 to exit
					""");
			menu = scanner.nextInt();
			if (menu == 1) {
				System.out.println("Enter new PC computerMark, memory, monitor, processor");


				System.out.println(addElement(scanner.next(), scanner.next(), scanner.next(), scanner.next(), ComputerMark.valueOf(scanner.next())));
			}
			if (menu == 2) {
				System.out.println("Enter new PC");
				System.out.println(removeElement(scanner.next()));
			}
			if (menu == 3) {
				System.out.println("Enter PC");
				System.out.println(searchElement(scanner.next()));
			}
			if (menu == 4) {
				System.out.println("List of PCs");
				System.out.println(this);
			}
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return listComputer.toString();
	}

	private String searchElement(String name) {
		for (Computer computer : listComputer)
			if (name.equals(computer.getName()))
				return "PC is in the list";
		return "PC is not in the list";
	}

	private String removeElement(String name) {
		for (int i = 0; i < listComputer.size(); i++) {
			if (name.equals(listComputer.get(i).getName())) {
				listComputer.remove(i);
				return "PC removed from the list";
			}
		}
		return "PC not found in the list";
	}

	private String addElement(String name, String memory, String monitor, String processor, ComputerMark computerMark) {
		listComputer.add(new Computer(name, memory, monitor, processor, computerMark));
		return "PC added successfully";
	}
}
