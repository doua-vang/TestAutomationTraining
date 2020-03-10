package games;

import java.util.Random;
import java.util.Scanner;

public class GoatGame {
    private static Scanner s;
    private static int winningDoor;
    private static int [] doors;
    private static final int MAX_DOORS = 3;
    private static final int WINNER = 1;
    private static final int LOSER = 0;
    private static int chosenDoor;
    private static int [] goats;
    private static final int doorsSum = 6;
    private static int revealedDoor;
    private static boolean playAgain;
    private static final boolean YES = true;
    private static final boolean NO = false;

    public static void getDoor() {
        System.out.println("Which door will you choose? (1,2,3)");
        chosenDoor = s.nextInt();

        while (chosenDoor > 3) {
            System.out.println("Please choose a valid door (1,2,3)");
            chosenDoor = s.nextInt();
        }
    }

    public static void doorSetUp() {
        winningDoor = (new Random()).nextInt(3) + 1;
        int goatCounter = 0;
        for (int i = 0; i < doors.length; i ++) {
            if (i == (winningDoor - 1)) {
                doors[i] = WINNER;
            }
            else {
                doors[i] = LOSER;
                goats[goatCounter] = i + 1;
                goatCounter ++;
            }
        }
    }

    public static void revealADoor() {
        revealedDoor = (new Random()).nextInt(2);
        if (goats[revealedDoor] == chosenDoor) {
            if (revealedDoor == 1) {
                revealedDoor --;
            }
            else {
                revealedDoor ++;
            }
        }

        System.out.println("We will reveal to you now a door that does not contain the car");
        System.out.println("The following door has a goat: " + goats[revealedDoor]);
        System.out.println("You have chosen door: " + chosenDoor);
        switchDoors(goats[revealedDoor]);
    }

    public static String getValidResponse(String request) {
        String answer = request;

        while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N")) {
            System.out.println("Please enter a valid response (Y or N)");
            answer = s.next();
        }

        return answer;
    }

    public static void switchDoors(int incorrectDoor) {
        System.out.println("Would you like to switch your door? (Y or N)");
        String answer = s.next();

        answer = getValidResponse(answer);

        if (answer.equalsIgnoreCase("Y")) {
            chosenDoor = doorsSum - chosenDoor - incorrectDoor;
            System.out.println("Door switched to: " + chosenDoor);
        }
    }

    public static boolean didIWin() {
        return doors[chosenDoor - 1] == WINNER;
    }

    public static void printEndingStatement() {
        if(didIWin()) {
            System.out.println("Congratulations, you win a brand new car!");
        }
        else {
            System.out.println("Sorry you did not win a new car, try again next time");
        }
    }

    public static void playAgain() {
        System.out.println("Would you like to play again? (Y or N)");
        String answer = s.next();
        answer = getValidResponse(answer);

        if (answer.equalsIgnoreCase("Y")) {
            playAgain = YES;
        }
        else {
            System.out.print("Thanks for playing, have a good day!");
            playAgain = NO;
        }
    }

    public static void welcomeStatement() {
        System.out.println("Welcome to the Goat Game");
        System.out.println("Behind door 1, 2, or 3 will contain a brand-new car");
        System.out.println("All other doors will contain a goat");
    }
    public static void main(String [] args) {
        doors = new int[MAX_DOORS];
        goats = new int[MAX_DOORS - 1];
        playAgain = YES;

        s = new Scanner(System.in);

        while (playAgain) {
            welcomeStatement();
            doorSetUp();
            getDoor();
            revealADoor();
            printEndingStatement();
            playAgain();;
        }

    }
}
