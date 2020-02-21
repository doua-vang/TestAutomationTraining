package challenge;

public class Hyena implements Mammals {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void whatAmI() {
        System.out.println("I am a Heyna");
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }
    @Override
    public void makeSound() {
        System.out.println("Hee Hee!");

    }
    public static String getAnimalName() {
        return Hyena.class.getSimpleName();
    }
}
