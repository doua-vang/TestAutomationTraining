package chapter8;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is your username");
        Password pass = new Password();
        String username = s.next();
        String password;
        System.out.println("What is your password");
        password = s.next();

        while (!Password.isValidPassword(password)) {
            System.out.println("Please enter a valid password:");
            password = s.next();
        }

        Password user = new Password(username, password);

        System.out.println("Now let's change your password");
        System.out.println("Please enter a new password:");
        String newPassword = s.next();

        while (!user.isValidPassword(newPassword)) {
            System.out.println("Please enter a valid password:");
            newPassword = s.next();
        }
        s.close();

        user.changePassword(newPassword);




    }
}
