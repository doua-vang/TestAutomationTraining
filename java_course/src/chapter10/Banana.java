package chapter10;

public class Banana extends Fruit {
    @Override
    public void makeJuice() {
        System.out.println("Banana juice is made");
    }

    public void peel() {
        System.out.println("Banana is pealed");
    }

    public Banana() {
        super();
        setCalories(50);
    }
}
