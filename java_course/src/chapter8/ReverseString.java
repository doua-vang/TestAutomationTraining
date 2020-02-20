package chapter8;

public class ReverseString {
    public static void reverseString(String sentence) {
        for(int i = sentence.length() - 1; i >= 0; i --) {
            System.out.print(sentence.charAt(i));
        }
    }

    public static void main(String[] args) {
        String sentence = "I love test autiomation univesity";
        System.out.println(sentence);
        reverseString(sentence);
    }
}
