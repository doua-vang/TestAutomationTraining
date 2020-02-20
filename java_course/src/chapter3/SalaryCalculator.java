package chapter3;

import java.util.*;

public class SalaryCalculator {

    public static void main(String[] args) {

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        Scanner s = new Scanner(System.in);

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        int sales;

        while (true) {
            try {
                sales = Integer.parseInt(s.next()); ///.nextInt();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid sales number:");
            }
        }
        s.close();

        if (sales > quota) {
            salary += bonus;
        }

        System.out.printf("The employee's pay is $%d",salary);



    }
}
