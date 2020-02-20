package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int minCredit = 700;
    static int minSalary = 25000;
    static double salary = 0;
    static int creditScore = 0;

<<<<<<< HEAD
    static Scanner s = new Scanner(System.in);
=======
    public static void creditCheck(int salary, int credit) {
>>>>>>> 2a605842371ebe84d0eb4f0637843ef5cdfb52e5

    public static void creditCheck(int salary, int credit) {
        if (salary >= minSalary && credit >= minCredit) {
            System.out.println("Congrats! You've been instantly approved");
        }
        else {
            System.out.println("Sorry, you've been declined");
        }
    }

    public static boolean isQualified() {
        if (salary >= minSalary && creditScore >= minCredit) {
            return true;
        }
        return false;
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
        int salary = s.nextInt();
        return salary;
    }
    public static int getCreditScore() {
        System.out.println("Please enter your credit score:");
        int creditScore = s.nextInt();
        return creditScore;
    }

    public static void main(String[] args) {
        salary = getSalary();
        creditScore = getCreditScore();
        s.close();
        boolean isQualified = isQualified();
        printApproval(isQualified);
    }
}
