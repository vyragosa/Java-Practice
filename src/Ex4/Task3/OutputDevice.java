package Ex4.Task3;

public interface OutputDevice {
    default void outputSpec() {
        System.out.println("Устройство вывода");
    }
}
