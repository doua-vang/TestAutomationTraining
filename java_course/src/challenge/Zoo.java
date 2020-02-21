package challenge;

import java.util.Scanner;

public class Zoo {
    private static Mammals[] animals;

    public static Mammals getAnimal(String animal) {
        if (Elephant.getAnimalName().equalsIgnoreCase(animal)) {
            return new Elephant();
        }
        else if (Hyena.getAnimalName().equalsIgnoreCase(animal)) {
            return new Hyena();
        }
        else if (Lion.getAnimalName().equalsIgnoreCase(animal)) {
            return new Lion();
        }
        else if (Zebra.getAnimalName().equalsIgnoreCase(animal)) {
            return new Zebra();
        }
        else if (Ostrich.getAnimalName().equalsIgnoreCase(animal)){
            return new Ostrich();
        }
        System.out.println("Invalid animal, adding Lion");
        return new Lion();
    }

    public static void howManyAnimalsAreThere() {
        System.out.println("There are " + animals.length + " animal(s)");

    }

    public static void feedEachAnimal() {
        System.out.println("Feeding each animal");

        for (Mammals animal : animals) {
            if (animal.getName() == null) {
                System.out.println(animal.getSpeices());
            }
            else {
                System.out.println(animal.getName());
            }
            animal.eat();
        }

    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many animals are there in the zoo?");
        animals = new Mammals[s.nextInt()];

        for (int i = 0; i < animals.length; i ++ ) {
            System.out.println("What is animal #" + (i+1) + ":");
            animals[i] = getAnimal(s.next());

            System.out.println("Would you like to name the " + animals[i].getSpeices() + "?");
            if (s.next().substring(0,1).equalsIgnoreCase("Y")) {
                System.out.println("What is the name of the " + animals[i].getSpeices() + "?");
                animals[i].setName(s.next());
            }
        }

        howManyAnimalsAreThere();
        feedEachAnimal();


    }
}
