package chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;
    private double totalUnTaxed;
    private double totalTaxed;

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public PhoneBill(int id) {
        this.id = id;
        this.baseCost = 0;
        this.allottedMinutes = 0;
        this.minutesUsed = 0;
    }

    public PhoneBill() {
        this.id = (int) (Math.random()*100);
        this.baseCost = 500;
        this.allottedMinutes = 1000;
        this.minutesUsed = 400;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public int minutesOver() {
        return Math.max(this.minutesUsed - this.allottedMinutes, 0);
    }

    public double overageCost() {
        double overageCharge = .25;
        return minutesOver() * overageCharge;
    }

    public double getTotalUnTaxed() {
        return baseCost + overageCost();
    }

    public double getTaxes() {
        double tax = .15;
        return getTotalUnTaxed() * tax;
    }

    public double getTotalPhoneBill() {
        return getTotalUnTaxed() + getTaxes();
    }

    public void printItemizedBill() {
        double totalCost = getTotalPhoneBill();

        System.out.println("Phone Bill Statement:");
        System.out.println("Phone Bill Id: " + id);
        System.out.println("Plan: " + String.format("$%.2f", baseCost));
        System.out.println("Overage: " + String.format("$%.2f", overageCost()));
        System.out.println("Tax: " + String.format("$%.2f", getTaxes()));
        System.out.println("Total: " + String.format("$%.2f", totalCost));
    }


}
