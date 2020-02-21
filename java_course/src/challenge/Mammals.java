package challenge;

public interface Mammals {

    String getName();

    void whatAmI();

    void setName(String name);

    default String getSpeices() {
        return this.getClass().getSimpleName();
    };

    default void eat() {
        System.out.println("I am eating");
    };

    void makeSound();

}
