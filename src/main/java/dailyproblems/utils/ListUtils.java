package dailyproblems.utils;

import java.util.List;

public class ListUtils {

    public static void printLinkedList(List list){
        list.forEach(item -> {
            System.out.print( item );
            if (list.indexOf(item) != list.size() - 1){
                System.out.print( " -> ");
            }
        });
        System.out.println();
    }
    public static String printList(List list){
        String returnedString = "";
        for (int i = 0; i < list.size(); i++) {
            returnedString += list.get(i);
            if (i != list.size() - 1){
                returnedString += ", ";
            }
        }
        return returnedString;
    }
}
