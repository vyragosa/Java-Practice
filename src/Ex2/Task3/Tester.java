package Ex2.Task3;

public class Tester {
    private Circle[] Array;
    private int size;
    public Tester (int size) {
        Array = new Circle[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Circle[] getArray() {
        return Array;
    }

    public void setArray(Circle[] array) {
        Array = array;
    }
}
