package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = s.next();
        char letter;
        char letterToFind;

        boolean hasLetter = false;
        for (int i = 0; i < word.length(); i ++) {
            letter = word.charAt(i);
            if (Character.toLowerCase(letter) == 'a') {
                hasLetter = true;
            }
        }

        if(hasLetter) {
            System.out.println("The word [" + word + "] has an A");
        } else {
            System.out.println("The word [" + word + "] does not have an A");
        }
    }
}
