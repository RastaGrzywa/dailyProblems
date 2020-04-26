package dailyproblems.problems;

import java.util.LinkedList;

public class ReverseLinkedList {

    // Given a singly-linked list, reverse the list. This can be done iteratively or recursively. Can you get both solutions?

    public static LinkedList<Integer> solution(LinkedList<Integer> list){
        LinkedList<Integer> returnedList = new LinkedList<>();
        list.forEach(item -> {
            returnedList.addFirst(item);
        });
        return returnedList;
    }

    public static LinkedList<Integer> recursiveSolution(LinkedList<Integer> list, LinkedList<Integer> target){
        if (list.size() == 0){
            return target;
        }
        target.addFirst(list.removeFirst());
        return recursiveSolution(list, target);
    }
}
