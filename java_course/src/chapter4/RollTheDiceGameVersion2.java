package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollTheDiceGameVersion2 {
    private static Scanner s;
    private static String[] players;
    private static String[] listOfPlayers;
    private static int[] position;
    private static final int MAX_NUM_OF_PLAYERS = 5;
    private static final int MIN_NUM_OF_PLAYERS = 2;
    private static final int NUM_OF_DIE_SIDES = 6;// numOfSides = 6;
    private static final int MAX_NUM_TO_REACH = 20;

    public static void setAmountOfPlayers() {
        System.out.println("How many players are playing?");
        int numOfPlayers = s.nextInt();

        while(numOfPlayers < MIN_NUM_OF_PLAYERS || numOfPlayers > MAX_NUM_OF_PLAYERS) {
            System.out.println("Please enter a valid number of players (2-5)");
            numOfPlayers = s.nextInt();
        }

        players = new String[numOfPlayers];
        listOfPlayers = new String[numOfPlayers];
        position = new int[numOfPlayers];

        for (int i = 1; i <= numOfPlayers; i ++) {
            System.out.println("Enter the player #" + i + "'s name:");
            String name = s.next();
            players[i-1] = name;
        }
    }

    public static int getCurrentPosition() {
        System.out.println("Would you like to roll or stay?");
        Random random = new Random();
        String command = "";
        command = s.next();
        int turn = 1;
        int currentLocation = 0;
        while(currentLocation < MAX_NUM_TO_REACH && !command.equalsIgnoreCase("stay")) {
            int die = random.nextInt(NUM_OF_DIE_SIDES) + 1;
            currentLocation = die + currentLocation;
            printTurnMessage(turn, die, currentLocation);

            if (currentLocation > MAX_NUM_TO_REACH) break;

            turn ++;
            System.out.println("Would you like to roll or stay?");
            command = s.next();
        }

        return currentLocation;
    }

    public static void printTurnMessage(int turn, int die, int currentCount) {
        String message = "Roll #" + turn + ": You've rolled a " + die + ".";
        String secondMessage = " You are now on space " + currentCount;

        if(currentCount == MAX_NUM_TO_REACH) {
            System.out.println(message + " Congrats, you win!");
        }
        else if (currentCount > MAX_NUM_TO_REACH){
            System.out.println(message + " You went over " + MAX_NUM_TO_REACH);
        }
        else {
            System.out.println(message + secondMessage + " and have " + (MAX_NUM_TO_REACH - currentCount) + " more to go.");
        }


    }

    public static void main(String[] args) {
        s = new Scanner(System.in);
        setAmountOfPlayers();
        for(int i = 0; i < players.length; i ++) {
            System.out.println(players[i] + " is going");
            position[i] = getCurrentPosition();
        }


        s.close();

    }
}
