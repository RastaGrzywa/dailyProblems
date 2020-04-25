package dailyproblems;

import dailyproblems.problems.CheckParenthesesInProgram;
import dailyproblems.problems.FindFirstAndLastDuplicates;
import dailyproblems.problems.LongestSubstringWithoutRepetition;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        int solution = LongestSubstringWithoutRepetition.solution("ASDF");
        System.out.println("solution: " + solution);


        boolean solution2 = CheckParenthesesInProgram.solution("{{}}}");
        System.out.println("solution2: " + solution2);

        long[] array = {1, 3, 25, 1, 5, 6};
        long[] solution3 = FindFirstAndLastDuplicates.solution(array, 2);
        System.out.println("solution3: [" + solution3[0] + ", " + solution3[1] + "]");

    }
}
