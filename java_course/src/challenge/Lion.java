package challenge;

public class Lion implements Mammals {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void whatAmI() {
        System.out.println("I am a lion");
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void makeSound() {
        System.out.println("Roar Roar!");

    }
    public static String getAnimalName() {
        return Lion.class.getSimpleName();
    }
}
