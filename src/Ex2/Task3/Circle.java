package Ex2.Task3;

public class Circle extends Point {
    public Circle(double x, double y) {
        setX(x);
        setY(y);
    }

    public Circle() {
        setX(0.0);
        setY(0.0);
    }

    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }

    public void move(double xDisp, double yDisp) {
        setX(getX() + xDisp);
        setY(getY() + yDisp);
    }

    @Override
    public String toString() {
        return "Circle{x: " + getX() + ", y: " + getY() + "}";
    }
}
