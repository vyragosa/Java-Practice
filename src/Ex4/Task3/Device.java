package Ex4.Task3;

public abstract class Device {
    private final int cost;
    private final String color;

    private final Specification specification;
    private final String name;

    Device(String name, int cost, String color, Specification specification) {
        this.name = name;
        this.cost = cost;
        this.color = color;
        this.specification = specification;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{название: " + name + ", цена: " + cost + ", цвет: "
                + color + ", особенность: " + specification.toString() + "}";
    }
}
