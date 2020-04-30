package dailyproblems.problems;

import java.util.ArrayList;
import java.util.List;

public class SortListWith3Uniques {
    //Given a list of numbers with only 3 unique numbers (1, 2, 3), sort the list in O(n) time.
    public static List<Integer> solution(List<Integer> list){
        int secondValueIndex = 0;
        List<Integer> returnedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int item = list.get(i);
            if (returnedList.isEmpty()){
                returnedList.add(item);
                secondValueIndex++;
                continue;
            }
            if (item <= returnedList.get(0)){
                if (item < returnedList.get(0)){
                    secondValueIndex--;
                }
                returnedList.add(0, item);
                secondValueIndex++;
                continue;
            }
            if (item > returnedList.get(0) && item >= returnedList.get(returnedList.size() - 1)){
                returnedList.add(item);
                continue;
            }
            if (item > returnedList.get(0) && item < returnedList.get(returnedList.size() - 1)){
                returnedList.add(secondValueIndex, item);
                secondValueIndex++;
                continue;
            }
        }
        return returnedList;
    }
}
