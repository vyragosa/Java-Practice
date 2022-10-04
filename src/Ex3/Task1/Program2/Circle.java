package Ex3.Task1.Program2;


public class Circle {
    private Point point;
    private double l;
    private double r;

    public Circle(double x, double y) {
        this.point = new Point(x, y);
        this.r = Math.random() * 100;
        setL(this.r);
    }

    public Circle() {
        point = new Point(0, 0);
        this.r = Math.random() * 100;
        setL(this.r);
    }

    public double getL() {
        return l;
    }

    private void setL(double r) {
        this.l = 2 * Math.PI * r;
    }

    public double getR() {
        return r;
    }

    private void setR(double r) {
        this.r = r;
    }

    public void setXY(double x, double y) {
        point.setX(x);
        point.setY(y);
    }

    public void move(double xDisp, double yDisp) {
        point.setX(point.getX() + xDisp);
        point.setY(point.getY() + yDisp);
    }

    @Override
    public String toString() {
        return "Circle{Center x: " + point.getX() + ", y: " + point.getY() + ", r: " + getR() + ", l: " + getL() + "}";
    }


}
