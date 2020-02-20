package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int minCredit = 700;
    static int minSalary = 25000;
    Scanner s = new Scanner(System.in);

    public static void creditCheck(int salary, int credit) {
        double salary =+

        if (salary >= minSalary && credit >= minCredit) {
            System.out.println("Congrats! You've been instantly approved");
        }
        else {
            System.out.println("Sorry, you've been declined");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter your salary:");
        int salary = s.nextInt();
        System.out.println("Please enter your credit score:");
        int creditScore = s.nextInt();
        s.close();
        creditCheck(salary,creditScore);
    }
}
