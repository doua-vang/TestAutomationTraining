package chapter10;

public class Market {
    public static  void main (String[] args) {
        Fruit apple = new Apple();
        Banana banana = new Banana();
        ((Apple) apple).removeSeeds();
        banana.peel();
        apple.makeJuice();
        banana.makeJuice();
    }
}
