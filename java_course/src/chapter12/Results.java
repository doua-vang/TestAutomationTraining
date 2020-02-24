package chapter12;

import java.util.Map;

public class Results {

    public static void main(String[] args) {
        TestResults testResults = new TestResults();

        Map<String, Integer> finalGrades = TestResults.getOriginalGrades();
        Map<String, Integer>  makeUpGrades = testResults.getMakeUpGrades();


        finalGrades.forEach((k,v)-> {
                if (finalGrades.get(k) < makeUpGrades.get(k)) {
                    finalGrades.put(k,makeUpGrades.get(k));
                }
            }
        );

        finalGrades.forEach((k,v)->
            System.out.println(k + " received a " + v));


    }
}
