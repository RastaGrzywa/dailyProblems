package dailyproblems.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckParenthesesInProgram {

    //Imagine you are building a compiler. Before running any code, the compiler must check that the parentheses in the program are balanced.
    // Every opening bracket must have a corresponding closing bracket. We can approximate this using strings.
    //
    //Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    //An input string is valid if:
    //- Open brackets are closed by the same type of brackets.
    //- Open brackets are closed in the correct order.
    //- Note that an empty string is also considered valid.

    private static final List<Character> LEFT_BRACKETS = Arrays.asList('(', '{', '[');
    private static final List<Character> RIGHT_BRACKETS = Arrays.asList( ')', '}', ']');

    public static boolean solution(String text) {
        if (text == null) return false;
        if (text.equals("")) return true;

        int readedNumerator = 0;
        char[] textChars = text.toCharArray();
        List<Character> readedChars = new ArrayList<>();

        for (char textChar : textChars) {
            if (RIGHT_BRACKETS.contains(textChar)) {
                if (readedChars.size() == 0){
                    return false;
                }
                if (LEFT_BRACKETS.indexOf(readedChars.get(readedNumerator - 1)) == RIGHT_BRACKETS.indexOf(textChar)) {
                    readedChars.remove(readedNumerator - 1);
                    readedNumerator--;
                } else {
                    break;
                }
            } else {
                readedChars.add(textChar);
                readedNumerator++;
            }
        }
        if (readedNumerator > 0) return false;

        return true;
    }

}
