package chapter11;

public class Farm {
    public static void main(String[] args) {
        Animal pig = new Pig();
        Animal duck = new Duck();

        pig.makeSound();
        pig.eat();

        duck.makeSound();
        duck.eat();
    }
}
