package challenge;

public class Zebra implements Mammals {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void whatAmI() {
        System.out.println("I am a Zebra");
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }
    @Override
    public void makeSound() {
        System.out.println("Zebra Zebra!");

    }

    public static String getAnimalName() {
        return Zebra.class.getSimpleName();
    }

}
