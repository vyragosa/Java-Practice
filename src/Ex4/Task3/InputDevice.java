package Ex4.Task3;

public interface InputDevice {
    default void inputSpec() {
        System.out.println("Устройство вывода");
    }
}
