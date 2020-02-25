package chapter14;

import chapter8.Password;
import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class CoinTossGameInfiniteNumber {
    private static Player[] players;
    private static Coin coin;
    private static Scanner s;
    public static String getGuess() {
        String guess;
        System.out.println("What is your guess (heads/tails)");
        guess = s.next();
        while (!guess.equalsIgnoreCase(Coin.HEADS)
                && !guess.equalsIgnoreCase(Coin.TAILS)) {
            System.out.println("Please enter a valid guess (heads/tails)");
            guess = s.next();
        }

        return guess;

    }
    public static boolean didIWin(Player player, Coin coin) {
        return player.getGuess().equalsIgnoreCase(coin.getSide());
    }

    public static void printPlayerChoice(Player player) {
        System.out.println("Player [" + player.getName() + "] chose [" + player.getGuess() + "]");
    }

    public static void printWinner() {
        for (Player player : players) {
            if (didIWin(player,coin)) {
                System.out.println("Congrats [" + player.getName() + "], you won!");
            }
        }
    }
    public static boolean isInt(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Value entered [" + number + "] is not an int");
            return false;
        }
    }


    public static void whoIsAllPlaying() {
        s = new Scanner(System.in);

        System.out.println("How many people are playing?");
        String num = s.next();

        while (!isInt(num)) {
            num = s.next();
        }

        int amountOfPlayers = Integer.parseInt(num);

        players = new Player[amountOfPlayers];

        for (int i = 0; i < amountOfPlayers; i ++) {
            System.out.println("Please the name of player #" + (1 + i));
            String name = s.next();
            players[i] = new Player(name);
            players[i].setGuess(getGuess());
        }

        s.close();



    }

    public static void printMyResults(Player player) {
        if (didIWin(player,coin)) {
            System.out.println("Congrats [" + player.getName() + "], you won!");
        }
    }

    public  static void main(String[] args) {
        coin = new Coin();
        coin.flip();
        whoIsAllPlaying();
        System.out.println("The coin side is [" + coin.getSide() + "]");

        for (Player player : players) {
            printPlayerChoice(player);

        }

        for (Player player : players) {
            printMyResults(player);
        }

    }
}
