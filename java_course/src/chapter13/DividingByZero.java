package chapter13;

public class DividingByZero {
    public static void main(String[] args) {

        try {
            int c = 30/0;
        }
        catch (ArithmeticException  e) {
            System.out.println("Can't divide by zero");
        }
        finally {
            System.out.println("Division is fun!");
        }

    }


}
