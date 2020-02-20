package chapter6;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo calc = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calc.getRoom();
        Rectangle bathroom = calc.getRoom();

        double area = calc.calculateTotalArea(kitchen, bathroom);

        calc.s.close();

        System.out.println("The total area is: " + area);

    }

    public Rectangle getRoom() {
        System.out.println("Please enter a name for the room:");
        String roomName = s.next();

        System.out.println("Enter the length of the room:");
        double length = s.nextDouble();

        System.out.println("Enter the width of the room");
        double width = s.nextDouble();


        return new Rectangle(roomName,length,width);
    }

    public double calculateTotalArea (Rectangle firstRoom, Rectangle secondRoom) {
        return firstRoom.getArea() + secondRoom.getArea();
    }
}
