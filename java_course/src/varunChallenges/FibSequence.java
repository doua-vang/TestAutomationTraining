package varunChallenges;

import chapter3.SalaryCalculator;

import java.util.Scanner;

public class FibSequence {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a mumber: ");

        System.out.println("The number is a fib number: " + isFib(s.nextInt()));


    }
    public static boolean isFib(int x) {
        if (x==1 || x==0) {
            return true;
        }
        int pos = 1;
        int total = x;
        while (x > 0) {
            total -= fib(pos);
            pos ++;
        }
        return total == 0;

    }

    public static int fib(int x) {
        switch (x) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fib(x - 1) + fib(x - 2);
        }
    }
}
