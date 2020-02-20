package chapter7;

import java.awt.*;
import java.util.*;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUM = 69;

    public static boolean exists(int[] array, int value) {
        for (int val : array) {
            if (val == value) {
                return true;
            }
        }

        return false;
    }
    public static int[] getLotteryTicket() {
        int[] lotteryTicket = new int[LENGTH];
        Random rand = new Random();

        /*** this section is the code for the first section of 7 before we modified it

        for (int i = 0; i < LENGTH; i ++) {
            lotteryTicket[i] = rand.nextInt(MAX_TICKET_NUM) + 1;
        }
        */

        /***

         */
        int randomNumber;
        for (int i = 0; i < LENGTH; i ++) {
            do {
                randomNumber = rand.nextInt(MAX_TICKET_NUM) + 1;
            }
            while (exists(lotteryTicket, randomNumber));
            lotteryTicket[i] = rand.nextInt(MAX_TICKET_NUM) + 1;
        }

        return lotteryTicket;
    }


    public static void printTicket(int[] ticket) {
        for (int value : ticket) {
            System.out.print(value + " | ");
        }
    }
    public static void main(String[] args){
        int[] lotteryTicket = getLotteryTicket();
        printTicket(lotteryTicket);
    }
}
