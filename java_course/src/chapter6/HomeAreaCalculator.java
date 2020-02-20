package chapter6;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle firstRoom = new Rectangle();
        Rectangle secondRoom = new Rectangle(6,9);

        firstRoom.setWidth(25);
        firstRoom.setLength(50);

        double firstRoomArea = firstRoom.getArea();
        double secondRoomArea = secondRoom.getArea();
        double totalAreaOfRooms = firstRoomArea + secondRoomArea;

        double firstRoomPerimeter = firstRoom.getPerimeter();
        double secondRoomPerimeter = secondRoom.getPerimeter();
        double totalPerimeter = firstRoomPerimeter + secondRoomPerimeter;

        System.out.println("Area of room 1 is: " + firstRoomArea);
        System.out.println("Area of room 2 is: " + secondRoomArea);
        System.out.println("Total area of room 1 and 2: " + totalAreaOfRooms);

        System.out.println("Perimeter of room 1 is: " + firstRoomPerimeter);
        System.out.println("Perimeter of room 2 is: " + secondRoomPerimeter);
        System.out.println("Total perimeter of room 1 and 2: " + totalPerimeter);


    }
}
