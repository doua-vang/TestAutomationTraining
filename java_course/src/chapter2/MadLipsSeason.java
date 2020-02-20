package chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class MadLipsSeason {

    public static boolean   exists(String[] array, String val) {
        boolean exist = false;

        for (int i = 0; i < array.length; i ++) {
            if (array[i].compareToIgnoreCase(val) == 0) {
                exist = true;
            }
        }
        return exist;
    }

    public static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] seasons = {"fall","winter","spring","summer"};
        String season, num, adj;

        //1. Get the seasons
        System.out.println("Enter a season:");
        while (!exists(seasons,(season = s.next()))) {
            System.out.println("Please enter a valid season " + Arrays.toString(seasons) + " :");
        }

        //2. Get a whole numnber
        System.out.println("Enter a whole number:");
        while (!isDouble((num = s.next())) || Double.parseDouble(num) % 1 != 0) {
            System.out.println("Please enter a valid whole number:");
        }
        int wholeNum = Integer.parseInt(num);

        //3. Get an adjective
        System.out.println("Enter an adjective:");
        adj = s.next();

        //4. print results;
        System.out.printf("On a %s %s day, I drink a minimum of %d cups of coffee",
                adj,season,wholeNum);

    }
}
