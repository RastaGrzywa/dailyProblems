package dailyproblems;

import dailyproblems.problems.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static dailyproblems.utils.ListUtils.printLinkedList;
import static dailyproblems.utils.ListUtils.printList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        int solution = LongestSubstringWithoutRepetition.solution("ASDF");
        System.out.println("solution: " + solution);

        boolean solution2 = CheckParenthesesInProgram.solution("{{}}");
        System.out.println("solution2: " + solution2);

        long[] array = {1, 3, 2, 1, 5, 2};
        long[] solution3 = FindFirstAndLastDuplicates.solution(array, 2);
        System.out.println("solution3: [" + solution3[0] + ", " + solution3[1] + "]");

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4));
        LinkedList<Integer> solution4 = ReverseLinkedList.solution(linkedList);
        printLinkedList(linkedList);
        System.out.print("iteratively: ");
        printLinkedList(solution4);
        LinkedList<Integer> solution5 = ReverseLinkedList.recursiveSolution(linkedList, new LinkedList<>());
        System.out.print("recursively: ");
        printLinkedList(solution5);

        List<Integer> solution6 = SortListWith3Uniques.solution(Arrays.asList(3,2,1,1,3,1,2,3,1,2,2,1,3));
        System.out.println(printList(solution6));

    }

}
