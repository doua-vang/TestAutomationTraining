package chapter9;

public class TasteTester {
    public static void main (String[] args) {
        Cake cake = new Cake("Panden");
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavor("Strawberry");
        WeddingCake weddingCake = new WeddingCake();

        birthdayCake.setCandles(10);

        System.out.println("The cost of the cake is: " + cake.getPrice());
        System.out.println("The flavor of the cake is: " + cake.getFlavor());

        System.out.println("The birthday cake has " + birthdayCake.getCandles() + " candle(s)");
        System.out.println("The birthday cake flavor is: " + birthdayCake.getFlavor());

        System.out.println("The Wedding cake flavor is: " + weddingCake.getFlavor());
        System.out.println("The cost of the wedding cake is: " + weddingCake.getPrice());





    }

}
