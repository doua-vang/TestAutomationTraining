package chapter8;

public class Password {
    private static String oldPassword;
    private static String username;
    private static String password;
    private static final int PASSWORD_LENGTH = 8;
    
    public Password(String username, String password) {
        Password.username = username;
        Password.oldPassword = " ";
        Password.password = password;
    }
    
    public Password() {
        Password.username = "default";
        Password.password = "password";
        Password.oldPassword = " ";
    }

    public void changePassword(String newPassword) {
        Password.oldPassword = Password.password;
        Password.password = newPassword;


    }
    
    public void setPassword(String password) {
        changePassword(password);
    }

    public static String getOldPassword() {
        return oldPassword;
    }
    public static String getPassword() {
        return password;
    }
    public static String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private static boolean containsUserName(String password) {
        return password.toLowerCase().indexOf(username.toLowerCase()) != -1;
    }

    private static boolean atLeastEightCharacters(String password) {
        return password.length() >= PASSWORD_LENGTH;
    }

    private static boolean samePassword(String newPassword) {
        return password.equals(newPassword);
    }

    private static boolean containsSpecialCharacter(String password) {
        String specialCharacters = "\\ !#$%&'()*+,-./:;<=>?@[]^_`{|}~";

        for (char letter : password.toCharArray()) {
            if (specialCharacters.indexOf(letter) != -1) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsUpperCase(String password) {
        for (char letter : password.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidPassword(String password) {
        boolean isValid = !samePassword(password) && !containsUserName(password) &&
                atLeastEightCharacters(password) && containsUpperCase(password) &&
                containsSpecialCharacter(password);

        if (!isValid) {
            System.out.println("Password [" + password + "] is invalid!");
        }
        else {
            System.out.println("Password [" + password + "]is valid. Password set!");
        }

        return isValid;
    }

}
