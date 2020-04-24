package dailyproblems;

import dailyproblems.problems.CheckParenthesesInProgram;
import dailyproblems.problems.LongestSubstringWithoutRepetition;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        int solution = LongestSubstringWithoutRepetition.solution("ASDF");
        System.out.println("solution: " + solution);


        boolean solution2 = CheckParenthesesInProgram.solution("{{}}}");
        System.out.println("solution2: " + solution2);
    }
}
