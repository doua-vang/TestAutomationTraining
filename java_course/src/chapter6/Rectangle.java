package chapter6;

public class Rectangle {
    private double length;
    private double width;

    public double getArea() {
        return length * width;
    }

    public double getWdith() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.width = 0;
        this.length = 0;
    }

}
