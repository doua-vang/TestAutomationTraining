package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Grades {
    private static double[] grades;
    private static Scanner s = new Scanner(System.in);

    public static double getAverage() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }

        return total / grades.length;
    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i ++) {
            System.out.print("Enter the " + (i + 1) + " grade: ");
            grades[i] = s.nextDouble();
        }
    }

    public static double getHightestGrade() {
        return grades[grades.length - 1];
    }

    public static double getLowestGrade() {
        return grades[0];
    }

    public static void main(String[] args) {
        System.out.println("How many grades are there?");
        grades = new double[s.nextInt()];

        getGrades();
        Arrays.sort(grades);
        s.close();
        double average = getAverage();
        double highestGrade = getHightestGrade();
        double lowestGrade = getLowestGrade();

        System.out.println("The average score was: " + String.format("%.2f",average));
        System.out.println("The highest score was: " + String.format("%.2f",highestGrade));
        System.out.println("The lowest score was: " + String.format("%.2f",lowestGrade));






    }
}
