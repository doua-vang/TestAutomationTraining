package chapter4;

import java.util.Random;

public class RollTheDiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        int die;// = random.nextInt(6) + 1;
        int turns = 5;
        int maxSpace = 20;
        int currentCount = 0;

        for (int i = 1; currentCount < 20 && i <= turns; i ++) {
            die = random.nextInt(6) + 1;
            currentCount += die;
            String message = "Roll #" + (i + 1) + ": You've rolled a " + die + ".";
            if(currentCount == maxSpace) {
                System.out.println(message + " Congrats, you win!");
            }
            else if (currentCount > maxSpace){
                System.out.println(message + " You went over " + maxSpace);
            }
            else if ((i == turns) && (currentCount < maxSpace)){
                System.out.println(message + " You are now on space " + currentCount + ". You did not reach " + maxSpace + " in " + turns + " turns");
            }
            else {
                System.out.println(message + " You are now on space " + currentCount + " and have " + (maxSpace - currentCount) + " more to go.");
            }

        }


    }
}
