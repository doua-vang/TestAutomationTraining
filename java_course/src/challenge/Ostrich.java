package challenge;

public class Ostrich implements Mammals {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void whatAmI() {
        System.out.println("I am an Ostrich");
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void makeSound() {
        System.out.println("Ostrich Ostrich!");

    }

    public static String getAnimalName() {
        return Ostrich.class.getSimpleName();
    }
}
