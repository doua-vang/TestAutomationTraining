package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static String[] daysOfTheWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    private static final int FIRST_DAY_OF_WEEK = 1;
    private static final int LAST_DAY_OF_WEEK = 7;

    public static String getDayOfWeek (int dayOfWeek) {
        if (dayOfWeek < FIRST_DAY_OF_WEEK || dayOfWeek > LAST_DAY_OF_WEEK ) {
            return "Invalid day of week";
        }
        return daysOfTheWeek[dayOfWeek--];
    }

    public static void printDayOfWeek(String dayOfWeek) {
        System.out.println("The day of the week is: " + dayOfWeek);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter a day of the week (1-7)");
        int numDayOfWeek = s.nextInt();
        s.close();

        String dayOfWeek = getDayOfWeek(numDayOfWeek);
        printDayOfWeek(dayOfWeek);

    }
}
