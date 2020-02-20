package chapter8;

public class PasswordValidator {
    private static String oldPassword;
    private static String username;
    private static String password;
    private static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {
        oldPassword = "something";
        username = "dvang";
        password = "dvangsomething";

    }

    public static boolean containsUserName() {
        return password.indexOf(username) != -1;
    }

    public static boolean atLeastEightCharacters() {
        return password.length() >= PASSWORD_LENGTH;
    }

    public static boolean samePassword() {
        return password.equals(oldPassword);
    }

   /* public static boolean containsSpecialCharacter() {
       // String specialCharacters = "!#$%&'()*+,-.\/:;<=>?@[\]^_`{|}~";
        for (char letter : password.toCharArray()) {
            if (specialCharacters.indexOf(letter) != -1) {
                return true;
            }
        }
        return false;
    }*/

    public static boolean containsUpperCase() {
        for (char letter : password.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                return true;
            }
        }
        return false;
    }

}
