package chapter8;

public class TextProcessor {
    public static void countWords(String sentence) {
        String[] words = sentence.split(" ");
        System.out.println("The sentence has " + words.length + " word(s)");

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String sentence = "I love test autiomation univesity";
        countWords(sentence);
    }
}
