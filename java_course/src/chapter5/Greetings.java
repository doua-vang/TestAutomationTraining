package chapter5;

import java.util.Scanner;

public class Greetings {
    public static void greeting(String name) {
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = s.next();
        s.close();
        greeting(name);
    }

}
