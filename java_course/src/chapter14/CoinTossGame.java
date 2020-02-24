package chapter14;

import chapter8.Password;
import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class CoinTossGame {
    private static Coin coin;
    private static Scanner s;
    public static String getGuess() {
        Scanner s;
        s = new Scanner(System.in);
        String guess;
        System.out.println("What is your guess (heads/tails)");
        guess = s.next();
        while (!guess.equalsIgnoreCase(Coin.HEADS)
                && !guess.equalsIgnoreCase(Coin.TAILS)) {
            System.out.println("Please enter a valid guess (heads/tails)");
            guess = s.next();
        }


        s.close();
        return guess;

    }
    public static String getOpposite(String pick) {

        if (pick.equalsIgnoreCase(Coin.HEADS)) {
            return Coin.TAILS;
        }
        return Coin.HEADS;

    }
    public static boolean didIWin(Player player, Coin coin) {
        return player.getGuess().equalsIgnoreCase(coin.getSide());
    }

    public static void printPlayerChoice(Player player) {
        System.out.println("Player [" + player.getName() + "] chose [" + player.getGuess() + "]");
    }


    public  static void main(String[] args) {
        coin = new Coin();
        coin.flip();

        Player doua = new Player("Doua");
        Player wai = new Player();
        wai.setName("wai");


        doua.setGuess(getGuess());
        wai.setGuess(getOpposite(doua.getGuess()));

        coin.getSide();
        printPlayerChoice(doua);
        printPlayerChoice(wai);

        if(didIWin(doua,coin)) {
            System.out.println("Congrats: " + doua.getName());
        } else if (didIWin(wai,coin)){
            System.out.println("Congrats: " + wai.getName());
        } else {
            System.out.println("Oops! Something went wrong. No one won!");
        }

    }
}
