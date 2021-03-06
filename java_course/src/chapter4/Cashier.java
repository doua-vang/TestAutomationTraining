package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of items you would you like to scan:");
        Scanner s = new Scanner(System.in);
        int quantity = s.nextInt();
        double total = 0;

        for(int i = 1; i <= quantity; i ++) {
            System.out.println("Enter cost of item " + i + ":");
            total += s.nextDouble();
        }

        s.close();

        System.out.print("The cost of all items is: " + String.format("$%.2f",total));
    }
}

