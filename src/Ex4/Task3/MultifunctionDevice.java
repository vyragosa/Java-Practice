package Ex4.Task3;

public class MultifunctionDevice extends Device implements InputDevice, OutputDevice{
    MultifunctionDevice(String name, int cost, String color, Specification specification) {
        super(name, cost, color, specification);
    }
}
