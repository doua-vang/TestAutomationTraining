package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        int sales;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of sales you made this week:");

        while (true) {
            try {
                sales = Integer.parseInt(s.next()); ///.nextInt();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid sales number:");
            }
        }
        s.close();

        if (sales >= quota) {
            System.out.println("Congrats! You've met your quota");
        }
        else {
            System.out.println("You did not make your quota. You were " + (quota - sales) + " sales short");
        }
    }
}
