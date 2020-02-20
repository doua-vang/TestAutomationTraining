package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean done = false;
        int num1;
        int num2;
        String answer;
        do {
            System.out.println("Enter the first number:");
            num1 = s.nextInt();
            System.out.println("Enter the second number:");
            num2 = s.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println("Are you done (Y/N)?");
            if (s.next().equalsIgnoreCase("Y")) {
                done = true;
            }

        }
        while (!done);

        s.close();

        System.out.print("Exiting program!");
    }
}
