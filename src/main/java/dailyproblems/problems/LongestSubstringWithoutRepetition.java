package dailyproblems.problems;

import java.util.HashSet;

public class LongestSubstringWithoutRepetition {

    // Given a string, find the length of the longest substring without repeating characters.

    public static int solution(String text){
        if (text == null) return 0;

        int length = 0;
        int temp = 0;
        char[] textChars = text.toCharArray();
        HashSet<Character> characters = new HashSet<>();
        for (char textChar : textChars) {
            if (characters.contains(textChar)) {
                if (temp > length) {
                    length = temp;
                    temp = 1;
                    characters.clear();
                    characters.add(textChar);
                }
            } else {
                characters.add(textChar);
                temp++;
            }
        }
        if (temp > length) {
            length = temp;
        }
        return length;
    }
}
