package chapter6;

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String[] args) {
        PhoneBill firstPhoneBill = new PhoneBill();
        firstPhoneBill.printItemizedBill();

        PhoneBill secondPhoneBill = new PhoneBill(1,500,900,50);
        secondPhoneBill.printItemizedBill();

        PhoneBill thirdPhoneBill = new PhoneBill(4);
        thirdPhoneBill.setBaseCost(600);
        thirdPhoneBill.setBaseCost(250);
        thirdPhoneBill.setAllottedMinutes(1000);
        thirdPhoneBill.setMinutesUsed(1100);
        thirdPhoneBill.printItemizedBill();



    }
}
