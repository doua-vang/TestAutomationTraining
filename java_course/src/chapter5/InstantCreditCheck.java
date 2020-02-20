package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int minCredit = 700;
    static int minSalary = 25000;
    static double salary = 0;
    static int creditScore = 0;
    static Scanner s = new Scanner(System.in);

    public static void creditCheck(int salary, int credit) {
        if (salary >= minSalary && credit >= minCredit) {
            System.out.println("Congrats! You've been instantly approved");
        }
        else {
            System.out.println("Sorry, you've been declined");
        }
    }

    public static boolean isQualified() {
        return salary >= minSalary && creditScore >= minCredit;
    }

    public static void printApproval(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats! You've been instantly approved");
        }
        else {
            System.out.println("Sorry, you've been declined");
        }

    }
    public static double getSalary() {
        System.out.println("Please Enter your salary:");
        return s.nextInt();
    }
    public static int getCreditScore() {
        System.out.println("Please enter your credit score:");
        return s.nextInt();
    }

    public static void main(String[] args) {
        salary = getSalary();
        creditScore = getCreditScore();
        s.close();
        boolean isQualified = isQualified();
        printApproval(isQualified);
    }
}
