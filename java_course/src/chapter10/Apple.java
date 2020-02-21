package chapter10;

public class Apple extends Fruit {
    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made");
    }

    public void removeSeeds() {
        System.out.println("Seeds are peeled");
    }

    public Apple() {
        super();
        //setCalories(80);
    }
}
