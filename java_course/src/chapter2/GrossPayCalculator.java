package chapter2;

import java.util.*;

public class GrossPayCalculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        int hours = s.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = s.nextDouble();

        //3. Multiply hours and pay rate
        double grossPay = rate * hours;

        //4. Display results
        System.out.println("The employee's gross pay is $" + grossPay);

        s.close();
    }
}
