package chapter8;

public class AddingSpaces {
    public static void addSpace(String sentence) {
        var str = new StringBuilder(sentence);

        for (int i = 1; i < str.length(); i ++) {
            if (Character.isUpperCase(str.charAt(i))) {
                str.insert(i," ");
                i ++;
            }
        }

        System.out.println(str);
    }

    public static void main(String[] args) {
        String sentence = "ThisIsSomethingThatNeedsSpaces";
        addSpace(sentence);
    }
}
