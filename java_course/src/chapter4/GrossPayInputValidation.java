package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int payRate = 15;
        int maxHours = 40;
        int minHours = 1;

        double pay;
        Scanner s = new Scanner(System.in);

        System.out.println("Please entere how much hours the employee worked:");
        int hoursWorked = s.nextInt();

        while (hoursWorked > maxHours || hoursWorked < minHours) {
            System.out.println("Hours worked must be between " + minHours + " and " + maxHours + " hours");
            hoursWorked = s.nextInt();
        }

        s.close();

        System.out.println("Your employee earned $" + (hoursWorked * payRate));

    }
}