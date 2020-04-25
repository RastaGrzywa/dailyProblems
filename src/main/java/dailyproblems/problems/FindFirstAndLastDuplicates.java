package dailyproblems.problems;

public class FindFirstAndLastDuplicates {

    // Given a sorted array, A, with possibly duplicated elements, find the indices of the first and last occurrences of a target element, x. Return -1 if the target is not found.

    public static long[] solution(long[] array, long target){
        long[] returedValues = {-1, -1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target){
                if (returedValues[0] == -1){
                    returedValues[0] = i;
                }
                returedValues[1] = i;
            }
        }
        return  returedValues;
    }
}
