package chapter10;

public class Fruit {
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    protected int calories;

    public void makeJuice() {
        System.out.println("Juice is made!");
    }
}
