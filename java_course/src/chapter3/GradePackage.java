package chapter3;

import java.util.Scanner;

public class GradePackage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade:");
        Scanner s = new Scanner(System.in);
        String grade = s.next();
        String message;

        switch(grade){
            case "A":
                message = "Excellent Job!";
                break;
            case "B":
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "You need to try harder";
                break;
            case "F":
                message = "You should really try harder";
                break;
            default:
                message = "Something went wrong";
        }

        System.out.println(message);


    }
}
