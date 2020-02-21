package challenge;

public class Elephant implements Mammals {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void whatAmI() {
        System.out.println("I am an Elephant");
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet trumpet!");

    }

    public static String getAnimalName() {
        return Elephant.class.getSimpleName();
    }




}
