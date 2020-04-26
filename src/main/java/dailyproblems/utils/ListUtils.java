package dailyproblems.utils;

import java.util.List;

public class ListUtils {

    public static void printList(List list){
        list.forEach(item -> {
            System.out.print( item );
            if (list.indexOf(item) != list.size() - 1){
                System.out.print( " -> ");
            }
        });
        System.out.println();
    }
}
