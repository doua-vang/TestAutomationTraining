package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    //calc tax
    public static double tax(double total) {
        double tax = .15;
        return total * tax;
    }

    //calc overage
    public static double overageCost(double minutes) {
        double cost = .25;
        return minutes * cost;
    }

    public static void printItemizedBill(double planCost, double overageCost, double taxCost) {
        double totalCost = planCost + overageCost + taxCost;

        System.out.println("Phone Bill Statement:");
        System.out.println("Plan: " + String.format("$%.2f", planCost));
        System.out.println("Overage: " + String.format("$%.2f", overageCost));
        System.out.println("Tax: " + String.format("$%.2f", taxCost));
        System.out.println("Total: " + String.format("$%.2f", totalCost));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter base cost of the plan:");
        double cost = s.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = s.nextInt();
        s.close();
        double overageCost = overageCost(overageMinutes);
        double planTotalCost = overageCost + cost;
        double tax = tax(planTotalCost);
        printItemizedBill(cost, overageCost,tax);

    }
}
