package chapter4;

import java.util.Random;

public class RollTheDiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        int die;
        int numOfSides = 6;
        int turns = 5;
        int maxSpace = 20;
        int currentCount = 0;

        for (int i = 1; currentCount < maxSpace && i <= turns; i ++) {
            die = random.nextInt(numOfSides) + 1;
            currentCount += die;
            String message = "Roll #" + i + ": You've rolled a " + die + ".";
            String secondMessage = " You are now on space " + currentCount;

            if(currentCount == maxSpace) {
                System.out.println(message + " Congrats, you win!");
            }
            else if (currentCount > maxSpace){
                System.out.println(message + " You went over " + maxSpace);
            }
            else if (i == turns){
                System.out.println(message + secondMessage + ". You did not reach " + maxSpace + " in " + turns + " turns");
            }
            else {
                System.out.println(message + secondMessage + " and have " + (maxSpace - currentCount) + " more to go.");
            }

        }


    }
}
