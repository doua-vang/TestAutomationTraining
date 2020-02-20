package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {
        double quarter = .25;
        double dime = .1;
        double nickel = .05;
        double penny = .01;
        double numOfPennies, numOfNickels, numOfDimes, numOfQuarters;
        double dollarValue = 1;
        DecimalFormat df = new DecimalFormat("###.##");

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Change for a Dollar Game");

        //Get num of pennies
        System.out.println("How many pennies would you like?");
        numOfPennies = s.nextInt();

        //Get num of nickels
        System.out.println("How many nickels would you like?");
        numOfNickels = s.nextInt();


        //Get num of dimes
        System.out.println("How many dimes would you like?");
        numOfDimes = s.nextInt();

        //Get num of quarters
        System.out.println("How many quarters would you like?");
        numOfQuarters = s.nextInt();

        double total = (numOfPennies * penny) + (numOfNickels * nickel) +
                (numOfDimes * dime) + (numOfQuarters * quarter);

        if (total == dollarValue) {
            System.out.println("Excellent, you got exactly $" + df.format(dollarValue));
        }
        else if (total > dollarValue) {
            System.out.println("Sorry, you were over $" + df.format(total - dollarValue));
        }
        else {
            System.out.println("Sorry, you were under $" + df.format(dollarValue - total));
        }

    }
}
