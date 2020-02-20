package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYears = 2;
        Scanner s = new Scanner(System.in);

        System.out.println("What is your salary?");
        int salary = s.nextInt();

        System.out.println("How long have you worked at your current job?");
        int yearsWorked = s.nextInt();

        s.close();

        if (salary >= requiredSalary && yearsWorked >= requiredYears) {
            System.out.println("Congratulations! You qualified for a loan");
        } else if (salary < requiredSalary) {
            System.out.printf("Sorry, in order to qualify for a loan, your current salary must be at least $%d", requiredSalary);
        }
        else if (yearsWorked < requiredYears) {
            System.out.printf("Sorry, in order to qualify for a loan, you are required to work at least %d years at your current employer",requiredYears);
        }

    }
}
