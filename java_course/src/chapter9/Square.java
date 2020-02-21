package chapter9;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    public void print(String msg) {
        System.out.println("I am a " + msg);
    }
}
