package Ex4.Task3;

import java.util.Objects;
import java.util.Scanner;

public class Shop implements InputDevice, OutputDevice {
	Device[] device;

	Shop() {
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.println("Enter login and password");
			String login = scanner.next();
			String password = scanner.next();
			if ((Objects.equals(login, User.LOGIN.getData())) &&
					(Objects.equals(password, User.PASSWORD.getData())))
				check = false;
			else
				System.out.println("Authentication failed! Try Again.");
		}
		device = new Device[]{
				new Keyboard("Клавитатура1", 150, "Синий", Specification.LAST),
				new Monitor("Монитор1", 300, "Белый", Specification.DISCOUNT),
				new Microphone("Микрофон1", 500, "Красный", Specification.MISSING),
				new Mouse("Мышь1", 125, "Черный", Specification.NORMAL),
				new MultifunctionDevice("МФУ1", 150, "Серый", Specification.SHOWCASE),
		};

	}

	@Override
	public void inputSpec() {
		System.out.println("Input devices:");
		for (Device devices : device) {
			if (devices instanceof InputDevice) {
				System.out.println(devices);
			}
		}
	}

	@Override
	public void outputSpec() {
		System.out.println("Output devices");
		for (Device devices : device) {
			if (devices instanceof OutputDevice) {
				System.out.println(devices);
			}
		}
	}

	public void printDevices() {
		System.out.println("All devices:");
		for (Device devices : device) {
			System.out.println(devices);
		}
	}
}
