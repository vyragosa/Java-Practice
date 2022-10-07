package Ex4.Task3;

import java.util.Objects;
import java.util.Scanner;

public class Shop implements InputDevice, OutputDevice {
    Shop() {
        boolean check = true;
        while(check) {
            System.out.println("Enter login and password");
            Scanner scanner = new Scanner(System.in);
            if((Objects.equals(scanner.next(), Config.LOGIN.getDescription())) &&
                    (Objects.equals(scanner.next(), Config.PASSWORD.getDescription())))
                check = false;
            else
                System.out.println("Authentication failed! Try Again.");
        }
    }
    Device[] device = {
            new Keyboard("Клавитатура1",150, "Синий", Specification.LAST),
            new Monitor("Монитор1", 300, "Белый", Specification.DISCOUNT),
            new Microphone("Микрофон1", 500, "Красный", Specification.MISSING),
            new Mouse("Мышь1",125,"Черный", Specification.NORMAL),
            new MultifunctionDevice("МФУ1",150, "Серый", Specification.SHOWCASE),
    };

    @Override
    public void inputSpec() {
        for (Device devices : device) {
            if (devices instanceof InputDevice) {
                System.out.println(devices);
            }
        }
    }

    @Override
    public void outputSpec() {
        for (Device devices : device) {
            if (devices instanceof OutputDevice) {
                System.out.println(devices);
            }
        }
    }
    
}
