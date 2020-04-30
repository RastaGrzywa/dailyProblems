package dailyproblems.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortListWith3UniquesTest {

    private static List<Integer> sortedList = Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3);

    @Test
    public void testSort1() {
        List<Integer> arrayToSort = Arrays.asList(3,2,1,1,1,2,3,2);
        assertEquals(sortedList,SortListWith3Uniques.solution(arrayToSort));
    }
    @Test
    public void testSort2() {
        List<Integer> arrayToSort = Arrays.asList(1,3,2,1,1,2,3,2);
        assertEquals(sortedList,SortListWith3Uniques.solution(arrayToSort));
    }
    @Test
    public void testSort3() {
        List<Integer> arrayToSort = Arrays.asList(1,1,1,2,3,3,2,2);
        assertEquals(sortedList,SortListWith3Uniques.solution(arrayToSort));
    }
    @Test
    public void testSort4() {
        List<Integer> arrayToSort = Arrays.asList(3,2,2,3,2,1,1,1);
        assertEquals(sortedList,SortListWith3Uniques.solution(arrayToSort));
    }
}
