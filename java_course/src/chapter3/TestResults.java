package chapter3;

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your score:");
        double score  = s.nextDouble();
        s.close();
        char grade;

        if (score >= 90) {
            grade = 'A';
        }
        else if (score >= 80) {
            grade = 'B';
        }
        else if (score >= 70) {
            grade = 'C';
        }
        else if (score >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        System.out.println("Your grade is " + grade);

    }
}
